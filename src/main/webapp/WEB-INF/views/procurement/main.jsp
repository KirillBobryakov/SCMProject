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

<h2>PROCUREMENT PAGE</h2>

<form:form method="post" action="/procurement/new">
    <input type="submit" value="NEW"/>
</form:form>

<form:form method="post" action="/procurement/list">
    <input type="submit" value="PROCUREMENTS LIST"/>
</form:form>

<form:form method="post" action="procurement/add" commandName="company">

    <table>
        <tr>
            <td><form:label path="nameRu">
                nameRu
            </form:label></td>
            <td><form:input path="nameRu" /></td>
        </tr>
        <tr>
            <td><form:label path="nameFr">
                nameFr
            </form:label></td>
            <td><form:input path="nameFr" /></td>
        </tr>
        <tr>
            <td><form:label path="address">
                address
            </form:label></td>
            <td>
                <form:select path="address" >
                    <form:options itemLabel="region" itemValue="id" items="${addresses}"/>
                </form:select>
            </td>
        </tr>
        <tr>

        </tr>
        <tr>
            <td colspan="2"><input type="submit"
                                   value="ADD COMPANY" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>