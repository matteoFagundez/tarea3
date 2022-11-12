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
        <link rel="stylesheet" href="css/MovimientoI.css"> <!-- css para CUERPO CENTRAL-->
         <link rel="stylesheet" type="text/css" href="css/table-responsive.css">  <!-- css para TBLA RESPONSIVE-->
       
		

		<title>Consulta Dictado de Clase</title>

	<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script>
        function validacion(){
            var formvalido = true;


            <%String n,d,du,c2,f,i,t;n=(String) request.getAttribute("Clase");d=(String) request.getAttribute("Fecha");
            du=(String) request.getAttribute("HoraI");c2=(String) request.getAttribute("Url");f=(String) request.getAttribute("FechaR");
            i=(String) request.getAttribute("Imagen");t=(String)request.getAttribute("Titulo");%>
            Swal.fire({
            	title: '<%=t%>',
            	html:' <b><%=n%></b><br><b><%=d%></b><br><b><%=du%></b><br><b><%=c2%></b><br><b><%=f%></b>',
            	icon:'info',
            	backdrop: true,
            	imageUrl: '<%=i%>',
            	imageWidth: '400px',
            });

            return formvalido;

        }
    </script>
    </head>
    <body>

	
	<!-- Cuerpo de la pagina -->
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
	<div class="div-form">

	        <%
	    	ArrayList<DtInstitucionD> inst= (ArrayList<DtInstitucionD>)session.getAttribute("LIntitucines");
	    	%>  
       		<div align="center" class="div-dataUser" style="background-color:#33475b">
                    <h1 class="font-weight-bold mb-3"> Consulta Dictado de Clase</h1>
                      <form action="ConsultaDictC" method="post">
							<div class="input-group mb-3">
								<div class="form-row mb-2">
								<!-- --------------------------- ACA PONE LA DATA------------------------------------ -->
									<label class="input-group-text" for="inputGroupSelect01">Institución:</label>
								</div>
								<select class="custom-select" id="inputGroupSelect01" name="institucion" required>						
									<%
									if(inst!=null){
									for(DtInstitucionD a:inst){%>
										<option value="<%=a.getNombre()%>"><%=a.getNombre()%></option>
									<%}}%>
									
								</select> 
								<input type="submit" value="Enviar" name="enviar">
								<input id="prodId" name="prodId" type="hidden" value="noup">							
								
							</div>
							</form>
							<%if(request.getAttribute("mostrarAct")=="OK"){ 
								String[] Act=(String[])request.getAttribute("Actdep");
							%>
								<FONT COLOR="white">
						     		<p>Institucion Seleccionada: <%=request.getAttribute("Institucion")%></p>
								</FONT>
								<form action="ConsultaDictC" method="post">
								<div class="input-group mb-3">
									<div class="input-group-prepend">
										<label class="input-group-text" for="inputGroupSelect01">Actividad</label>
									</div>
									<select class="custom-select" id="inputGroupSelect03" name="Actividad" required>
										<%
										if(Act!=null){
										for(String ac:Act){%>
											<option value="<%=ac%>"><%=ac%></option>
										<%}}%>
									</select>
									<input type="submit"  value="Enviar" name="enviar">
									<input id="prodId" name="prodId" type="hidden" value="<%=request.getAttribute("Institucion")%>">
									<input id="prodId" name="prodIdA" type="hidden" value="noup">
									<input id="prodId" name="envioAct" type="hidden" value="OK">
								</div>
								</form>	
								
								<%if(request.getAttribute("mostrarClas")=="OK"){ 
									String[] Cl=(String[])request.getAttribute("clases");
								%>
								<FONT COLOR="white">
					     			<p>Actividad Seleccionada: <%=request.getAttribute("Actividad")%></p>
								</FONT>
								<form action="ConsultaDictC" method="post">
									<div class="input-group mb-3">
										<div class="input-group-prepend">
											<label class="input-group-text" for="inputGroupSelect01">Clase</label>
										</div>
										<select class="custom-select" id="inputGroupSelect03" name="clase" required>
											<%
											if(Cl!=null){
											for(String c:Cl){%>
												<option value="<%=c%>"><%=c%></option>
											<%}}%>
										</select>
										<input type="submit"  value="Enviar" name="enviar">
										<input id="prodId" name="prodId" type="hidden" value="<%=request.getAttribute("Institucion")%>">
										<input id="prodId" name="prodIdA" type="hidden" value="<%=request.getAttribute("Actividad")%>">
										<input id="prodId" name="envioCl" type="hidden" value="OK">
									</div>
								</form>	
								<% }%>					
								<%if(request.getAttribute("Datos")=="OK"){  %>
					                <script>  
					                	validacion();   
					                </script>
				               	  <%} %>	
			
							<%} %>         
              </div>
       	</div>
       

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    
    <div id="carrusel-contenido">
            <div id="carrusel-caja">
                <div class="carrusel-elemento">
                    <img class="imagenes" src="imagenes/ratam.jpg" >
                </div>
                <div class="carrusel-elemento">   
                    <img class="imagenes" src="imagenes/palavagos.gif">
                </div>
                <div class="carrusel-elemento">   
                    <img class="imagenes" src="imagenes/working.gif">                        
                </div>
            </div>
        </div>
    
    
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