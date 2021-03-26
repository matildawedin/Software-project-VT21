package org.ics.eao;

import java.util.List;

import javax.ejb.Local;

import org.ics.ejb.Tournament;

@Local
public interface TournamentEAOLocal {

	public Tournament findTournament(String tournamentID);
	public Tournament createTournament(Tournament tournament);
	public void updateTournament(Tournament tournament);
	public List<Tournament> findAllTournaments();
	 public String generateIDTour(String tournamentName);
}
