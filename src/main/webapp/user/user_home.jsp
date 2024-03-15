<%@page import="com.org.dto.Item"%>
<%@page import="com.org.dao.UserDao"%>
<%@page import="com.org.dto.User"%>
<%@page import="com.org.dto.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.org.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@ include file="../utilities/bootstrap.jsp"%>
</head>
<body>
	<%@ include file="../utilities/user_navbar.jsp"%>
	<%
	ProductDao dao = new ProductDao();
	List<Product> products = dao.fetchAllProducts();
	%>

	<p class="text text-center text-success">
		<c:if test="${not empty success}">
				${success}
				<c:remove var="success" />
		</c:if>
	</p>
	<%
	int userId = (int) session.getAttribute("userId");
	User user = new UserDao().fetchUserById(userId);
	List<Item> items = user.getItems();
	%>
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
									<th>Action</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="p" items="<%=products%>">
									<%
									boolean flag = true;
									%>
									<tr>
										<td>${p.getName()}</td>
										<td>${p.getProductType()}</td>
										<td>${p.getStockLeft()}</td>
										<td>${p.getPrice()}</td>
										<td>${p.getDescription()}</td>
										<%=items%>
										<c:forEach var="item" items="<%=items%>">
											<%=items%>

											<c:if
												test="${p.getName()}.equals(${item.getName()}) && ${p.getProductType()}.equals(${item.getProductType()})">
												<%=items%>
												<td><a href="#"><button
															class="btn btn-md btn-success">Go To Cart</button></a></td>
												<%
												flag = !flag;

												System.out.println("Executed");
												%>
											</c:if>

										</c:forEach>
										<%
										if (flag) {
										%>
										<td><a
											href="<%=request.getContextPath()%>/add_to_cart?productId=${p.getId()}"><button
													class="btn btn-md btn-warning">Add To Cart</button></a></td>

										<%
										}
										%>

										<td><a href="buy_now"><button
													class="btn btn-md btn-success">Buy Now</button></a></td>
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