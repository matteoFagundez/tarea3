
 <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
 <%@page import="java.io.ByteArrayInputStream"%>
 <%@page import="java.io.IOException"%>
 <%@page import="java.io.InputStream"%>
 <%@page import= "java.awt.Image" %>
 <%@page import= "javax.imageio.ImageIO" %>
 <%@page import="java.util.ArrayList"%>
 <%@page import="java.util.List"%>
  <%@page import="java.util.Date"%>
 <%@ page import="java.util.GregorianCalendar"%>
 <%@page import="java.util.ArrayList"%>
 <%@page import="java.util.List"%>
 <%@page import="java.io.OutputStream"%>
 <%@page import="java.awt.image.BufferedImage"%>
 <%@page import="java.io.File"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    		<style>
			#customers {
			  font-family: Arial, Helvetica, sans-serif;
			  border-collapse: collapse;
			  width: 100%;
			}
			
			#customers td, #customers th {
			  border: 1px solid #ddd;
			  padding: 8px;
			}
			
			#customers tr:nth-child(even){background-color: #66CDAA;}
			
			#customers tr:hover {background-color: #04BA6D;}
			
			#customers th {
			  padding-top: 12px;
			  padding-bottom: 12px;
			  text-align: left;
			  background-color: #008B8B;
			  color: black;
			}
		</style>
    
    
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
        
        
       
        <title> Ranking dictado de clases</title>
		<link rel="stylesheet" href="css/styleMenu.css"> 	<!-- css para la barra de MENU-->		
        <link rel="stylesheet" href="css/rankingClases.css"> <!-- css para CUERPO CENTRAL RESPONISVE-->
        <link rel="stylesheet" type="text/css" href="css/table-responsive.css">  <!-- css para TBLA RESPONSIVE-->
         
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
	   		<%
			String mostrar = (String) request.getAttribute("mostrar");
			if (mostrar.equals("clases")){
			ArrayList<DtClase> clases = (ArrayList<DtClase>) request.getAttribute("clases");
			%>
     	<div class="div-form"> <!-- Contenedor responsive -> ver codigo css en css/mosficarUsuario.css -->
	    	<div align="center" class="div-dataUser" style="background-color:#33475b"> <!-- Segundo contenedor responsive -> ver codigo css en css/mosficarUsuario.css -->
		                   <h2 class="font-weight-bold mb-3" style="color:white"> Ranking de clases</h1>
							<div class="form-row mb-2">
							<!-- ACA PONE LA DATA -->
							  <table>
					            <thead>		
					              <tr>
					                <th>POSICION</th>
					                <th>NOMBRE</th>
					                <th>URL</th>
					                <th>FECHA</th>
					              </tr>
					            </thead>
					            <tbody>
					            	<%
										if (clases != null) {
										int i = 1;
											for (DtClase dtc : clases) {
									%>
					             <tr>
					                <td data-label="POSICION"> <%=i%></td>
					                <td data-label="NOMBRE"> <%=dtc.getNombre()%></td>
					                <td data-label="URL"> <%=dtc.getUrl()%></td>
					                <td data-label="FECHA"><%=String.valueOf(dtc.getFecha().getTime().getDate() +"/"+(dtc.getFecha().getTime().getMonth()+1) + "/" +(dtc.getFecha().getTime().getYear()+1900))%></td>
					                
					                
					              </tr>
					              
									<%
												i++; 
											}
										}else{
									%>
									<tr>
					                <td data-label="POSICION"> <li>Vacio</li> </td>
					                <td data-label="NOMBRE"> <li>Vacio</li> </td>
					                <td data-label="URL"> <li>Vacio</li> </td>
					                <td data-label="FECHA"> <li>Vacio</li> </td>
									</tr>
										<%
										}
					            	
					            	
					            	}else if (mostrar.equals("clase")) {
													DtClase dtc = (DtClase) request.getAttribute("DtClase");%>
											<h1><%=dtc.toString()%></h1><%
										}%>
					            </tbody>
					          </table>
								
                            </div>
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