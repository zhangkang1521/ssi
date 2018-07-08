<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>userList</title>
    <script src="/static/jquery-1.7.1.js"></script>
</head>
<body>
userList

</body>
<script>
    $.ajax({
       url: '/user/list2',
        type: 'get',
        success: function () {
            
        }
    });
</script>
</html>
