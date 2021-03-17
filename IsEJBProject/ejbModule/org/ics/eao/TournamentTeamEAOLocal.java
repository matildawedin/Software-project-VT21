package org.ics.eao;

import javax.ejb.Local;

import org.ics.ejb.TournamentTeam;

@Local
public interface TournamentTeamEAOLocal {

	//public TournamentTeam findTournamentTeam(TournamentTeamID id);
	public TournamentTeam create(TournamentTeam tournamentTeam);
}
