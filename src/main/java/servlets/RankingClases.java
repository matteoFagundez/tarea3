package servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import publicadores.DtClase;
import publicadores.DtSocio;
import publicadores.ControladorPublish;
import publicadores.ControladorPublishService;
import publicadores.ControladorPublishServiceLocator;

/**
 * Servlet implementation class RankingClases
 */
@WebServlet("/RankingClases")
public class RankingClases extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RankingClases() {
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
		
		
		if (request.getParameter("boton").equals("clase")){
			ArrayList<publicadores.DtClase> clases = (ArrayList<publicadores.DtClase>) rankingDeClases();
			request.setAttribute("clases", clases);
			request.setAttribute("mostrar", "clases");
		}
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/infoRankingClase.jsp");
		rd.forward(request, response);
	}
	
	public ArrayList<publicadores.DtClase> rankingDeClases() {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = null;
		try {
			port = cps.getControladorPublishPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publicadores.DtClase[] dtClases = null;
		try {
			dtClases = port.rankingDeClases();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<publicadores.DtClase> lstClase = new ArrayList<>();
		for (int i = 0; i < dtClases.length; ++i) {
			lstClase .add(dtClases [i]);
		}
		return lstClase;
	}
	
    
}
