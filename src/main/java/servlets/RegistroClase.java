package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import publicadores.DtActDeportiva;
import publicadores.DtClase;
import publicadores.DtProfesor;
import publicadores.DtSocio;
import publicadores.DtUsuario;
import publicadores.ControladorPublish;
import publicadores.ControladorPublishService;
import publicadores.ControladorPublishServiceLocator;

/**
 * Servlet implementation class AuxCargaDatos
 */
@WebServlet("/RegistroClase")
public class RegistroClase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroClase() {
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
        
        String institucion=request.getParameter("prodId");
        if(institucion.equals("noup")) {
        	institucion = request.getParameter("institucion");
        	System.out.println("Primer caso");
        }
        String actividad = request.getParameter("prodIdA");
        if(actividad!=null&&actividad.equals("noup")) {
        	actividad = request.getParameter("Actividad");
        } 
        String MostrarMA = request.getParameter("envioAct");
        String MostrarMC = request.getParameter("envioCl");
        String Reguistrar = request.getParameter("envioReg");
        
        System.out.println(institucion+" "+actividad+" "+MostrarMA+" "+MostrarMC);

        	String[] act;
			try {
				act = listarActividades(institucion);
				request.setAttribute("Actdep", act);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			RequestDispatcher rd;
			request.setAttribute("Institucion", institucion);
			
			request.setAttribute("mostrarAct", "OK");	
			request.setAttribute("Actividad", actividad);
			
		
			if(MostrarMA!=null&&MostrarMA.equals("OK")) {
		        request.setAttribute("mostrarClas", "OK");
		        String[] ca;
				try {
					ca = listarClase(institucion, actividad);
					request.setAttribute("clases", ca);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
			}
			
			if(MostrarMC!=null&&MostrarMC.equals("OK")) {
				String Ca= request.getParameter("clase");
				DtClase ca;
				try {
					ca = buscarclase(Ca);
					request.setAttribute("DtClase", ca);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
		        request.setAttribute("MostrarDClase", "OK");
		        
			}
			
			if(Reguistrar!=null&&Reguistrar.equals("OK")) {
				String nomC = request.getParameter("prodIdC");
				HttpSession sesion = request.getSession();
				DtUsuario use= (DtUsuario)sesion.getAttribute("usuario");
				try {
					registroDictadoClases(nomC, actividad, institucion, use.getNickname());
					request.setAttribute("Titulo", "Se agrego con Exito");
					request.setAttribute("Tipo", "success");
					request.setAttribute("Imagen", "imagenes/exito.gif");
				} catch (Exception e) {
					request.setAttribute("Titulo", "Usted ya esta Reguistrado");
					request.setAttribute("Tipo", "error");
					request.setAttribute("Imagen", "imagenes/exito.gif");
					e.printStackTrace();
				}
				request.setAttribute("Datos", "OK");
			}
			rd = request.getRequestDispatcher("/RegistroClase.jsp");
			
			rd.forward(request, response);

        doGet(request, response);
	}
	public void registroDictadoClases(String nomC, String actividad,String institucion, String nombreU) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		port.registroDictadoClases(nomC, actividad, institucion, nombreU);
	}
	public String[] listarClase(String institucion, String actividadDep) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		String[] nomC = port.listarClase(institucion, actividadDep) ;
		return nomC;
	}
	public String[] listarActividades(String institucion) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		String[] nomA = port.listarActividades(institucion) ;
		return nomA;
	}
	
	public DtClase buscarclase(String nombre) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		return port.buscarclase(nombre);
	}  
	
	public DtActDeportiva buscaractividad(String nombre) throws Exception {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
		return port.buscaractividad(nombre);
	}
}