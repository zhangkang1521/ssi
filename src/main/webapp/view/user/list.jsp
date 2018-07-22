<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userList</title>
    <script src="/static/jquery-1.7.1.js"></script>
    <script type="text/javascript" src="/static/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/static/easyui/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/static/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/static/easyui/themes/icon.css">
</head>
<body>
    <select id="cc" class="easyui-combotree" style="width:200px;" multiple>
    </select>

</body>
<script>

    $(function() {
        $('#cc').combotree({
            url: '/user/perm',
            required: true
        });

        $('#cc').combotree('setValues', [4, 5]);
    });


</script>

</html>
