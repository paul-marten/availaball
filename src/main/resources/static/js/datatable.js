// $(document).ready( function () {
// 	 var table = $('#futsalfieldsTable').DataTable({
// 			"sAjaxSource": "/futsalfields",
// 			"sAjaxDataProp": "",
//             // "pageLength": 5,
// 			"order": [[ 0, "asc" ]],
// 			"aoColumns": [
// 			      { "mData": "idFutsalField"},
// 		          { "mData": "fieldName" },
// 				  { "mData": "location" },
// 				  { "mData": "phoneNumber" },
// 				  { "mData": "numberOfField" },
// 				  { "mData": "openingHours" },
// 				  { "mData": "closingHours" },
//                   { "mData": "price" }
// 			]
// 	 })
// });

// $(document).ready( function () {
//     var table = $('#futsalfieldsTable').DataTable({
//         "ajax": "/futsalfields",
//         "destroy": true,
//         "deferRender": true,
//         "processing": true,
//         'serverSide' : true,
//         columns : [ {data : 'idFutsalField'},
// 					{data : 'fieldName'},
// 					{data : 'location'},
// 					{data : 'phoneNumber'},
// 					{data : 'numberOfField'},
// 					{data : 'openingHours'},
// 					{data : 'closingHours'},
// 					{data : 'price'},
// 					{data : 'account.id',
// 						render: function (data, type, row) {
//                             if (row.account) {
//                                 return row.account.username;
//                             }
//                             return '';
//                         }
// 					}]
//     })
// });



$(document).ready( function () {
    var table = $('#futsalfieldsTable').DataTable({
        "ajax": "/futsalfields",
        "destroy": true,
        "deferRender": true,
        "processing": true,
        'serverSide' : true,
        "responsive": true,
        "paging":true,
        "pageLength":10,
        "ordering":true,
        "columnDefs": [ {
            "searchable": false,
            "orderable": false,
            "targets": 0
        } ],
        "order": [
            [1, 'asc']
        ],
        columns : [
            {
                data : null,
                "width": "30px",
                "sClass": "text-center",
                "orderable": false
            },
            {data : 'fieldName',
                "width": "30px",
                "height" : "60px",
                "orderable": false,
                render: function ( data, type, row, meta ) {
                    if(type === 'display'){
                        data = '<a href="view-lapangan.html' + encodeURIComponent(data) + '  "style="font-weight: bold; text-decoration-color: #F2f2f2 ;">' + data + '</a>';
                    }

                    return data;
                }
            },
            {
                data : 'location',
                "width": "30px",
                "sClass": "text-center",
            },
            {
                data : 'numberOfField',
                "width": "30px",
                "sClass": "text-center",
            },
            {
                data : 'price',
                "width": "30px",
                "sClass": "text-center",
            },
            {
                data : 'account.id',
                "width": "30px",
                "sClass": "text-center",
                render: function (data, type, row) {
                    if (row.account) {
                        return row.account.username;
                    }
                    return '';
                }
            },
            {
                "data" : 'idFutsalField',
                "width" : "10%",
                searchable:false,
                "createdCell" : function (td, cellData, rowData, row, col) {

                    console.log(rowData.idFutsalField);
                    var button = $('<a>',{'href':'/edit/'+cellData}).append("<span>edit</span>");
                    $(td).html(button);
                }
            }]
    })

    table.on( 'draw.dt', function () {
        table.column(0).nodes().each( function (cell, i) {
            // console.log(cell);
            cell.innerHTML = table.page.info().start + (i+1);
        } );
    } ).draw();

    $('#example').on('click', 'a.editor_edit', function (e) {
        e.preventDefault();

        editor.edit( $(this).closest('tr'), {
            title: 'Edit record',
            buttons: 'Update'
        } );
    } );

    // Delete a record
    $('#example').on('click', 'a.editor_remove', function (e) {
        e.preventDefault();

        editor.remove( $(this).closest('tr'), {
            title: 'Delete record',
            message: 'Are you sure you wish to remove this record?',
            buttons: 'Delete'
        } );
    } );

});

$(document).ready( function () {
    var table = $('#UserTable').DataTable({
        "ajax": "/futsalfields",
        "destroy": true,
        "deferRender": true,
        "processing": true,
        'serverSide' : true,
        "responsive": true,
        "order": [
            [1, 'asc']
        ],
        columns : [
            {data : null},
            {data : 'fieldName'},
            {data : 'location'},
            {data : 'numberOfField'},
            {data : 'price'},
            {data : 'account.id',
                render: function (data, type, row) {
                    if (row.account) {
                        return row.account.username;
                    }
                    return '';
                }
            }]
    })

    table.on( 'order.dt search.dt', function () {
        table.column(0, {search:'applied', order:'applied'}).nodes().each( function (cell, i) {
            cell.innerHTML = i+1;
        } );
    } ).draw();
});
