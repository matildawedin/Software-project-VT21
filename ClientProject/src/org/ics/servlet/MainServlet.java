package org.ics.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ics.ejb.Team;
import org.ics.ejb.Tournament;
import org.ics.facade.FacadeLocal;


@WebServlet("/MainServlet/*")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private FacadeLocal facade;
   
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("inne i doGet");

		String url = null;
		
		String operation = request.getParameter("operation");
		
		if(operation.equals("Show")) {  
			String id = request.getParameter("txtID");
			Tournament tournament = facade.findTournament(id);
			request.setAttribute("tournament", tournament);
			url ="/Show.jsp";
		}
		else {
			url = "/Search.jsp";
		}
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
		//Med jQuery i separat js fil                      (FUNGERAR INTE JUST NU!!!)
		/*System.out.println("Inne i doget");

		String pathInfo= request.getPathInfo();
		System.out.println(pathInfo);
		
		if(pathInfo== null|| pathInfo.equals("/")){
			System.out.println("1 error" + pathInfo);
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		String[] splits= pathInfo.split("/");
		if(splits.length!= 2) {
			System.out.println("2 error" + pathInfo);
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		String id= splits[1];
		
		System.out.println(id);
		Tournament tournament= facade.findTournament(id);
		System.out.println(tournament.getTournamentName() + tournament.getSport() + tournament.getVersion());
		sendAsJson(response, tournament);
		
		*/
		
				
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inne i doPost");
		String url = null;

		String operation = request.getParameter("operation");
		if(operation.equals("Show")) {
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
			tournament.setVersion(0);
			tournament = facade.createTournament(tournament);
			List<String> tmpList = new ArrayList<String>();
			request.setAttribute("tournamentId", tmpId);
			request.setAttribute("teamName", "");
			request.setAttribute("teamList", tmpList);
			url = "/AddParticipants.jsp";
		}
		else if (operation.equals("Add")) {
			Team team = new Team();
			String tmpId = facade.generateID("TEAM");
			String teamName = request.getParameter("name");
			team.setTeamID(tmpId);
			team.setTeamName(teamName);
			team.setVersion(1);
			facade.createTeam(team);
			
			String tourId = request.getParameter("tourId").toString();
			facade.addParticipant(tourId, tmpId);
			
			
			List<String> list = new ArrayList<String>();
			List<String> oldList = (ArrayList<String>) request.getAttribute("teamList");
			list.addAll(oldList);
			list.add(teamName);
			
			request.setAttribute("teamList", list);
			request.setAttribute("tournamentId", tourId);
			request.setAttribute("teamName", team.getTeamName());
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
		//delete metod 
	}
	
	
	/*
	private void sendAsJson(HttpServletResponse response, Tournament tournament) throws IOException {
		System.out.println("inne i sendasjson");
		PrintWriter out= response.getWriter();
		response.setContentType("application/json");
		if(tournament!= null) {
			out.print("{\"txtID\":");
			out.print("\""+tournament.getTournamentID() + "\"");
			out.print(",\"txtName\":");
			out.print("\""+tournament.getTournamentName()+"\"");
			out.print(",\"txtSport\":");
			out.print("\""+tournament.getSport()+"\"");
			out.print(",\"txtVersion\":");
			out.print("\""+tournament.getVersion()+"\"}");
		} 
		else{
			out.print("{ }");
		}
		out.flush();
	}
	private Tournament parseJsonTournament(BufferedReader br){
		JsonReader jsonReader= null;
		JsonObject jsonRoot= null;
		jsonReader= Json.createReader(br);
		jsonRoot= jsonReader.readObject();
		System.out.println("JsonRoot: "+jsonRoot);
		Tournament tournament = new Tournament();
		tournament.setTournamentID(jsonRoot.getString("txtID"));
		tournament.setTournamentName(jsonRoot.getString("txtName"));
		tournament.setSport(jsonRoot.getString("txtSport"));
		tournament.setVersion(Integer.parseInt(jsonRoot.getString("txtVersion")));
		
		return tournament;
		}
*/
}
