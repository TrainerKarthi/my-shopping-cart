<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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

	<!-- Seller Sign In form -->
	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">Seller Sign In Page</p>
						<p class="text-center fs-5 text-danger">${invalid}</p>
						<p class="text-center fs-5 text-success">
							<c:if test="${not empty success }">
                  		${success}
                  		
                  		<c:remove var="success" />
							</c:if>
						</p>

						<form action="${pageContext.request.contextPath}/seller_login"
							method="post">
							<div class="mb-3">
								<label class="form-label">Email Address</label> <input
									name="email" type="email" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label> <input
									name="password" type="password" class="form-control" required>
							</div>
							<button type="submit"
								class="btn bg-secondary text-white col-md-12">Sign In</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>