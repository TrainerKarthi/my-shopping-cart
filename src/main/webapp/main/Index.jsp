<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shopping Cart Index Page</title>
<%@ include file="../utilities/bootstrap.jsp" %>
</head>
.paint-card {
         box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
      }
<body>
<%@ include file="../utilities/index_navbar.jsp" %>
	
<!-- Heroes -->
<div class="container col-xxl-8 px-4 py-5">
   <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
     <div class="col-10 col-sm-8 col-lg-6">
       <img src="../img/shop1.png" class="d-block mx-lg-auto img-fluid" alt="Bootstrap Themes" width="800" height="800" loading="lazy">
     </div>
     <div class="col-lg-6">
       <h1 class="display-5 fw-bold lh-1 mb-3">Welcome To The Fashion World</h1>
       <p class="lead">Quickly design and customize responsive mobile-first sites with Bootstrap, the world’s most popular front-end open source toolkit, featuring Sass variables and mixins, responsive grid system, extensive prebuilt components, and powerful JavaScript plugins.</p>
       <div class="d-grid gap-2 d-md-flex justify-content-md-start">
         <button type="button" class="btn btn-secondary btn-lg px-4 me-md-2">Primary</button>
         <button type="button" class="btn btn-outline-secondary btn-lg px-4">Default</button>
       </div>
     </div>
   </div>
 </div>

 <!-- Section 2 -->
 <div class="row row-cols-1 row-cols-lg-3 align-items-stretch g-4 py-5">
   <div class="col">
     <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg" style="background-image: url('../img/img2.jpg'); border-radius: 15px">
       <div class="d-flex flex-column h-100 p-5 pb-3 text-white text-shadow-1">
         <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">Short title, long jacket</h2>
         <ul class="d-flex list-unstyled mt-auto">
           <li class="me-auto">
             <img src="https://github.com/twbs.png" alt="Bootstrap" width="32" height="32" class="rounded-circle border border-white">
           </li>
           <li class="d-flex align-items-center me-3">
             <svg class="bi me-2" width="1em" height="1em"><use xlink:href="#geo-fill"></use></svg>
             <small>Earth</small>
           </li>
           <li class="d-flex align-items-center">
             <svg class="bi me-2" width="1em" height="1em"><use xlink:href="#calendar3"></use></svg>
             <small>3d</small>
           </li>
         </ul>
       </div>
     </div>
   </div>

   <div class="col">
     <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg" style="background-image: url('../img/img3.jpg'); border-radius: 15px;">
       <div class="d-flex flex-column h-100 p-5 pb-3 text-white text-shadow-1">
         <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">Much longer title that wraps to multiple lines</h2>
         <ul class="d-flex list-unstyled mt-auto">
           <li class="me-auto">
             <img src="https://github.com/twbs.png" alt="Bootstrap" width="32" height="32" class="rounded-circle border border-white">
           </li>
           <li class="d-flex align-items-center me-3">
             <svg class="bi me-2" width="1em" height="1em"><use xlink:href="#geo-fill"></use></svg>
             <small>Pakistan</small>
           </li>
           <li class="d-flex align-items-center">
             <svg class="bi me-2" width="1em" height="1em"><use xlink:href="#calendar3"></use></svg>
             <small>4d</small>
           </li>
         </ul>
       </div>
     </div>
   </div>

   <div class="col">
     <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg" style="background-image: url('../img/img1.jpg');border-radius: 15px">
       <div class="d-flex flex-column h-100 p-5 pb-3 text-shadow-1">
         <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">Another longer title belongs here</h2>
         <ul class="d-flex list-unstyled mt-auto">
           <li class="me-auto">
             <img src="https://github.com/twbs.png" alt="Bootstrap" width="32" height="32" class="rounded-circle border border-white">
           </li>
           <li class="d-flex align-items-center me-3">
             <svg class="bi me-2" width="1em" height="1em"><use xlink:href="#geo-fill"></use></svg>
             <small>California</small>
           </li>
           <li class="d-flex align-items-center">
             <svg class="bi me-2" width="1em" height="1em"><use xlink:href="#calendar3"></use></svg>
             <small>5d</small>
           </li>
         </ul>
       </div>
     </div>
   </div>
		
</body>
</html>