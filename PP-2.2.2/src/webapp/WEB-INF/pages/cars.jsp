<%--
  Created by IntelliJ IDEA.
  User: ale-k
  Date: 09.05.2020
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Cars</title>
</head>
<body>
    <table border="1" cellpadding="5">
        <thead>
            <tr>
                <th><spring:message code="title" text="default"/></th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="car" items="${cars}">
            <tr>
                <td>${car.brand}</td>
                <td>${car.model}</td>
                <td>${car.number}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
