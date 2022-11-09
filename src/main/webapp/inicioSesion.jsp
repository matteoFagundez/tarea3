<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link href = "css/inicioSesion.css" rel="stylesheet">
    
</head>
<style>
		body{
			background: url("imagenes/InicioS/fondo.jpg");
			background-position: center center;
	
		}
		
		.container{
			margin: 0 auto;
			margin-top: | | auto;
			background: rgba(0, 0, 0, 0.6);
			border-radius: 15px;
		}
	</style>
<body onload="getcookiedata()">
    <%if(request.getAttribute("login")!="OK"){ %>
	    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	    <script src="js/sweetAlert.js"></script>
    <%}%>
    
   
    <form action="IniciarSesion" method="post">
    <div class="container">
        
        <div class="card">
            <h3>Sign Up</h3>
            <div class="inputBox">
                <input type="text" required name="nameUser" id="nameUser">
                <span>Username</span>
            </div>
            <div class="inputBox">
                <input type="password" required name="passwardUser" id="passwardUser">
                <span>Password</span>
            </div>
            <div class="checkbox">
            	<label>
            		<input type="checkbox" name="rememberme" id="rememberme" onclick="setcookie()"> Remember me</label>
            </div>
            <button>Enter</button>
        </div>
		
    </div>
	    <script>
	
	   		function setcookie(){
				var u = document.getElementById('nameUser').value;
				var p = document.getElementById('passwardUser').value;
				
				var d = new Date();
		  		d.setTime(d.getTime() + (300*1000)); // expiran en 5 minutos
		  		var expires = "expires="+ d.toUTCString();
				
		  		/*
				document.cookie="myusername="+u+";path=http:8080://localhost/Tar2/";
				document.cookie="mypswd="+p+";path=http:8080://localhost/Tar2/";
				*/
				
				// HACER QUE LAS COOKIES EXPIREN DESPUES DE 5 minutos
				document.cookie="myusername="+u+";"+expires+";path=http:8080://localhost/Tar2/";
				document.cookie="mypswd="+p+";"+expires+";path=http:8080://localhost/Tar2/";
				
			}
			
			function getcookiedata(){
				
				console.log(document.cookie);
				
				var user=getCookie('myusername');
				var pswd=getCookie('mypswd');
				
				document.getElementById('nameUser').value = user;
				document.getElementById('passwardUser').value = pswd;    		
			}
		    function getCookie(cname) {
		    	  var name = cname + "=";
		    	  var decodedCookie = decodeURIComponent(document.cookie);
		    	  var ca = decodedCookie.split(';');
		    	  for(var i = 0; i <ca.length; i++) {
		    	    var c = ca[i];
		    	    while (c.charAt(0) == ' ') {
		    	      c = c.substring(1);
		    	    }
		    	    if (c.indexOf(name) == 0) {
		    	      return c.substring(name.length, c.length);
		    	    }
		    	  }
		    	  return "";
		    }
	    </script>
    	</form>
</body>
</html>