package org.ics.facade;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.ics.eao.TeamEAOLocal;
import org.ics.eao.TournamentEAOLocal;
import org.ics.eao.TournamentTeamEAOLocal;
import org.ics.ejb.Team;
import org.ics.ejb.Tournament;
import org.ics.ejb.TournamentTeam;

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
	TournamentTeamEAOLocal tournamentTeam;
	
  
    public Facade() {}
    
    //---------- Tournament ---------
    public Tournament findTournament(String tournamentID) {
    	return tournament.findTournament(tournamentID);
    }
    
	public Tournament createTournament(Tournament tournament) {
		tournament = this.tournament.createTournament(tournament);
		return tournament;
	}
	
	//---------- Team ---------
	public Team findTeam(String teamID) {
		return team.findTeam(teamID);
	}
	
	public Team createTeam(Team team) {
		team = this.team.createTeam(team);
		return team;
	}
	
	//---------- TournamentTeam ---------
	public TournamentTeam createTournamentTeam(TournamentTeam tournamentTeam) {
		tournamentTeam = this.tournamentTeam.create(tournamentTeam);
		return tournamentTeam;
	}
	
	
	//public TournamentTeam findTournamentTeam(TournamentTeamID id){}
		

}
