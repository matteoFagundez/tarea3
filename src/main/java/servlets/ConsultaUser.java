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
@WebServlet("/ConsultaUser")
public class ConsultaUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaUser() {
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

		String MostrarDatos= request.getParameter("MostrarDatos");
		

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
 		
 		if(MostrarDatos!=null&&MostrarDatos.equals("OK")) {
 			String nomclase = request.getParameter("selectclase");
 	        String nomact = request.getParameter("selectAct");
 			String n,d,du,c,f;
 	        if(nomclase!=null||nomclase=="select") {
 	        	try {
					DtClase ca=buscarclase(nomclase);
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
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 		        
 	        }else if(nomact!=null||nomact!="select") {
				try {
				DtActDeportiva a = buscaractividad(nomact);
				n="Actividad: "+a.getNombre();
 	        	d="Descripcion: "+a.getDescripcion();
 	        	du="Duracion: "+a.getDuracion()+" min";
 	        	c="Costo: $"+a.getCosto();
 	        	String horaR;
 				if(a.getFecha().getTime().getMinutes()<=9) {
 					horaR=String.valueOf(a.getFecha().getTime().getHours() + ":0" +a.getFecha().getTime().getMinutes());
 				}
 				else {
 					horaR=String.valueOf(a.getFecha().getTime().getHours() + ":" +a.getFecha().getTime().getMinutes());
 				}
 	        	f="Fecha de Reguistro: "+a.getFecha().getTime().getDate()+"/"+(a.getFecha().getTime().getMonth()+1)+"/"+(a.getFecha().getTime().getYear()+1900)+"  "+horaR;
 	        	request.setAttribute("Clase", n);
 		        request.setAttribute("Fecha", d);
 		        request.setAttribute("HoraI", du);
 		        request.setAttribute("Url", c);
 		        request.setAttribute("FechaR", f);
 		        request.setAttribute("Datos", "OK");
 		        request.setAttribute("Titulo", "Datos de Actividad Seleccionada:");
 		        if(a.getUrlI()==null||a.getUrlI()==""){
 		        	request.setAttribute("Imagen", "imagenes/nohayI.webp");
 		        }else {
 		        	String u=a.getUrlI();
 		        	request.setAttribute("Imagen", u);
 		        }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 	        }
 		}
 		request.setAttribute("mostrarTablas", "OK");
 		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/consultaUsuario.jsp");
		rd.forward(request, response);
	}
	
	public ArrayList<publicadores.DtActDeportiva> listarDatoActdepP(publicadores.DtProfesor profe) throws Exception{
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = cps.getControladorPublishPort();
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
