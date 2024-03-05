<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="../utilities/seller_navbar.jsp" %>
</head>
<body>
<%@ include file="../utilities/bootstrap.jsp" %>

<h1>${pageContext.request.contextPath}</h1>
<table border="2">
	<tr>
		<th>Name</th>
		<th>Type</th>
		<th>stock left</th>
		<th>Price</th>
		<th>Description</th>
	</tr>
	<c:forEach var="p" items="${products}">
		
		<tr>
			<td>${p.getName()}</td>
			<td>${p.getProductType()}</td>
			<td>${p.getStockLeft()}</td>
			<td>${p.getPrice()}</td>
			<td>${p.getDescription()}</td>
		</tr>
	</c:forEach>
	
</table>

	
</body>
</html>