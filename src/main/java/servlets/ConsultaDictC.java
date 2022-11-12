package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
@WebServlet("/ConsultaDictC")
public class ConsultaDictC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaDictC() {
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
        System.out.println(institucion+" "+actividad+" "+MostrarMA+" "+MostrarMC);
        try {
        	String[] act=listarActividades(institucion);
			RequestDispatcher rd;
			request.setAttribute("Institucion", institucion);
			request.setAttribute("Actdep", act);
			request.setAttribute("mostrarAct", "OK");	
			request.setAttribute("Actividad", actividad);
			
		
			if(MostrarMA!=null&&MostrarMA.equals("OK")) {
		        request.setAttribute("mostrarClas", "OK");
		        String[] ca = listarClase(institucion, actividad);
		        request.setAttribute("clases", ca);
			}
			
			if(MostrarMC!=null&&MostrarMC.equals("OK")) {
				String Ca= request.getParameter("clase");
				String n,d,du,c,f;
				DtClase ca=buscarclase(Ca); 
		        n="Clase: "+ca.getNombre();
		        d="Fecha: "+String.valueOf(ca.getFecha().getTime().getDate() +"/"+(ca.getFecha().getTime().getMonth()+1) + "/" +(ca.getFecha().getTime().getYear()+1900));
		        c="Url: "+ca.getUrl();		
				if(ca.getHoraInicio().getTime().getMinutes()<=9) {
					du ="Hora de inicio: "+ String.valueOf(ca.getHoraInicio().getTime().getHours() + ":0" +ca.getHoraInicio().getTime().getMinutes());
				}
				else {
					du ="Hora de inicio: "+String.valueOf(ca.getHoraInicio().getTime().getHours() + ":" +ca.getHoraInicio().getTime().getMinutes());
				}
				String horaR;
				if(ca.getFechaReg().getTime().getMinutes()<=9) {
					horaR=String.valueOf(ca.getFechaReg().getTime().getHours() + ":0" +ca.getFechaReg().getTime().getMinutes());
				}
				else {
					horaR=String.valueOf(ca.getFechaReg().getTime().getHours() + ":" +ca.getFechaReg().getTime().getMinutes());
				}
				f="Fecha de Reguistro: "+ca.getFechaReg().getTime().getDate()+"/"+(ca.getFechaReg().getTime().getMonth()+1)+"/"+(ca.getFechaReg().getTime().getYear()+1900)+"  "+horaR;
				
		        request.setAttribute("Clase", n);
		        request.setAttribute("Fecha", d);
		        request.setAttribute("HoraI", du);
		        request.setAttribute("Url", c);
		        request.setAttribute("FechaR", f);
		        request.setAttribute("Datos", "OK");
		        request.setAttribute("Titulo", "Datos de Clase Seleccionada:");
		        if(ca.getUrlI()==null||ca.getUrlI()==""){
		        	request.setAttribute("Imagen", "imagenes/nohayI.webp");
		        }else {
		        	String u=ca.getUrlI();
		        	request.setAttribute("Imagen", u);
		        }
		        request.setAttribute("mostrarClas", "OK");
		        String[] ca2 = listarClase(institucion, actividad);
		        request.setAttribute("clases", ca2);
			}
			rd = request.getRequestDispatcher("/consultadeDictadodeC.jsp");
			
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        doGet(request, response);
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
}