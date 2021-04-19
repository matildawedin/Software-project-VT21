package org.ics.servlet;

import java.io.IOException;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.interceptor.Interceptors;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.ics.ejb.Tournament;
import org.ics.facade.FacadeLocal;
import org.ics.interceptor.LogInterceptor;

//@Interceptors(LogInterceptor.class)   // funkar ej 
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private FacadeLocal facade;
   
    public MainServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = null;

		String operation = request.getParameter("operation");
		
		if(operation.equals("Show")) {  
			String id = request.getParameter("txtID");
			Tournament tournament = facade.findTournament(id);
			request.setAttribute("tournament", tournament);
			url ="/Show.jsp";
		}
		else if(operation.equals("Update")) {
			Tournament tournament = facade.findTournament(request.getParameter("txtID"));
			tournament.setTournamentName(request.getParameter("txtName"));
			tournament.setSport(request.getParameter("txtSport"));
			facade.updateTournament(tournament);
			request.setAttribute("tournament", tournament);
			url ="/Show.jsp";
		}
		else if (operation.equals("Create")) {
			Tournament tournament = new Tournament();
			String tmpId = facade.generateID("TOURNAMENT");
			tournament.setTournamentID(tmpId);
			tournament.setTournamentName(request.getParameter("name"));
			tournament.setSport(request.getParameter("sport"));
			tournament.setVersion(1);
			tournament = facade.createTournament(tournament);
			request.setAttribute("newTournament", tournament);
			url = "/AddParticipants.jsp";
		}
		else if (operation.equals("Home")) {
			url = "/Search.jsp";
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
}
