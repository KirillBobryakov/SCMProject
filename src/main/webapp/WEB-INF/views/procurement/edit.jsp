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
<script type="text/javascript" src="http://code.jquery.com/jquery-2.0.0.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.3/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/ui/1.11.3/jquery-ui.js"></script>


<script type="text/javascript">
    function getCurrencyCodeAlfa(procurementGoodId,currencyId) {
        var l;
        $.ajax({
            url : '/procurement/unitPriceCurrency',
            data : {currencyId: currencyId},
            success : function(data) {
                $('#unitPriceCurrency'+procurementGoodId).html(data);
            }
        });
    }
//    function getCurrencyList() {
//        $.ajax({
//            url : '/procurement/getListCurrencies',
//            success : function(data) {
//                $( "input" ).autocomplete({
//                    source: data
//                });
//            }
//        });
//    }

</script>

<body>

<a href="<c:url value="/logout" />">
    LOGOUT
</a>

<h2>PROCUREMENT EDIT</h2>

<form:form method="post" action="/procurement/list">
    <input type="submit" value="BACK"/>
</form:form>

<form:form method="post" action="/procurement/create" commandName="procurement">

    <table border="1">
        <tr>
            <td>
                <form:label path="id">
                    ID
                </form:label>
            </td>
            <td>
                <form:input path="id" disabled="true"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="nameText">
                    nameText
                </form:label>
            </td>
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
            <td><form:label path="seller">
                Seller
            </form:label></td>
            <td>
                <form:select path="seller" >
                    <form:option title="none" value=""/>
                    <form:options itemLabel="nameFr" itemValue="id" items="${foreign_companies}" />
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="consignor">
                Consignor
            </form:label></td>
            <td>
                <form:select path="consignor" >
                    <form:option title="none" value=""/>
                    <form:options itemLabel="nameFr" itemValue="id" items="${foreign_companies}" />
                </form:select>
            </td>
        </tr>
        <tr>
        <tr>
            <td colspan="2"><input type="submit"
                                   value="Commit" /></td>
        </tr>
    </table>
</form:form>

<c:if test="${!empty procurementGoods}">
    <table class="data" border="1">
        <tr>
            <th>good</th>
            <th>goodQuantity</th>
            <th>unitPrice</th>
            <th>unitPriceCurrency</th>
            <th>discountAbsolute</th>
            <th>discountPercent</th>
        </tr>
        <c:forEach items="${procurementGoods}" var="procurementGood">
            <tr>
                <td>
                    ${procurementGood.good}
                </td>
                <td>
                    ${procurementGood.goodQuantity}
                </td>
                <td>
                    ${procurementGood.unitPrice}
                </td>
                <td>
                    <script type="application/javascript">
                        $(getCurrencyCodeAlfa(${procurementGood.id}, ${procurementGood.unitPriceCurrency}));
                    </script>
                    <a id="unitPriceCurrency${procurementGood.id}"></a>

                </td>
                <td>
                    ${procurementGood.discountAbsolute}
                </td>
                <td>
                    ${procurementGood.discountPercent}
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>




</body>
</html>