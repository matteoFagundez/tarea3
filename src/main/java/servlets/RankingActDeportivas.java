package servlets;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import publicadores.ControladorPublish;
import publicadores.ControladorPublishService;
import publicadores.ControladorPublishServiceLocator;
import publicadores.DtActDeportiva;
import publicadores.DtClase;
import publicadores.DtSocio;

/**
 * Servlet implementation class RankingClases
 */
@WebServlet("/RankingActDeportivas")
public class RankingActDeportivas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RankingActDeportivas() {
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
		
		if (request.getParameter("boton").equals("actD")){
			ArrayList<publicadores.DtActDeportiva> actD = null;
			try {
				actD = (ArrayList<publicadores.DtActDeportiva>) RankingDeActividadesD();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(actD.toString());
			request.setAttribute("actD", actD);
			request.setAttribute("mostrar", "actD");
		}
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher("/infoRankingActividadD.jsp");
		rd.forward(request, response);
	}
	public ArrayList<publicadores.DtActDeportiva> RankingDeActividadesD() {
		ControladorPublishService cps = new ControladorPublishServiceLocator();
		ControladorPublish port = null;
		try {
			port = cps.getControladorPublishPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		publicadores.DtActDeportiva[] dtActD = null;
		try {
			dtActD = port.rankingDeActividadesD();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<publicadores.DtActDeportiva> lstAct= new ArrayList<>();
		for (int i = 0; i < dtActD.length; ++i) {
			lstAct .add(dtActD [i]);
		}
		return lstAct;
	}
}
