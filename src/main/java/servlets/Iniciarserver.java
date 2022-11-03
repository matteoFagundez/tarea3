package servlets;


import java.io.IOException;
import java.util.ArrayList;

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




@WebServlet("/Iniciarserver")
public class Iniciarserver extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Iniciarserver() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			listarDtUsuario();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        RequestDispatcher rd;
        request.setAttribute("login", "OK");
        rd = request.getRequestDispatcher("/inicioSesion.jsp");
        rd.forward(request, response);
        System.out.println("hola\n");

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

}
