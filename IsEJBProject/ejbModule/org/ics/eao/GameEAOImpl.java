package org.ics.eao;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ics.ejb.Game;
import org.ics.ejb.Team;
import org.ics.ejb.Tournament;
import org.ics.interceptor.LogInterceptor;

@Stateless
@Interceptors(LogInterceptor.class)
public class GameEAOImpl implements GameEAOLocal {

	@PersistenceContext(unitName = "ISP")

	private EntityManager em;

	public GameEAOImpl() {
	}

	public Game findGame(String gameID) {
		return em.find(Game.class, gameID);
	}

	public Game createGame(Game game) {
		em.persist(game);
		return game;
	}

	public void updateGame(Game game) {
		em.merge(game);
	}
	
	public void addTeam(String gameId, String teamId) {
		Game tmpGame = this.findGame(gameId);
		Team tmpTeam = em.find(Team.class, teamId);
		if (tmpGame != null && tmpTeam != null) {
			tmpGame.getTeams().add(tmpTeam);

		}
	}
}
