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

import org.ics.ejb.Game;
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
		/*
		Team team1 = new Team();
		team1.setTeamName("TestTeam1");
		String id1 = facade.generateID("TEAM");
		team1.setTeamID(id1);
		facade.createTeam(team1);
		out.println("<h3>New Team with ID: "+team1.getTeamID());
		out.println("Name: "+ team1.getTeamName()+"</h3>");
		
		Team team2 = new Team();
		team2.setTeamName("TestTeam1");
		String id2 = facade.generateID("TEAM");
		team2.setTeamID(id2);
		facade.createTeam(team2);
		out.println("<h3>New Team with ID: "+team2.getTeamID());
		out.println("Name: "+ team2.getTeamName()+"</h3>");
		
		Tournament tour = new Tournament();
		tour.setTournamentName("TestTournament1");
		tour.setSport("Test");
		String id3 = facade.generateID("TOURNAMENT");
		tour.setTournamentID(id3);
		facade.createTournament(tour);
		//facade.addParticipantFromTeam(id2, tour);
		facade.addParticipant(id3, id2);
		out.println("<h3>New Tournament with ID: "+tour.getTournamentID());
		out.println("Name: "+ tour.getTournamentName()+"</h3>");
		
		/*
		Game game = new Game();
		String id4 = facade.generateID("GAME");
		game.setGameID(id4);
		game.setRound(1);
		game.setParticipantOne(id1);
		game.setParticipantTwo(id2);
		game.setTournamentID(id3);
		game.setTournamentID(id3);
		game.setVersion(0);
		facade.createGame(game);
		out.println("<h3>New Game with ID: "+game.getGameID());
		out.println("Belonging to TournamentID: "+ game.getTournamentID());
		out.println("With participantOne being: "+game.getParticipantOne());
		out.println("And participantTwo being: "+game.getParticipantTwo()+"</h3>");
		*/
		
		out.println("<h3>Alla Teams</h3>");
		List<Team> allTeams = facade.findAllTeams();
		for(Team t : allTeams) {
			out.println(t.getTeamName());
		}
		out.println("<h3>Alla Tournament</h3>");
		List<Tournament> allTournament = facade.findAllTournaments();
		for(Tournament t : allTournament) {
		out.println(t.getTournamentName());
		}
		Tournament tmpTournament = facade.findTournament("I101");
		out.println("<p>Tournament: "+tmpTournament.getTournamentName()+" has the following teams:<br>");
		for(Team tmpTeam: tmpTournament.getTeams()) 
		{
			out.println("<p>Team: "+tmpTeam.getTeamID() +" | Name: "+ tmpTeam.getTeamName()+"</p>");		}
		out.println("</body></html>");
		out.close();
	}

}
