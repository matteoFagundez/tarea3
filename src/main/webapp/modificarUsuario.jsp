
 <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
 <%@page import="java.io.ByteArrayInputStream"%>
 <%@page import="java.io.IOException"%>
 <%@page import="java.io.InputStream"%>
 <%@page import= "java.awt.Image" %>
 <%@page import= "javax.imageio.ImageIO" %>
 <%@page import="java.util.ArrayList"%>
 <%@page import="java.util.List"%>

 <%@page import="java.util.ArrayList"%>
 <%@page import="java.util.List"%>
 <%@page import="java.io.OutputStream"%>
 <%@page import="java.awt.image.BufferedImage"%>
 <%@page import="java.io.File"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
     <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

     <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700&display=swap" rel="stylesheet">
    <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        
        
       
        <title> Ranking de dictado de clases</title>
       
		 <link rel="stylesheet" href="css/styleMenu.css"> 	<!-- css para la barra de MENU-->		
        <link rel="stylesheet" href="css/modificarUsuario.css">
	 <%@ include file="menu.jsp" %>
    </head>
    <body>
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
		crossorigin="anonymous"></script>

     <%if(request.getAttribute("Exito")=="OK"){ %>
	    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	    <script src="js/Exito.js"></script>
    <%}%>
   
     <div class="div-form"> <!-- Contenedor responsive -> ver codigo css en css/mosficarUsuario.css -->
	    <div align="center" class="div-dataUser" style="background-color:#33475b"> <!-- Segundo contenedor responsive -> ver codigo css en css/mosficarUsuario.css -->
		    <form action="ModificarUsuario" method="post">
		       <div class="card">
				  
		          <input type="hidden" name="boton" id="boton" value="">
									<div class="inputBox">
									<!-- LA DATA: Formulario cargado con los datos provenientes del dtUsuario -->
										<label class="font-weight-bold">NickName <span class="text-danger"></span></label>
		                                 <% request.setAttribute("nick", use.getNickname()); %>
		                                <input type="text" name="nick" class="form-control" value="${nick}" readonly>
	           
										<label class="font-weight-bold">Nombre <span class="text-danger"></span></label>
										 <% request.setAttribute("nombre", use.getNombre()); %>
		                                <input type="text" name="nombre" class="form-control" value="${nombre}" required>
		                                
		                                <label class="font-weight-bold">Apellido <span class="text-danger"></span></label>
		                                <% request.setAttribute("apellido", use.getApellido()); %>
		                                <input type="text" name="apellido" class="form-control"  value="${apellido}" required>
		                                
		                                <label class="font-weight-bold">Fecha <span class="text-danger"></span></label>
	  									<% request.setAttribute("fecha", use.getFechaNac()); %>
		                            	<input type="date" id="tipofecha" name="fecha" class="form-control"  value="${fecha}"  required>
		                            	
		                            	
		                            	<label class="font-weight-bold">Email<span class="text-danger"></span></label>
		                                 <% request.setAttribute("email", use.getEmail()); %>
		                                <input type="text" name="email" class="form-control" value="${email}" readonly>
		                                
		                                <label class="font-weight-bold">Contraseña <span class="text-danger"></span></label>
										 <% request.setAttribute("password", use.getPassward()); %>
		                                <input type="text" name="password" class="form-control" value="${password}" required>
		                              
		                              	<label class="font-weight-bold" >Foto <span class="text-danger"></span></label>
		                              	 <% request.setAttribute("oldUrl", use.getUrl()); %>
		                              	 <input type="text" name="oldUrl" class="form-control" value="${oldUrl}" readonly>
		                              	  
		                              	  <% request.setAttribute("Url", use.getUrl()); %>
		                              	 <input type="file" name="Url" class="form-control" value="${Url}" >
	
		                            </div>
		       <div>
		       		<button name="btnAceptar" type="submit">Aceptar</button>
		      </div> 
		      </div>
		     
		    </form>
		</div> <!-- cierrre de div-dataUser -->
    </div> <!-- cierrre de div-form -->
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
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
		crossorigin="anonymous"></script>
    </body>
</html>