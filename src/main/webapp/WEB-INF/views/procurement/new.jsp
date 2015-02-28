<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
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

<h2>PROCUREMENT NEW</h2>

<form:form method="post" action="/procurement/">
    <input type="submit" value="BACK"/>
</form:form>

<form:form method="post" action="/procurement/create" commandName="procurement">

    <table>
        <tr>
            <td>
                <form:label path="nameText">
                    nameText
                </form:label></td>
            <td>
                <form:input path="nameText" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="nameNum">
                    nameNum
                </form:label></td>
            <td>
                <form:input path="nameNum" />
            </td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit"
                                   value="NEW Procurement" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>