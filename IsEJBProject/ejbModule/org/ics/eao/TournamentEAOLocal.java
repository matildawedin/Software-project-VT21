package org.ics.eao;

import java.util.List;

import javax.ejb.Local;

import org.ics.ejb.Team;
import org.ics.ejb.Tournament;

@Local
public interface TournamentEAOLocal {

	public Tournament findTournament(String tournamentID);
	public Tournament createTournament(Tournament tournament);
	public Tournament updateTournament(Tournament tournament);
	public List<Tournament> findAllTournaments();
	public void addParticipant(String tournamentId, String teamId);
}
