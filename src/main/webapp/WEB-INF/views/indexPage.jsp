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

<h2>INDEX PAGE</h2>

<form action="/procurement">
    <button type="submit">Procurements</button>
</form>
<button id="button_id_2">BUTTON N</button>

</body>
</html>