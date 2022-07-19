$(function () {
    // // var tem = $(this).parents("class").find(".ID").val();
    // $('btn_update').click( function(){
    //     //const tem = $(this).parents("class").find("ID").val();
    //     var uid=row.uidPk;
    //     window.location.href = "ticket.html?index="+uid;
    // });






    $('#table1').bootstrapTable('destroy').bootstrapTable({
        method: 'get',
        url: "/getuser",
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
                class:'ID',
                title: 'ID',
                field: 'uidPk',
                visible: true,
                width: 160
            },
            {
                title: '姓名',
                field: 'name',
                visible: true,
                width: 15
            },
            {
                title: '性别',
                field: 'gender',
                width: 15,
                align: 'center'
            },
            {
                title: '邮箱',
                field: 'email',
                width: 15,
                align: 'center'
            },
            {
                title: '手机号',
                field: 'phone',
                width: 15,
                align: 'center'
            },
            {
                title: '密码',
                field: 'password',
                width: 15,
                align: 'center'
            },
            {
                title: '专业',
                field: 'major',
                width: 15,
                align: 'center'
            },
            {
                title: '学校',
                field: 'school',
                width: 15,
                align: 'center'
            },
            {
                title: '操作',
                width: 80,
                align: 'center',
                formatter: function (value, row, index) {
                    return [
                        '<a href="ticket.html?uid='+row.uidPk+'" >',

                        ' <button  type="button" class="btn btn-primary btn-xs btn_update" >',
                        '查看购票详情',
                        '</button>',

                        '</a>'
                    ].join('')
                },
                //events:window.location.href

            }
        ],
        locale: 'zh-CN',
        responseHandler: function (data) {
            return data['data'];
        }

    });





})