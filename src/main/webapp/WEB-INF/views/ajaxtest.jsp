<%--
  Created by IntelliJ IDEA.
  User: bkv
  Date: 04/03/15
  Time: 01:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<script type="text/javascript"
        src="http://code.jquery.com/jquery-2.0.0.min.js"></script>

<script type="text/javascript">
    function crunchifyAjax() {
        $.ajax({
            url : '/procurement/ajaxtest',
            success : function(data) {
                $('#result').html(data);
            }
        });
    }
</script>
<script type="text/javascript">
    var intervalId = 0;
    intervalId = setInterval(crunchifyAjax, 3000);
</script>

<body>

<div align="center">
    <br> <br> ${message} <br> <br>
    <div id="result"></div>
    <br>
    <p>
        by <a href="http://crunchify.com">Crunchify.com</a>
    </p>
</div>
</body>
</html>
