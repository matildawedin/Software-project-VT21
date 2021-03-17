package org.ics.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ics.ejb.Team;
import org.ics.ejb.Tournament;
import org.ics.facade.FacadeLocal;

/**
 * Servlet implementation class IsServlet
 */
@WebServlet("/IsServlet")
public class IsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   @EJB
   FacadeLocal facade;
   
    public IsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html><html><head>");
		out.println("<title>IS</title>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("</head><body>");
		
		out.println("<h2>IS</h2>");
		
		/* lägg till object i tables
		Team team = new Team();
		team.setTeamID("T1");
		team.setTeamName("Matilda");
		facade.createTeam(team);
		
		Tournament tournament = new Tournament();
		tournament.setTournamentID("T2");
		tournament.setSport("Fotboll");
		tournament.setTournamentName("VM");
		facade.createTournament(tournament);
		*/
		
		out.println("</body></html>");
		out.close();
	}

}
