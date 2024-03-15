<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@ include file="../utilities/bootstrap.jsp"%>
<style>
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>
</head>
<body>
	<%@ include file="../utilities/index_navbar.jsp"%>

	<!-- Sign Up form -->
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">Seller Sign Up Page</p>
						<p class="text-center text-primary fs-5">
							<c:if test="${not empty seller_register}">
								seller_register
							</c:if>
						</p>
						<form:form action="${pageContext.request.contextPath}/seller_register" modelAttribute="seller">
							<div class="mb-3">
								<label class="form-label">Name</label>
								<form:input path="name" type="text" class="form-control" />
							</div>

							<div class="mb-3">
								<label class="form-label">Mobile</label>
								<form:input path="mobile" type="tel" class="form-control" />
							</div>
							<div class="mb-3">
								<label class="form-label">Email Address</label>
								<form:input path="email" type="email" class="form-control" />
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label>
								<form:input path="password" type="password" class="form-control" />
							</div>
							<div class="mb-3">
								<label class="form-label">Address</label>
								<form:textarea path="address" cols="20" rows="4"
									class="form-control" />
							</div>

							<button type="submit"
								class="btn bg-secondary text-white col-md-12">Sign Up</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>