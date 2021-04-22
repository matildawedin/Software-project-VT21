package org.ics.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ics.ejb.Team;
import org.ics.ejb.Tournament;
import org.ics.facade.FacadeLocal;

/**
 * Servlet implementation class RestServlet
 */
@WebServlet("/RestServlet/*")
public class RestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	FacadeLocal facade;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		if(pathInfo == null || pathInfo.equals("/")){
		 System.out.println("Alla");
		 System.out.println(pathInfo);
		 return;
		}
		String[] splits = pathInfo.split("/");
		if(splits.length != 2) {
		 System.out.println("Alla2");
		 response.sendError(HttpServletResponse.SC_BAD_REQUEST);
		 return;
		}
		String id = splits[1];
		Tournament tour = facade.findTournament(id);
		sendAsJson(response, tour);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	

	private void sendAsJson(HttpServletResponse response, Tournament tour)
			 throws IOException {

			PrintWriter out = response.getWriter();
			response.setContentType("application/json");
			if (tour != null) {
			out.print("{\"txtID\":");
			out.print("\"" + tour.getTournamentName() + "\"");
			out.print(",\"txtName\":");
			out.print("\"" +tour.getTournamentID()+"\"");
			out.print(",\"txtSport\":");
			out.print("\"" +tour.getSport()+"\"");
			out.print(",\"txtVersion\":");
			out.print("\"" +tour.getVersion()+"\"");
			
			} else {
			out.print("{ }");
			}
			out.flush();
			}

}
