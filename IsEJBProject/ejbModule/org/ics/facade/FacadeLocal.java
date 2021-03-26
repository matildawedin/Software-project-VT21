package org.ics.facade;

import java.util.List;

import javax.ejb.Local;

import org.ics.ejb.Team;
import org.ics.ejb.Tournament;

@Local
public interface FacadeLocal{

	
	 public Tournament findTournament(String tournamentID);
	 public Tournament createTournament(Tournament tournament);
	 public void updateTournament(Tournament tournament);
	 public Team findTeam(String teamID);
	 public Team createTeam(Team team);
	 public void updateTeam(Team team);
	 public List<Team> findAllTeams();
	 public List<Tournament> findAllTournaments();
	 public String generateID(String teamName);
	 public String generateIDTour(String tournamentName);
}
