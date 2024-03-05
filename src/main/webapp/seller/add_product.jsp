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

	<%@ include file="../utilities/seller_navbar.jsp"%>

	<div class="container p-5">
		<div class="row">
			<div class="col-md-4 offset-md-4">
				<div class="card paint-card">
					<div class="card-body">
						<p class="fs-4 text-center">Add Product Page</p>
						<p class="text-center text-primary text-3">
							<c:if test="${not empty success }">
							${success}
							<c:remove var="success"/>
							</c:if>
						</p>
						<form action="../add_product" method="post" autocomplete="of">
							<div class="mb-3">
								<label class="form-label">Name</label> <input name="name"
									type="text" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Stock Left</label> <input
									name="stockLeft" type="number" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Product Type</label> <input
									name="productType" type="tel" class="form-control" required>
							</div>
							<div class="mb-3">
								<label class="form-label">Price</label> <input name="price"
									type="tel" class="form-control" required>
							</div>

							<div class="mb-3">
								<label class="form-label">Description</label>
								<textarea name="description" cols="20" rows="4"
									class="form-control"></textarea>
							</div>

							<button type="submit"
								class="btn bg-secondary text-white col-md-12">Add
								Product</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>