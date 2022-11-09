
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
		                <td data-label="Nacimiento"><%=p.getFechaNac().getTime().getDate()%>/<%=(p.getFechaNac().getTime().getMonth()+1)%>/<%=(p.getFechaNac().getTime().getYear()+1900)%></td>
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
			 
			 <%if(request.getAttribute("mostrarTablas")=="OK"){%>
			 <h2 class="font-weight-bold mb-3"> Clases Asociadas</h3>
				          <table>
				            <thead>		
				              <tr>
				                <th>Clase</th>
				                <th>Fecha</th>
				                <th>Inicio</th>
				                <th>URL</th>
				                <th>Registro</th>
				              </tr>
				            </thead>
				            <tbody>
				            
				            
				            <%ArrayList<publicadores.DtClase> clase = (ArrayList<publicadores.DtClase>) request.getAttribute("clase"); 
								if (clase != null) {
									for (publicadores.DtClase c : clase) {
										String horaI;
										if(c.getHoraInicio().getTime().getMinutes()<=9) {
											horaI=String.valueOf(c.getHoraInicio().getTime().getHours() + ":0" +c.getHoraInicio().getTime().getMinutes());
										}
										else {
											horaI=String.valueOf(c.getHoraInicio().getTime().getHours() + ":" +c.getHoraInicio().getTime().getMinutes());
										}
										String horaR;
										if(c.getFechaReg().getTime().getMinutes()<=9) {
											horaR=String.valueOf(c.getFechaReg().getTime().getHours() + ":0" +c.getFechaReg().getTime().getMinutes());
										}
										else {
											horaR=String.valueOf(c.getFechaReg().getTime().getHours() + ":" +c.getFechaReg().getTime().getMinutes());
										}
							%>
					             <tr>
					                <td data-label="Clase"><%=c.getNombre()%></td>
					                <td data-label="Fecha"><%=c.getFecha().getTime().getDate()%>/<%=(c.getFecha().getTime().getMonth()+1)%>/<%=(c.getFecha().getTime().getYear()+1900)%></td>  <!-- traer fecha-->
					                <td data-label="Inicio"><%=horaI%></td> <!-- traer minutos-->
					                <td data-label="URL"><%=c.getUrl()%></td>
					                <td data-label="Registro"><%=c.getFechaReg().getTime().getDate()%>/<%=(c.getFechaReg().getTime().getMonth()+1)%>/<%=(c.getFechaReg().getTime().getYear()+1900)%><%=" "+horaR%></td> <!-- traer fecha y hora-->
					              </tr>
										<%}%>
									<%}else{%>
										<tr>
											<th><li>vacio</li></th>
											<td><li>vacio</li></td>
											<td><li>vacio</li></td>
											<td><li>vacio</li></td>
											<td><li>vacio</li></td>
										</tr><%}%>
					            </tbody>
					          </table>

		          </div>
		          <br></br>
			 <form action="ConsultaUser" method="post">
					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<label class="input-group-text" for="inputGroupSelect01">Clase</label>
								</div>
								<select class="custom-select" id="selectclase" name="selectclase" required>
										<%
										if(clase != null){%>
										<option value="select">Seleccione Clase</option>
										<%
										for(publicadores.DtClase ca : clase){%>
											<option value="<%=ca.getNombre()%>"><%=ca.getNombre()%></option>
										<%}}%>
								</select>
								<input type="submit" value="Enviar" name="enviar">
								<input id="prodId" name="MostrarDatos" type="hidden" value="OK">
							</div>		
					</form>
		           	
		           	<div class="div-actividades" id="wrapper">
			          <br></br>
			          <%if(use instanceof publicadores.DtProfesor){
						ArrayList<publicadores.DtActDeportiva> actDepo = (ArrayList<publicadores.DtActDeportiva>) request.getAttribute("actD");%> 
			          <h2 class="font-weight-bold mb-3"> Actividades deportivas Asociadas</h3>
				          <table>
				            <thead>		
				              <tr>
				                <th>Nombre</th>
				                <th>Descripcion</th>
				                <th>Duracion</th>
				                <th>Costo</th>
				                <th>Registro</th>
				              </tr>
				            </thead>
				            <tbody>
				            <%if (actDepo != null) {
								for (publicadores.DtActDeportiva dta : actDepo) {
									String horaRa;
									if(dta.getFecha().getTime().getMinutes()<=9) {
										horaRa=String.valueOf(dta.getFecha().getTime().getHours() + ":0" +dta.getFecha().getTime().getMinutes());
									}
									else {
										horaRa=String.valueOf(dta.getFecha().getTime().getHours() + ":" +dta.getFecha().getTime().getMinutes());
									}
								%>
						             <tr>
						                <td data-label="Nombre"><%=dta.getNombre()%></td>
						                <td data-label="Descripcion"><%=dta.getDescripcion()%></td>
						                <td data-label="Duracion"><%=String.valueOf(dta.getDuracion()+" min")%></td>
						                <td data-label="Costo"><%=String.valueOf(dta.getCosto()+"$")%></td>
						              	<td data-label="Registro"><%=dta.getFecha().getTime().getDate()%>/<%=(dta.getFecha().getTime().getMonth()+1)%>/<%=(dta.getFecha().getTime().getYear()+1900)%><%=" "+horaRa%></td> <!-- traer fecha y hora-->
						              </tr>
								     <%		
								}
							}else{ 
										%>
									<tr>
										<th><li>vacio</li></th>
										<td><li>vacio</li></td>
										<td><li>vacio</li></td>
										<td><li>vacio</li></td>
										<td><li>vacio</li></td>
									
									</tr>
							<%
							}
									%>
				            </tbody>
				          </table>

		          </div>
				  <br></br>
		          <form action="ConsultaUser" method="post">
					<div class="input-group mb-3">
						<div class="input-group-prepend">
							<label class="input-group-text" for="inputGroupSelect01">Actividades</label>
								</div>
								<select class="custom-select" id="selectAct" name="selectAct" required>
											<%if(actDepo != null){%>
												<option value="select">Seleccione Actividad</option>
												<%for(publicadores.DtActDeportiva ca : actDepo){%>
												<option value="<%=ca.getNombre()%>"><%=ca.getNombre()%></option>
											<%}}%>
								</select>
								<input type="submit" value="Enviar" name="enviar">
								<input id="prodId" name="MostrarDatos" type="hidden" value="OK">
							</div>		
					</form> <%} %>
					 <%if(request.getAttribute("Datos")=="OK"){  %>
	                <script>  
	                	validacion();   
	                </script>
               	  <%} %>
		           <br></br>
			 
			 
			 <%}else{ %>			 
				 <%if(use instanceof publicadores.DtProfesor){%>
	            	<form action="ConsultaUser" method="post">
				            <button class="btn btn-primary width-100">Ver Actividades y Clases</button>
					</form>
	                <%} else{%>
	                <form action="ConsultaUser" method="post">    
				          <button class="btn btn-primary width-100">Ver  Actividades</button>		        
					</form>
	                <%} %>
			<%} %>
			<br></br>
			</div>
	</div>
	
	
	<!-- FIN Cuerpo de la pagina -->
	

    </body>
</html>