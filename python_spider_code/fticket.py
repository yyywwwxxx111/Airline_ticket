# coding=utf-8

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.keys import Keys
from lxml import etree
import re
from sqlalchemy import create_engine
import datetime
import threading

crawl_thread_list = []

class Flight(threading.Thread):
    # 成员变量有html, url, driver
    def __init__(self, id, fp, lock):
        super(Flight, self).__init__()
        self.fp = fp
        self.lock = lock
        self.id = id
        self.urls = []
        self.is_content_null = False
        pass

    def make_url(self, begin, end):
        for i in range((end - begin).days):
            # 遍历每一天day
            day = begin + datetime.timedelta(days=i)

            for x in range(len(citys)):
                for y in range(len(citys)):
                    if x != y:
                        self.urls.append("https://www.ly.com/flights/itinerary/oneway/{}-{}?date={}&fromairport=&toairport=&childticket=0,0"
                         .format(citys[x], citys[y], day))
        # print(self.urls)

    def make_driver(self):
        # 打开浏览器
        options = webdriver.ChromeOptions()
        options.add_argument('lang=zh_CN.UTF-8')
        options.add_argument('--headless')
        self.driver = webdriver.Chrome(chrome_options=options)

    def parse_html(self, url):
        self.driver.implicitly_wait(10)
        self.driver.get(url)
        locator = (By.ID, 'txtAirplaneCity1')
        try:
            locator_content = (By.CLASS_NAME, 'dataContainter')
            WebDriverWait(self.driver, 20, 0.5).until(EC.presence_of_all_elements_located(locator_content))

            if self.isexist():
                self.get_flight_list_dom()
                # print(self.html)
            else:
                self.is_content_null = True

        except Exception as ex:
            print(ex)

    def isexist(self):
        try:
            self.driver.find_element(By.CLASS_NAME, 'flight-lists-container')
            return True
        except Exception as e:
            return False

    def get_flight_list_dom(self):
        flight_html_1 = self.driver.find_element_by_xpath(
            '//div[@class="calendarContainer"]/div[@class="head-calendar-scroll"]/div[@class="calendar-main"]/ul/li[@class="selected"]').get_attribute(
            'outerHTML')
        flight_html_2 = self.driver.find_element_by_xpath(
            '//div[@class="dataContainter"]/div[@class="dataListContainer"]/div[@class="top-flight-info"]').get_attribute(
            'outerHTML')
        flight_html_3 = self.driver.find_element_by_xpath(
            '//div[@class="dataContainter"]/div[@class="dataListContainer"]/div[@class="flight-lists-container"]').get_attribute(
            'outerHTML')

        self.html = flight_html_1 + flight_html_2 + flight_html_3

    def get_flight_info(self):
        selector = etree.HTML(self.html)
        date = selector.xpath('//li[@class="selected"]//span[1]/text()')[0].replace(' ', '')
        depart_city = selector.xpath('//div[@class="top-flight-info"]/strong/text()')[0].split('：')[1].replace(' ', '')
        destination = selector.xpath('//div[@class="top-flight-info"]/strong/text()')[1]
        print(date)
        print(depart_city)
        print(destination)

        flight = selector.xpath(
            '//div[@class="flight-lists-container"]/div[@class="flight-item"]/div[1]/div[1]/div/div/div[2]/p/text()')
        print(flight, '\n', len(flight))
        depart_time = selector.xpath(
            '//div[@class="flight-lists-container"]/div[@class="flight-item"]/div[1]/div[2]/div[1]/strong/text()')
        print(depart_time, '\n', len(depart_time))
        depart_airport_ter = selector.xpath(
            '//div[@class="flight-lists-container"]/div[@class="flight-item"]/div[1]/div[2]/div[1]/em/text()')
        print(depart_airport_ter, '\n', len(depart_airport_ter))
        duration = selector.xpath(
            '//div[@class="flight-lists-container"]/div[@class="flight-item"]/div[1]/div[2]/div[2]/i/text()')
        print(duration, '\n', len(duration))
        arrival_time = selector.xpath(
            '//div[@class="flight-lists-container"]/div[@class="flight-item"]/div[1]/div[2]/div[3]/strong/text()')
        print(arrival_time, '\n', len(arrival_time))
        arrival_airport_ter = selector.xpath(
            '//div[@class="flight-lists-container"]/div[@class="flight-item"]/div[1]/div[2]/div[3]/em/text()')
        print(arrival_airport_ter, '\n', len(arrival_airport_ter))
        price = selector.xpath(
            '//div[@class="flight-lists-container"]/div[@class="flight-item"]/div[1]/div[4]/strong/em/text()')
        print(price, '\n', len(price))
        annotation = []
        for i in selector.xpath(
                '//div[@class="flight-lists-container"]/div[@class="flight-item"]/div[1]/div[@class="red-labels"]/span/text()'):
            annotation.append(i.strip())
        print(annotation)

        # 日期，航空公司，出发城市，到达城市，航班号，出发时间，出发机场，出发航站楼，路途时间，到达时间，到达机场，到达航站楼，价格，逻辑删除（int 0/1），自增数（主键）
        flight_company, flight_number = self.tell_array(flight)
        print(flight_company)
        print(flight_number)
        depart_airport, depart_terminal = self.tell_array(depart_airport_ter)
        print(depart_airport)
        print(depart_terminal)
        arrival_airport, arrival_terminal = self.tell_array(arrival_airport_ter)
        print(arrival_airport)
        print(arrival_terminal)

        # 请求文件锁
        self.lock.acquire()
        for i in range(len(flight)):
            self.fp.write(
                '{0},{1},{2},{3},{4},{5},{6},{7},{8},{9},{10},{11},{12},{13}\n'.format(date, flight_company[i],
                                                                                       depart_city, destination,
                                                                                       flight_number[i],
                                                                                       depart_time[i],
                                                                                       depart_airport[i],
                                                                                       depart_terminal[i],
                                                                                       duration[i],
                                                                                       arrival_time[i],
                                                                                       arrival_airport[i],
                                                                                       arrival_terminal[i],
                                                                                       price[i], annotation[i]))

        # 释放文件锁
        self.lock.release()

    def tell_char(self, text):
        pattern1 = re.compile("[\u4e00-\u9fa5]")
        pattern2 = re.compile("[^\u4e00-\u9fa5]")
        chinese = "".join(pattern1.findall(text))
        unchinese = "".join(pattern2.findall(text))
        return chinese, unchinese

    def tell_array(self, *t):
        print(type(t))
        print(t[0])
        a = []
        b = []
        for i in t[0]:
            c, u = self.tell_char(i)
            a.append(c)
            b.append(u)
        return a, b

    def run(self):
        print('------------爬取线程-%d-启动-----------' % self.id)
        self.make_driver()
        for u in self.urls:
            self.parse_html(u)
            if(self.is_content_null == False):
                self.get_flight_info()
            else:
                print("no flight info")
            self.is_content_null = False

        self.driver.close()

        print('------------爬取线程-%d-结束-----------' % self.id)

def create_crawl_thread(fp, lock):
    # 时间设置为三个月
    dates1 = [datetime.date(2020, 11, 27), datetime.date(2020, 11, 29)]
    dates3 = [datetime.date(2020, 12, 3), datetime.date(2020, 12, 5)]

    for i in range(len(dates1) - 1):
        t = Flight(i + 1, fp, lock)
        t.make_url(dates1[i], dates1[i+1])
        crawl_thread_list.append(t)

    for i in range(len(dates3) - 1):
        trcawl = Flight(i + 2, fp, lock)
        trcawl.make_url(dates3[i], dates3[i+1])
        crawl_thread_list.append(trcawl)

if __name__ == '__main__':
    # 创建时数据库连接
    # engine = create_engine("mysql+pymysql://root:suncaper123@192.168.101.129:3306/project?charset=utf8")

    # 15个城市代码
    citys = ['CKG', 'CTU', 'CSX', 'SHA', 'CAN', 'HGH', 'CGO', 'PEK', 'SHE', 'SIA', 'SYX', 'SZX', 'TNA', 'WUH', 'XMN']

    fp = open('dataall.csv', 'a', encoding='utf8')
    # 创建文件锁
    lock = threading.Lock()
    # 创建爬取线程
    create_crawl_thread(fp, lock)
    # 启动爬取线程
    for tcraw in crawl_thread_list:
        tcraw.start()

    # 等待主线程结束
    for tcraw in crawl_thread_list:
        tcraw.join()

    print(len(crawl_thread_list))
    # print(crawl_thread_list[0].urls)
    fp.close()
    print('主线程，子线程全部结束')
