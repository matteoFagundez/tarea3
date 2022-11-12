 <%@page import="publicadores.DtUsuario"%>
 <%@page import="publicadores.DtProfesor"%>
 <%@page import="publicadores.DtSocio"%>
 <%@page import="publicadores.DtClase"%> 
 <%@page import="publicadores.DtActDeportiva"%>
 <%@page import="publicadores.DtInstitucionD"%>

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
     <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
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
    
        <title>Consulta Actividad Deportiva</title>
        
        <script>
        function validacion2(){
            var formvalido = true;


            <%String i,t,ti;t=(String)request.getAttribute("Titulo");ti=(String)request.getAttribute("Tipo");i=(String)request.getAttribute("Imagen");%>
            Swal.fire({
            	title: '<%=t%>',
            	icon:'<%=ti%>',
            	backdrop: true,
            	imageUrl: '<%=i%>',
            	imageWidth: '400px',
            });

            return formvalido;

        }
    	</script>
        
        
    </head>
    <body>
       
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
       <div class="div-form">

	        <%
	    	ArrayList<DtInstitucionD> inst= (ArrayList<DtInstitucionD>)session.getAttribute("LIntitucines");
	    	%>  
       		<div class="container align-self-center p-6">
                    <h1 class="font-weight-bold mb-3"> Registro de Socio a una Clase</h1>
                      <%if(request.getAttribute("MostrarDClase")!="OK"){%>
                      
                      <form action="RegistroClase" method="post">
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
									<form action="RegistroClase" method="post">
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
									<form action="RegistroClase" method="post">
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
						                	validacion2();   
						                </script>
					               	  <%} %>	
				
								<%} %>
							<%}else{
								DtClase Dc=(DtClase) request.getAttribute("DtClase");
							%>         
								<div class="titles-info" id="titles-info"> 
			                    <FONT COLOR="white">
						        <p> 
								<img class="imagen" src=<%if(Dc.getUrlI()==null || Dc.getUrlI()=="") {%>            
										            		"imagenes\user.png"  
											            <%}else{%>
											            	"<%=Dc.getUrlI()%>"	
											            <%}%>
								<%
									String horaI;
									if(Dc.getHoraInicio().getTime().getMinutes()<=9) {
										horaI=String.valueOf(Dc.getHoraInicio().getTime().getHours() + ":0" +Dc.getHoraInicio().getTime().getMinutes());
									}
									else {
										horaI=String.valueOf(Dc.getHoraInicio().getTime().getHours() + ":" +Dc.getHoraInicio().getTime().getMinutes());
									}
								%>
								<%
									String horaR;
									if(Dc.getFechaReg().getTime().getMinutes()<=9) {
										horaR=String.valueOf(Dc.getFechaReg().getTime().getHours() + ":0" +Dc.getFechaReg().getTime().getMinutes());
									}
									else {
										horaR=String.valueOf(Dc.getFechaReg().getTime().getHours() + ":" +Dc.getFechaReg().getTime().getMinutes());
									}
								%>					
								align="right" width="400" height="400">Nombre: <%=Dc.getNombre()%>&nbsp &nbsp &nbsp &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
								<br>Fecha: <%=Dc.getFecha().getTime().getDate()%>/<%=(Dc.getFecha().getTime().getMonth()+1)%>/<%=(Dc.getFecha().getTime().getYear()+1900)%>       
								<br>Hora de Inicio: <%=horaI%>
								<br>Url: <%=Dc.getUrl()%>
								<br>Fecha de Reguistro:<%=Dc.getFechaReg().getTime().getDate()%>/<%=(Dc.getFechaReg().getTime().getMonth()+1)%>/<%=(Dc.getFechaReg().getTime().getYear()+1900)%><%=" "+horaR%> <br>
								</p>
				                </FONT>
				                
					            <form action="RegistroClase" method="post">
									<input id="prodId" name="prodId" type="hidden" value="<%=request.getAttribute("Institucion")%>">
									<input id="prodId" name="prodIdA" type="hidden" value="<%=request.getAttribute("Actividad")%>">
									<input id="prodId" name="prodIdC" type="hidden" value="<%=Dc.getNombre()%>">
									<input id="prodId" name="envioReg" type="hidden" value="OK">
				            		<button class="btn btn-primary width-100">Reguistrar</button>
								</form>
								<br>
								<form action="RegistroClase.jsp" method="post">
				            		<button class="btn btn-primary width-100">Volver</button>
								</form>
								<br>
								<br>
							</div>
							
							<%}%>
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