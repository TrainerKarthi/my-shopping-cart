<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@ include file="../utilities/bootstrap.jsp" %>
<style>
     

      .paint-card {
         box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
      }
   </style>
</head>
<body>
<%@ include file="../utilities/index_navbar.jsp" %>

 <!-- Sign Up form -->
   <div class="container p-5">
      <div class="row">
         <div class="col-md-4 offset-md-4">
            <div class="card paint-card">
               <div class="card-body">
                  <p class="fs-4 text-center">User Sign Up Page</p>
                  <p class="text-center text-primary text-3">${user_register}</p>
                  <form action="../user_register" method="post" autocomplete="of">
                     <div class="mb-3">
                        <label class="form-label">Name</label>
                        <input name="name" type="text" class="form-control" required>
                     </div>
                     <div class="mb-3">
                        <label class="form-label">Age</label>
                        <input name="age" type="number" class="form-control" required>
                     </div>
                     <div class="mb-3">
                        <label class="form-label">Mobile</label>
                        <input name="mobile" type="tel" class="form-control" required>
                     </div>
                     <div class="mb-3">
                        <label class="form-label">Email Address</label>
                        <input name="email" type="email" class="form-control" required>
                     </div>
                     <div class="mb-3">
                        <label class="form-label">Password</label>
                        <input name="password" type="password" class="form-control" required>
                     </div>
                     <div class="mb-3">
                        <label class="form-label">Address</label>
                        <textarea name="Address" cols="20" rows="4" class="form-control"></textarea>
                     </div>

                     <button type="submit" class="btn bg-secondary text-white col-md-12">Sign Up</button>
                  </form>
               </div>
            </div>
         </div>
      </div>
   </div>
</body>
</html>