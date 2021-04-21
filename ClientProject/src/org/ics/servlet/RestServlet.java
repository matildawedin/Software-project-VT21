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
		Team team = facade.findTeam(id);
		sendAsJson(response, team);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	private void sendAsJson(HttpServletResponse response, Team team)
			 throws IOException {

			PrintWriter out = response.getWriter();
			response.setContentType("application/json");
			if (team != null) {
			out.print("{\"Team name\":");
			out.print("\"" + team.getTeamName() + "\"");
			out.print(",\" Team id\":");
			out.print("\"" +team.getTeamID()+"\"");
			} else {
			out.print("{ }");
			}
			out.flush();
			}


}
