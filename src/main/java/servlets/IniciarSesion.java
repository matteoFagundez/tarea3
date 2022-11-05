package servlets;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import publicadores.ControladorPublish;
import publicadores.ControladorPublishService;
import publicadores.ControladorPublishServiceLocator;
import publicadores.DtInstitucionD;
import publicadores.DtUsuario;


import java.io.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;



@WebServlet("/IniciarSesion")
public class IniciarSesion extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public IniciarSesion() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
    	String nickname = request.getParameter("nameUser");
        String password = request.getParameter("passwardUser");
        
        System.out.println("Nombre "+nickname+" Passward "+ password);
        publicadores.DtUsuario user = null;
		try {
			user = login(nickname, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        HttpSession sesion = request.getSession();
        if(user != null) {

        	sesion.setAttribute("usuario", user);
        	RequestDispatcher rd;
        	
        	
            request.setAttribute("inicio", "OK");
            request.setAttribute("login", "OK");
         List<publicadores.DtInstitucionD>  inst = null;
            try {
				inst= listadoDtIntiDtInstitucion();
				
				sesion.setAttribute("LIntitucines",inst);
				System.out.println("Guarde las inst"+inst.toString());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
        	rd = request.getRequestDispatcher("/home.jsp");
            rd.forward(request, response);
        }else {
            RequestDispatcher rd;
            request.setAttribute("login", "Error");
        	rd = request.getRequestDispatcher("/inicioSesion.jsp");
            rd.forward(request, response);
        }
        
		doGet(request, response);
       
    }
       
    
    

    
	//OPERACIÓN CONSUMIDA
  	public ArrayList<publicadores.DtUsuario> listarDtUsuario() throws Exception {
  		ControladorPublishService cps = new ControladorPublishServiceLocator();
  		ControladorPublish port = cps.getControladorPublishPort();
  		publicadores.DtUsuario[] usuarios = port.listarDtUsuario() ;
  		ArrayList<publicadores.DtUsuario> lstUsuarios  = new ArrayList<>();
  		for (int i = 0; i < usuarios .length; ++i) {
  		    lstUsuarios .add(usuarios [i]);
  		}
  		return lstUsuarios;
  	}
  	

  	
	public publicadores.DtUsuario login(String nick, String password) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		return port.login(nick, password);
	}  

  	public ArrayList<publicadores.DtInstitucionD> listadoDtIntiDtInstitucion() throws Exception {
  		ControladorPublishService cps = new ControladorPublishServiceLocator();
  		ControladorPublish port = cps.getControladorPublishPort();
  		publicadores.DtInstitucionD[] dtInstitutos = port.listadoDtIntiDtInstitucion() ;
  		ArrayList<publicadores.DtInstitucionD> lstDtIns  = new ArrayList<>();
  		for (int i = 0; i < dtInstitutos .length; ++i) {
  			lstDtIns .add(dtInstitutos [i]);
  		}
  		return lstDtIns;
  	}

	
}