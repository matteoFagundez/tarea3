package servlets;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import publicadores.ControladorPublish;
import publicadores.ControladorPublishService;
import publicadores.ControladorPublishServiceLocator;
import publicadores.DtClase;
import publicadores.DtUsuario;

import java.io.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;



@WebServlet("/ModificarUsuario")
public class ModificarUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ModificarUsuario() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        String nick = request.getParameter("nick");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");

        String fechaString = request.getParameter("fecha"); //Toma la fecha como String del formulario
        
        String password = request.getParameter("password");
        String Url = request.getParameter("Url");
        String oldUrl = request.getParameter("oldUrl");
        String fullUrl;
        
        Calendar fecha =  formatoCalendar(fechaString); // La convierte en Calendar
        System.out.println(fecha);
       
			
	        if(Url == null || Url =="") {
	        	fullUrl = oldUrl; 

	        }else {
	        	fullUrl = "imagenes/"+Url;
	        	
	        }
	        try {
				modificarUsuario(nick, nombre, apellido, fecha, password, fullUrl);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 
	        HttpSession sesion = request.getSession();
	        sesion.removeAttribute("usuario");
	        DtUsuario user = null;
			try {
				user = login(nick, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        sesion.setAttribute("usuario", user);
	        RequestDispatcher rd;
	        rd = request.getRequestDispatcher("/modificarUsuario.jsp");
	        request.setAttribute("Exito", "OK");
	        rd.forward(request, response);


    }
    public void modificarUsuario(String nick, String nombre, String apellido, Calendar fecha, String password, String fullUrl) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		port.modificarUsuario(nick, nombre, apellido, fecha, password, fullUrl);
	}
    public publicadores.DtUsuario login(String nick, String password) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		return port.login(nick, password);
	}  
    
    
    //CONVIERTE STRING EN FORMATO CALENDAR
    public static Calendar formatoCalendar(String DateHum){
      String[] fecVct = DateHum.split("-");
      int dia = Integer.parseInt(fecVct[0]);
      int mes = Integer.parseInt(fecVct[1])-1;
      int year = Integer.parseInt(fecVct[2]);
      Calendar cal;
      cal = Calendar.getInstance();
      cal.clear();
      cal.set(year,mes,dia);

      return cal;
    }
}