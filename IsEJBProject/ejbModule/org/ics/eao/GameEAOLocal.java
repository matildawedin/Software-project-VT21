package org.ics.eao;

import javax.ejb.Local;

import org.ics.ejb.Game;
import org.ics.ejb.Team;

@Local
public interface GameEAOLocal {
	
	public Game findGame(String gameID);
	public Game createGame(Game game);
	public void updateGame(Game game);
	public void addTeam(String gameId, String teamId);
}
