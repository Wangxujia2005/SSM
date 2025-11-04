<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.7.1.js"></script>
    <script>
        function a1(){
            $.post({
                url:"${pageContext.request.contextPath}/a1",
                data:{'name':$("#userName").val()},
                success:function (data,status) {
                    alert(data);
                    alert(status);
                }
            });
        }
    </script>
</head>
<body>

<%--onblur：失去焦点触发事件--%>
用户名:<input type="text" id="userName" onblur="a1()"/>

</body>