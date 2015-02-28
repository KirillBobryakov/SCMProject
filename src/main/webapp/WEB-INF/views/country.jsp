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

<h2>TITLE</h2>

<form:form method="post" action="add" commandName="country">

    <table>
        <tr>
            <td><form:label path="codeA2">
                CodeA2
            </form:label></td>
            <td><form:input path="codeA2" /></td>
        </tr>
        <tr>
            <td><form:label path="name">
                Name
            </form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit"
                                   value="ADD COUNTRY" /></td>
        </tr>
    </table>
</form:form>

<h3>COUNTRIES</h3>
<c:if test="${!empty countryList}">
    <table class="data">
        <tr>
            <th>CodeA2</th>
            <th>Name</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${countryList}" var="country">
            <tr>
                <td>${country.codeA2}, ${country.name}</td>
                <td><a href="delete/${country.id}">DELETE</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>