function initNavTree(){
    $('#navtree').tree(
        {
            url:'/json/tree_data.json',
            method:'get',
            animate:true,
            dnd:false,
            collapsed:true
        }
    )
}


function initContentManagePanel(){
    $("#center-panel").panel('refresh', 'contentMgr');
}