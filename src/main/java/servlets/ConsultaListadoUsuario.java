package servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import publicadores.DtActDeportiva;
import publicadores.DtClase;
import publicadores.DtProfesor;
import publicadores.DtSocio;
import publicadores.DtUsuario;
import publicadores.ControladorPublish;
import publicadores.ControladorPublishService;
import publicadores.ControladorPublishServiceLocator;



/**
 * Servlet implementation class ConsultaListadoUsuario
 */
@WebServlet("/ConsultaListadoUsuario")
public class ConsultaListadoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaListadoUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		DtUsuario use= (DtUsuario)sesion.getAttribute("usuario");
		

 		if(use instanceof DtProfesor) {

			 try {
				ArrayList<publicadores.DtActDeportiva> actD = (ArrayList<publicadores.DtActDeportiva>) listarDatoActdepP((publicadores.DtProfesor)use);
				request.setAttribute("actD", actD);
				ArrayList<DtClase> clase = (ArrayList<DtClase>) listarDatoClasedeP((publicadores.DtProfesor)use);
				request.setAttribute("clase", clase);
			} catch (Exception  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {

			DtSocio s=(DtSocio) use;
			try {
				ArrayList<DtClase> clase = (ArrayList<DtClase>) listarDatoClasedeS(s);
				request.setAttribute("clase", clase);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/consultaUsuario2.jsp");
		rd.forward(request, response);
	}
	
	
	public ArrayList<publicadores.DtActDeportiva> listarDatoActdepP(publicadores.DtProfesor profe) throws Exception{
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		System.out.println("ANTES DE ACT...");
		publicadores.DtActDeportiva[] act= port.listarDatoActdepP(profe); //ERROR
		ArrayList<publicadores.DtActDeportiva> lstAct= new ArrayList<>(); 
		for (int i = 0; i < act.length; ++i) {
		    lstAct.add(act[i]);
		}
		return lstAct;
	}
	public ArrayList<publicadores.DtClase> listarDatoClasedeP(publicadores.DtProfesor profe) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		publicadores.DtClase[] dtClases = port.listarDatoClasedeP(profe) ;
		ArrayList<publicadores.DtClase> lstClase = new ArrayList<>();
		for (int i = 0; i < dtClases.length; ++i) {
			lstClase .add(dtClases [i]);
		}
		return lstClase;
	}
	
	public ArrayList<publicadores.DtClase> listarDatoClasedeS(publicadores.DtSocio socio) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		publicadores.DtClase[] dtClases = port.listarDatoClasedeS(socio) ;
		ArrayList<publicadores.DtClase> lstClase = new ArrayList<>();
		for (int i = 0; i < dtClases.length; ++i) {
			lstClase .add(dtClases [i]);
		}
		return lstClase;
	}
  
}
