package org.ics.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ics.eao.GameEAOLocal;
import org.ics.eao.GenerateIDLocal;
//import org.ics.eao.GenericEAOLocal;
import org.ics.eao.TeamEAOLocal;
import org.ics.eao.TournamentEAOLocal;
import org.ics.ejb.Game;
import org.ics.ejb.Team;
import org.ics.ejb.Tournament;

/**
 * Session Bean implementation class Facade
 */
@Stateless
public class Facade implements FacadeLocal {

	
	@EJB
	TournamentEAOLocal tournament;
	
	@EJB
	TeamEAOLocal team;
	
	@EJB
	GameEAOLocal game;
	
	@EJB 
	GenerateIDLocal id;
	
	public Facade() {}
	
    //---------- Tournament ---------\\
    public Tournament findTournament(String tournamentID) {
    	return tournament.findTournament(tournamentID);
    }
    
	public Tournament createTournament(Tournament tournament) {
		tournament = this.tournament.createTournament(tournament);
		return tournament;
	}
	
	public Tournament updateTournament(Tournament tournament) {
    	this.tournament.updateTournament(tournament);
		return tournament;
    
    }
	public List<Tournament> findAllTournaments() {
		return tournament.findAllTournaments();
	}
	public void removeTestTournament(String tournamentID) {
		this.tournament.removeTestTournament(tournamentID);
	}
	//---------- Team ---------\\
	public Team findTeam(String teamID) {
		return team.findTeam(teamID);
	}
	
	public Team createTeam(Team team) {
		team = this.team.createTeam(team);
		return team;
	}
	public Team updateTeam(Team team) {
    	this.team.updateTeam(team);
		return team;
    }

	public List<Team> findAllTeams() {
		return team.findAllTeams();
	}
	//---------- Game ---------\\
	public Game findGame(String gameID) {
		return game.findGame(gameID);
	}
	
	public Game createGame(Game game) {
		game = this.game.createGame(game);
		return game;
	}
	public void updateGame(Game game) {
    	this.game.updateGame(game);
    }
	//---------- Generate ---------\\
	 public String generateID(String type){
		 return this.id.generateID(type);
	 }
	 public void addParticipant(String tournamentId, String teamId) {
		 this.tournament.addParticipant(tournamentId, teamId);
	 }
	 
	 public void addTeam(String gameId, String teamId) {
		 this.game.addTeam(gameId, teamId);
	 }

	
	

		

}
