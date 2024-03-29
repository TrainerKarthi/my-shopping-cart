<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="../utilities/bootstrap.jsp" %>
<title>Insert title here</title>
</head>
<body>
<%@ include file="../utilities/seller_navbar.jsp" %>
	
	<div class="container-fluid p-3">
		<div class="row">
			<div class="col-md-12">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-3 text-center">Product Details</p>
						<table class="table">
							<thead>
								<tr>
									<th>Name</th>
									<th>Type</th>
									<th>stock left</th>
									<th>Price</th>
									<th>Description</th>

									<th>Update Product</th>
									<th>Delete Product</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="p" items="${products}">

									<tr>
										<td>${p.getName()}</td>
										<td>${p.getProductType()}</td>
										<td>${p.getStockLeft()}</td>
										<td>${p.getPrice()}</td>
										<td>${p.getDescription()}</td>
										<td><a href="#" class="btn btn-md btn-warning">Update</a></td>
										<td><a href="#" class="btn btn-md btn-danger">Delete</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

					</div>
				</div>


			</div>

		</div>
	</div>

	
</body>
</html>