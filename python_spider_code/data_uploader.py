import pandas as pd
import numpy
from sqlalchemy import create_engine

if __name__ == "__main__":
    engine = create_engine("mysql+pymysql://root:suncaper123@192.168.101.129:3306/project?charset=utf8")
    # 日期，航空公司，出发城市，到达城市，航班号，出发时间，出发机场，出发航站楼，路途时间，到达时间，到达机场，到达航站楼，价格，逻辑删除（int 0/1），自增数（主键）
    csv_data = pd.read_csv('dataall.csv', low_memory=False, names=['date_day', 'company', 'depart_city', 'destination', 'flight_number', 'depart_time'
        , 'depart_airport', 'depart_terminal', 'duration', 'arrival_time', 'arrival_airport', 'arrival_terminal', 'price', 'annotation'])

    # engine = create_engine("mysql+pymysql://root:suncaper123@192.168.101.129:3306/project?charset=utf8")

    # csv_data.to_sql(name='flight_test', con=engine, if_exists='append', index=False, index_label=False)

    result1 = csv_data.loc[csv_data['date_day'] == '08-04周二']
    result2 = csv_data.loc[csv_data['date_day'] == '09-17周四']
    result3 = csv_data.loc[csv_data['date_day'] == '12-02周三']
    result4 = csv_data.loc[csv_data['date_day'] == '11-28周六']
    result5 = csv_data.loc[csv_data['date_day'] == '11-27周五']
    print(result2)
    csv_data['isdeleted'] = 0
    # 此处就已经加上了全为0的一列isdeleted的逻辑删除行
    print(result2['date_day'].value_counts())

    csv_data.to_sql(name='flight_info', con=engine, if_exists='append', index=False, index_label=False)

