<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>TITLE</title>
</head>
<body>

<a href="<c:url value="/logout" />">
    LOGOUT
</a>

<h2>PROCUREMENT LIST</h2>
<form:form method="post" action="/procurement/">
    <input type="submit" value="BACK"/>
</form:form>

<h3>PROCUREMENTS</h3>
<c:if test="${!empty procurements}">
    <table class="data">
        <tr>
            <th>nameText</th>
            <th>nameNum</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${procurements}" var="procurement">
            <tr>
                <td>${procurement.nameText}</td>
                <td>${procurement.nameNum}</td>
                <td><a href="/procurement/delete/${procurement.id}">DELETE</a></td>
                <td><a href="/procurement/edit/${procurement.id}">EDIT</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>