$(function () {

    window.operateEvents  = {
        // 更改操作的方法
        'click .btn_update': function (e, value, row, index) {
            var id = row.id;
            layer.confirm("确认更改："+row.name+" ?", {icon:3, title:'更改操作'}, function (index) {
                $.ajax({

                })
            })
            alert('更改');
        },
        //删除 单行/
        'click .btn_del': function (e, value, row, index) {
            var id = row.id;
            layer.confirm("确认删除: "+row.name+ "  ?", {icon: 3, title:'删除操作'}, function(index){
                //do something
                $.ajax({
                    type: "delete",
                    url: "/deleteCompany",
                    contentType:"application/json",
                    data:JSON.stringify({"id":id }),
                    success: function(msg){
                        if(msg["success"]){
                            $('#table1').bootstrapTable('remove', {
                                field: 'id',
                                values: [id]
                            });
                            layer.msg("操作成功",{time:700});
                        }
                    }
                });
                layer.close(index);
            });
        }
    };

    $('#table1').bootstrapTable('destroy').bootstrapTable({
        method: 'get',
        url: "/getcompanies",
        striped: true,
        dataField: "list",
        totalField: "total",
        pageNumber: 1,
        pageSize: 5,
        pagination: true,
        queryParamsType: 'limit',
        // search: true,
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNo: params.offset / params.limit + 1
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
                title: 'ID',
                field: 'id',
                visible: false,
                width: 160
            },
            {
                //  title: '全选/反选',
                checkbox: true
            }
            ,
            {
                title: '供应商名字',
                field: 'name',
                visible: true,
                width: 160
            },
            {
                title: '操作',
                width: 120,
                align: 'center',
                formatter:function (value, row, index) {
                    return [
                        '<button  type="button" class="btn btn-danger btn-xs btn_del">',
                        '删除' ,
                        '</button>',
                        ' <button  type="button" class="btn btn-primary btn-xs btn_update">',
                        '更改' ,
                        '</button>',
                    ].join('')
                },
                events:window.operateEvents
            }
        ],
        locale: 'zh-CN',
        responseHandler: function (data) {
            return data['data'];
        }

    });


    $(".remove-batch").click(function () {
        var rows =  $('#table1').bootstrapTable('getSelections');
        var ids= $.map(rows,function (row) {
            return row.id;
        });

        if(ids.length>0){
            layer.confirm("确认删除", {icon: 3, title:'删除操作'}, function(index){
                //do something
                $.ajax({
                    type: "delete",
                    url: "/deleteCompanies",
                    contentType:"application/json",
                    data:JSON.stringify(ids),
                    success: function(msg){
                        if(msg["success"]){
                            $('#table1').bootstrapTable('refresh');
                            layer.msg("批量操作成功",{time:700});
                            /*   $('#table1').bootstrapTable('remove', {
                                 field: 'id',
                                 values: ids
                               });*/

                        }
                    }
                });
                layer.close(index);
            });
        }else {
            layer.msg("未选中行",{time:700});
        }

    });
})