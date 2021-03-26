package org.ics.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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
		
		//l�gg till object i tables
		
		Team t = new Team();
		t.setTeamName("Leo");
		String id = facade.generateID("Leo");
		t.setTeamID(id);
		facade.createTeam(t);
		out.println(t.getTeamID() + t.getTeamName());
		
		Tournament tournament = new Tournament();
		tournament.setTournamentName("VM");
		tournament.setSport("Fotboll");
		String idTour = facade.generateIDTour("VM");
		tournament.setTournamentID(idTour);
		out.println(tournament.getTournamentID()+ tournament.getSport()+ tournament.getTournamentName());
		
		
		facade.createTournament(tournament);
		
		
//		//H�mtar alla teams och tournaments genom queries
//		out.println("<h3>Alla Teams</h3>");
//		List<Team> allTeams = facade.findAllTeams();
//		for(Team t : allTeams) {
//			out.println(t.getTeamName());
//		}
//		out.println("<h3>Alla Tournament</h3>");
//		List<Tournament> allTournament = facade.findAllTournaments();
//		for(Tournament t : allTournament) {
//			out.println(t.getTournamentName());
//		}
//		Tournament tmpTournament = facade.findTournament("I101");
//		out.println("<p>Tournament: "+tmpTournament.getTournamentName()+" has the following teams:<br>");
//		for(Team tmpTeam: tmpTournament.getTeams()) 
//		{
//			out.println("<p>Team: "+tmpTeam.getTeamID() +" | Name: "+ tmpTeam.getTeamName()+"</p>");
//		}
		out.println("</body></html>");
		out.close();
	}

}
