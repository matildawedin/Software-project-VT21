package org.ics.facade;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ics.eao.GenericEAOLocal;
import org.ics.eao.TeamEAOLocal;
import org.ics.eao.TournamentEAOLocal;
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
	
	
	public Facade() {}
	
	/* test kod

	@EJB
	private GenericEAOLocal eao;
    
    public T createTournament(T tournament) {
    	tournament = eao.create(tournament);
    	return tournament;
    }
*/
	

    
    //---------- Tournament ---------
    public Tournament findTournament(String tournamentID) {
    	return tournament.findTournament(tournamentID);
    }
    
	public Tournament createTournament(Tournament tournament) {
		tournament = this.tournament.createTournament(tournament);
		return tournament;
	}
	
	public void updateTournament(Tournament tournament) {
    	this.tournament.updateTournament(tournament);
    
    }
	public List<Tournament> findAllTournaments() {
		return tournament.findAllTournaments();
	}
	
	//---------- Team ---------
	public Team findTeam(String teamID) {
		return team.findTeam(teamID);
	}
	
	public Team createTeam(Team team) {
		team = this.team.createTeam(team);
		return team;
	}
	public void updateTeam(Team team) {
    	this.team.updateTeam(team);
    }

	public List<Team> findAllTeams() {
		return team.findAllTeams();
	}

	
	

		

}
