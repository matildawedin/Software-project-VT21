package org.ics.servlets;

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

	public RestServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pathInfo = request.getPathInfo();
		if (pathInfo == null || pathInfo.equals("/")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		String[] splits = pathInfo.split("/");
		if (splits.length != 2) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		String id = splits[1];
		Tournament tour = facade.findTournament(id);
		sendAsJson(response, tour);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pathInfo = request.getPathInfo();
		if (pathInfo == null || pathInfo.equals("/")) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		String[] splits = pathInfo.split("/");
		if (splits.length != 2) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST);
			return;
		}
		BufferedReader reader = request.getReader();
		Tournament tour = parseJsonTournament(reader);
		System.out.println(tour.getTournamentID());
		try {

			facade.updateTournament(tour);
		} catch (Exception e) {
			System.out.println("facade Update Error");
		}
		sendAsJson(response, tour);
	}

	private void sendAsJson(HttpServletResponse response, Tournament tour) throws IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		if (tour != null) {
			out.print("{\"txtID\":");
			out.print("\"" + tour.getTournamentID() + "\"");
			out.print(",\"txtName\":");
			out.print("\"" + tour.getTournamentName() + "\"");
			out.print(",\"txtSport\":");
			out.print("\"" + tour.getSport() + "\"}");
		} else {
			out.print("{ }");
		}
		out.flush();
	}

	private Tournament parseJsonTournament(BufferedReader br) {
		JsonReader jsonReader = null;
		JsonObject jsonRoot = null;
		jsonReader = Json.createReader(br);
		jsonRoot = jsonReader.readObject();
		Tournament tour = facade.findTournament(jsonRoot.getString("id"));
		tour.setTournamentName(jsonRoot.getString("name"));
		tour.setSport(jsonRoot.getString("sport"));

		return tour;
	}
}
