package org.ics.facade;

import java.util.List;

import javax.ejb.Local;

import org.ics.ejb.Game;
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
	 public Game findGame(String gameID);
	 public Game createGame(Game game);
	 public void updateGame(Game game);
	 public String generateID(String type);
	 public void addParticipant(String tournamentId, String teamId);
	 public void addParticipantFromTeam(String teamId, Tournament tournament);
}
