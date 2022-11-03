
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="java.io.ByteArrayInputStream"%>
 <%@page import="java.io.IOException"%>
 <%@page import="java.io.InputStream"%>
 <%@page import= "java.awt.Image" %>
 <%@page import= "javax.imageio.ImageIO" %>

 <%@page import="java.util.ArrayList"%>
	<%@page import="java.util.List"%>

 <%@page import="java.util.ArrayList"%>
	<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
	
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

		<link rel="stylesheet" href="css/styleMenu.css"> 	<!-- css para la barra de MENU-->
		
		
		
        <link rel="stylesheet" href="css/consultaUsuario.css"> <!-- css para CUERPO CENTRAL-->
         <link rel="stylesheet" type="text/css" href="css/table-responsive.css">  <!-- css para TBLA RESPONSIVE-->
       
		

		<title>Consulta de Usuario</title>

	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    </head>
    <body>

	<%@ include file="menu.jsp"  %>
	<!-- Cuerpo de la pagina -->
	
	<div class="div-form">
	  
			<div align="center" class="div-dataUser" style="background-color:#33475b">
  				<h2 class="font-weight-bold mb-3">  Datos </h2>
				<img class="avatar" src="imagenes/user.png" style="width:150px;height:180px;margin-left:16px;">
				
				<br></br>
				<div class="div-user" id="wrapper">
		          <table>
		            <thead>		
		              <tr>
		                <th>Nickname</th>
		                <th>Nombre</th>
		                <th>Apellido</th>
		                <th>Fecha nacimiento</th>
		                <th>Email</th>
		                <th>Descripcion</th>
		                <th>Bibiografia</th>
		                <th>Sitio Web</th>
		                <th>Rol</th>
		              </tr>
		            </thead>
		            <tbody>
		             <tr>
		                <td data-label="Nickname">Bob</td>
		                <td data-label="Nombre">Smith</td>
		                <td data-label="Apellido">Northeastern University</td>
		                <td data-label="Nacimiento">Computer Science</td>
		                <td data-label="Email">@gmail</td>
		                <td data-label="Descripcion">descripcion del profe</td>
		                <td data-label="Biografia">bio del profe</td>
		                <td data-label="Sitio Web">google.com</td>
		                <td data-label="Rol">Profesor</td>
		              </tr>

		            </tbody>
		          </table>
		        </div>     
					<!-- TABLA PARA EL USUARIO TIPO SOCIO
				<div id="wrapper">
		          <table>
		            <thead>		
		              <tr>
		                <th>Nickname</th>
		                <th>Nombre</th>
		                <th>Apellido</th>
		                <th>Fecha nacimiento</th>
		                <th>Email</th>

		                <th>Rol</th>
		              </tr>
		            </thead>
		            <tbody>
		             <tr>
		                <td data-label="Nickname">Bob</td>
		                <td data-label="Nombre">Smith</td>
		                <td data-label="Apellido">Northeastern University</td>
		                <td data-label="Nacimiento">Computer Science</td>
		                <td data-label="Email">@gmail</td>
		                <td data-label="Rol">Socio</td>
		              </tr>

		            </tbody>
		          </table>

		        </div>  -->  
			<br></br>
				<!-- Opcion para PROFESOR --> 
	            	<form action="ConsultaListadoUsuario" method="post">
				            <button class="btn btn-primary width-100">Ver Actividades y Clases</button>
					</form>
				<!-- Opcion para SOCIO 
					<form action="ConsultaListadoUsuario" method="post">
				            <button class="btn btn-primary width-100">Ver  Clases</button>
					</form>--> 
			<br></br>
			</div>
			


	</div>
	
	
	<!-- FIN Cuerpo de la pagina -->
	
	

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