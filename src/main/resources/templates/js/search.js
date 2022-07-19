var paValue = new Array();//创建一个用于保存具体值得数组
$(function () {



    var loc = location.href;//获取整个跳转地址内容，其实就是你传过来的整个地址字符串
    console.log("我的地址"+loc);
    var n1 = loc.length;//地址的总长
    var n2 = loc.indexOf("?");//取得=号的位置
    var parameter = decodeURI(loc.substr(n2+1, n1-n2));//截取从?号后面的内容,也就是参数列表，因为传过来的路径是加了码的，所以要解码
    var parameters  = parameter.split("&");//从&处拆分，返回字符串数组
    console.log("参数列表"+parameters);
    for (var i = 0; i < parameters.length; i++) {
        console.log("参数键值对值"+i+":"+parameters[i]);
        var m1 = parameters[i].length;//获得每个键值对的长度
        var m2 = parameters[i].indexOf("=");//获得每个键值对=号的位置
        var value = parameters[i].substr(m2+1, m1-m2);//获取每个键值对=号后面具体的值
        paValue[i] = value;
        console.log("参数值"+i+":"+value);
    }
    console.log("具体参数数组："+paValue);
    //alert(paValue[2]);

    window.operateEvents  = {
        // 更改操作的方法
        'click .btn_update': function (e, value, row, index) {
            var id = row.id;
            layer.confirm("确认购买: "+row.flightNumber+ "  该次航班吗?", {icon: 3, title:'购买操作'}, function(index){
                //do something

                layer.close(index);
            });
        },
    }

    $('#table1').bootstrapTable('destroy').bootstrapTable({
        method: 'get',
        url: "/search",
        striped: true,
        dataField: "list",
        totalField: "total",
        pageNumber: 1,
        pageSize: 10,
        pagination: true,
        queryParamsType: 'limit',
        // search: true,
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNo: params.offset / params.limit + 1,
                dateDay:paValue[0],
                departCity:paValue[1],
                destination:paValue[2]
            }
        },
        sidePagination: 'server',
        pageList: "[10, 25, 50, 100, all]",
        showRefresh: true,
        clickToSelect: true,
        toolbarAlign: 'left',
        buttonsAlign: 'right',
        toolbar: '#toolbar',
        showColumns: false,
        paginationLoop: false,
        columns: [
            {
                title: 'id',
                field: 'id',
                visible: false,
                width: 1
            },
            {
                title: '日期',
                field: 'dateDay',
                visible: true,
                width: 15
            },
            {
                title: '公司',
                field: 'company',
                width: 15,
                align: 'center'
            },
            {
                title: '机型',
                field: 'plane',
                width: 20,
                align: 'center'
            },
            {
                title: '出发城市',
                field: 'departCity',
                width: 10,
                align: 'center'
            },
            {
                title: '到达城市',
                field: 'destination',
                width: 5,
                align: 'center'
            },
            {
                title: '航班号',
                field: 'flightNumber',
                width: 5,
                align: 'center'
            },
            {
                title: '出发时间',
                field: 'departTime',
                width: 5,
                align: 'center'
            },
            {
                title: '出发机场',
                field: 'departAirport',
                width: 5,
                align: 'center'
            },
            {
                title: '出发航站楼',
                field: 'departTerminal',
                width: 5,
                align: 'center'
            },
            {
                title: '飞行时间',
                field: 'duration',
                width: 4,
                align: 'center'
            },
            {
                title: '到达时间',
                field: 'arrivalTime',
                width: 5,
                align: 'center'
            },
            {
                title: '到达机场',
                field: 'arrivalAirport',
                width: 5,
                align: 'center'
            },
            {
                title: '到达航站楼',
                field: 'arrivalTerminal',
                width: 5,
                align: 'center'
            },
            {
                title: '价格',
                field: 'price',
                width: 5,
                align: 'center'
            },
            {
                title: '有无餐食',
                field: 'annotation',
                width: 25,
                align: 'center'
            },
            {
                title: '操作',
                width: 10,
                align: 'center',
                formatter: function (value, row, index) {
                    return [
                        ' <button  type="button" class="btn btn-primary btn-xs btn_update">',
                        '购买',
                        '</button>',
                    ].join('')
                },
                events: window.operateEvents
            }

        ],
        locale: 'zh-CN',
        responseHandler: function (data) {
            return data['data'];
        }

    });

})