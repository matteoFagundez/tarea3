
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@page import="java.io.ByteArrayInputStream"%>
 <%@page import="java.io.IOException"%>
 <%@page import="java.io.InputStream"%>
 <%@page import= "java.awt.Image" %>
 <%@page import= "javax.imageio.ImageIO" %>
<%@page import = "java.util.Date" %>
 <%@page import="java.util.ArrayList"%>
	<%@page import="java.util.List"%>

 <%@page import="java.util.ArrayList"%>
	<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<%@ include file="menu.jsp"  %>
	
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

	
	<!-- Cuerpo de la pagina -->
	
	<div class="div-form">
	  
			<div align="center" class="div-dataUser" style="background-color:#33475b">
  				<h2 class="font-weight-bold mb-3">  Datos </h2>
				<img class="avatar" src=<%if(use.getUrl()==null || use.getUrl()=="") {%>            
										            		"imagenes\user.png"  
											            <%}else{%>
											            	"<%=use.getUrl()%>"	
											            <%}%>" style="width:150px;height:180px;margin-left:16px;">
				
				<br></br>
					<%if(use instanceof publicadores.DtProfesor){
							publicadores.DtProfesor p = (publicadores.DtProfesor)use;%>
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
		                <td data-label="Nickname"><%=p.getNickname()%></td>
		                <td data-label="Nombre"><%=p.getNombre()%></td>
		                <td data-label="Apellido"> <%=p.getApellido()%></td>
		                <td data-label="Nacimiento"><%=p.getFechaNac().getTime()%></td>
		                <td data-label="Email"><%=p.getEmail()%></td>
		                <td data-label="Descripcion"><%=p.getDescripcion()%></td>
		                <td data-label="Biografia"><%=p.getBiografia()%></td>
		                <td data-label="Sitio Web"><%=p.getSitioWeb()%></td>
		                <td data-label="Rol">Profesor</td>
		              </tr>

		            </tbody>
		          </table>
		        </div>     <%}else{publicadores.DtSocio s= (publicadores.DtSocio)use;%> 
					<!-- TABLA PARA EL USUARIO TIPO SOCIO -->  
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
		                <td data-label="Nickname"><%=s.getNickname()%></td>
		                <td data-label="Nombre"><%=s.getNombre()%></td>
		                <td data-label="Apellido"> <%=s.getApellido()%></td>
		                <td data-label="Nacimiento">error</td>
		                <td data-label="Email"><%=s.getEmail()%></td>
		                <td data-label="Rol">Socio</td>
		              </tr>

		            </tbody>
		          </table>

		        </div>   <%} %>
			<br></br>
			 <%if(use instanceof publicadores.DtProfesor){%>
            	<form action="ConsultaListadoUsuario" method="post">
			            <button class="btn btn-primary width-100">Ver Actividades y Clases</button>
				</form>
                <%} else{%>
                <form action="ConsultaListadoUsuario" method="post">    
			          <button class="btn btn-primary width-100">Ver  Actividades</button>		        
				</form>
                <%} %>
			
			<br></br>
			</div>
	</div>
	
	
	<!-- FIN Cuerpo de la pagina -->
	

    </body>
</html>