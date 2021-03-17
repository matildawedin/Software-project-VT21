package org.ics.eao;

import javax.ejb.Local;

import org.ics.ejb.Tournament;

@Local
public interface TournamentEAOLocal {

	public Tournament findTournament(String tournamentID);
	public Tournament createTournament(Tournament tournament);
}
