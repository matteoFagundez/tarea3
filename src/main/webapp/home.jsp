<%@page import="publicadores.DtUsuario"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
 <%@page import="java.io.ByteArrayInputStream"%>
 <%@page import="java.io.IOException"%>
 <%@page import="java.io.InputStream"%>
 <%@page import= "java.awt.Image" %>
 <%@page import= "javax.imageio.ImageIO" %>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<link rel="stylesheet" href="css/styleMenu.css"> 	<!-- css para la barra de MENU-->

<title>Homepage</title>

	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
</head>
<body>


		<%@ include file="menu.jsp" %>
	

	<div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
		<div class="carousel-inner">
			
			<!-- <div style="width:100%;height:0;padding-bottom:100%;position:relative;"> -->
			<div class="carousel-item active">
				<img class="d-block w-100" src="imagenes/panda.gif" alt="First slide">
			</div>
			<div class="carousel-item active">
				<img class="d-block w-100" src="imagenes/working.gif" alt="First slide">
			</div>
	</div>
    

	  <footer class="py-3 my-4">
	    <ul class="nav justify-content-center border-bottom pb-3 mb-3">
	      <li class="nav-item"><a href="home.jsp" class="nav-link px-2 text-muted">Home</a></li>
	      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Features</a></li>
	      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">Pricing</a></li>
	      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">FAQs</a></li>
	      <li class="nav-item"><a href="#" class="nav-link px-2 text-muted">About</a></li>
	    </ul>
	    <p class="text-center text-muted">© 2022 Company, Inc</p>
	  </footer>

    	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous">
	</script>
  
</body>
</html>
