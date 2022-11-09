
 <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
 <%@page import="java.io.ByteArrayInputStream"%>
 <%@page import="java.io.IOException"%>
 <%@page import="java.io.InputStream"%>
 <%@page import= "java.awt.Image" %>
 <%@page import= "javax.imageio.ImageIO" %>
 <%@page import="java.util.ArrayList"%>
 <%@page import="java.util.List"%>
 <%@page import="publicadores.DtInstitucionD"%>
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
        
        
       
        <title> TITULO</title>
       
		 <link rel="stylesheet" href="css/styleMenu.css"> 	<!-- css para la barra de MENU-->		
         <link rel="stylesheet" href="css/styleResponsive.css"> <!-- css para CUERPO CENTRAL RESPONISVE-->
	 <%@ include file="menu.jsp" %>
    </head>
    <body>
            <%
    ArrayList<DtInstitucionD> inst= (ArrayList<DtInstitucionD>)session.getAttribute("LIntitucines");
    String a=(String)request.getAttribute("Nombre");
    String b=(String)request.getAttribute("Url");
    String c=(String)request.getAttribute("Institucion");
    
    request.setAttribute("name", a);
    request.setAttribute("url2", b);
    request.setAttribute("Inst", c);
    
    String[] prof=(String[])request.getAttribute("Profes");
    String[] Act=(String[])request.getAttribute("Actdep");
    %>
    
    
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
		    <h2 class="font-weight-bold mb-3"> Alta de dictado de clases</h2>
     

                    <form action="AgregarClase" method="post">

                        <div class="form-row mb-2">
                            <div class="form-group col-md-6">
                                <label class="font-weight-bold">Nombre <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" placeholder="Nombre de la clase" name="nomClase" required value="${name}">
                            </div>
                            <div class="form-group col-md-6">
                                <label class="font-weight-bold">Url <span class="text-danger">*</span></label>
                                <input type="url" id="url" name="url" class="form-control" placeholder="Ingrese URL" name="url" required value="${url2}">
                              
                            </div>
                        </div>
                        
                       	<div class="input-group mb-3">
							<div class="input-group-prepend">
								<label class="input-group-text" for="inputGroupSelect01">Institucion</label>
							</div>
							<select class="custom-select" id="inputGroupSelect01" name="institucion" required>
								<option selected>${Inst}</option>						
							</select>
						</div>

						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<label class="input-group-text" for="inputGroupSelect01">Profesor</label>
							</div>
							<select class="custom-select" id="inputGroupSelect02" name="Profesor" required>
								<%
								if(prof!=null){
									int i=0;
								for(String pr:prof){%>
									<option value="<%=pr%>"><%=pr%></option>
								<%}}%>
							</select>
						</div>

						<div class="input-group mb-3">
							<div class="input-group-prepend">
								<label class="input-group-text" for="inputGroupSelect01">Actividad</label>
							</div>
							<select class="custom-select" id="inputGroupSelect03" name="Actividad" required>
								<%
								if(Act!=null){
									int i=0;
								for(String ac:Act){%>
									<option value="<%=ac%>"><%=ac%></option>
								<%}}%>
							</select>
						</div>
						
						<div class="form-group mb-4">
                            <label class="font-weight-bold">Fecha <span class="text-danger">*</span></label>
                            <input type="date" id="fecha" class="form-control" name="fecha" required>
                        </div>
                        <div class="form-group mb-4">
                            <label class="font-weight-bold">Hora <span class="text-danger">*</span></label>
                            <input type="time" id="hora" class="form-control" name="hora" required>
                        </div>
                        <div class="form-group mb-4">
                            <label class="font-weight-bold">Foto <span class="text-danger">*</span></label>
                            <input type="file" id="file" class="form-control" name="foto">
                        </div>

                        <button type="submit" id="btnRegistrar" class="btn btn-primary width-100">Regístrar</button>
                        
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