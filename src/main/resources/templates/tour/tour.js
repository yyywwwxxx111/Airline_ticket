$(function () {



    $('#table1').bootstrapTable('destroy').bootstrapTable({
        method: 'get',
        url: "/tour",
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

        ],
        locale: 'zh-CN',
        responseHandler: function (data) {
            return data['data'];
        }

    });

})