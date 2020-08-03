import pandas as pd
import numpy
from sqlalchemy import create_engine

if __name__ == "__main__":
    # 日期，航空公司，出发城市，到达城市，航班号，出发时间，出发机场，出发航站楼，路途时间，到达时间，到达机场，到达航站楼，价格，逻辑删除（int 0/1），自增数（主键）
    csv_data = pd.read_csv('dataall_b_2.csv', low_memory=False, names=['date_day', 'company', 'plane', 'depart_city', 'destination', 'flight_number', 'depart_time'
        , 'depart_airport', 'depart_terminal', 'duration', 'arrival_time', 'arrival_airport', 'arrival_terminal', 'price', 'annotation'])

    engine = create_engine("mysql+pymysql://root:suncaper123@192.168.101.129:3306/project?charset=utf8")

    result1 = csv_data.loc[csv_data['date_day'] == '08-04周二']
    result6 = csv_data.loc[csv_data['date_day'] == '08-12周三']
    result7 = csv_data.loc[csv_data['date_day'] == '08-20周四']
    result8 = csv_data.loc[csv_data['date_day'] == '08-27周四']
    result2 = csv_data.loc[csv_data['date_day'] == '09-03周四']
    result9 = csv_data.loc[csv_data['date_day'] == '09-12周六']
    result10 = csv_data.loc[csv_data['date_day'] == '09-19周六']
    result12 = csv_data.loc[csv_data['date_day'] == '09-27周日']
    result3 = csv_data.loc[csv_data['date_day'] == '10-02周五']
    result4 = csv_data.loc[csv_data['date_day'] == '10-09周五']
    result5 = csv_data.loc[csv_data['date_day'] == '10-17周六']
    result11 = csv_data.loc[csv_data['date_day'] == '10-25周日']
    print(result2)
    csv_data['isdeleted'] = 0
    # 此处就已经加上了全为0的一列isdeleted的逻辑删除行
    # print(result2['date_day'].value_counts())

    # 去除重复值
    print(csv_data.duplicated())
    print(csv_data.shape)
    csv_data.drop_duplicates(inplace=True)
    csv_data.reset_index(drop=True, inplace=True)
    print(csv_data.shape)
    print(csv_data['company'].value_counts())

    csv_data.to_sql(name='flight_ticket', con=engine, if_exists='append', index=False, index_label=False)

    df = pd.read_csv('航空公司机票数量数据统计.txt', names=['name'])
    df['name'] = df.apply(lambda x: get_chinese(x), axis=1)
    df.to_sql(name='company', con=engine, if_exists='append', index=False, index_label=False)
