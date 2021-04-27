package org.ics.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.ics.ejb.Team;
import org.ics.ejb.Tournament;
import org.ics.interceptor.LogInterceptor;

/**
 * Session Bean implementation class TournamentEAOImpl
 */
@Stateless
@Interceptors(LogInterceptor.class)
public class TournamentEAOImpl implements TournamentEAOLocal {

	@PersistenceContext(unitName = "ISP")
	private EntityManager em;

	public TournamentEAOImpl() {
	}

	public Tournament findTournament(String tournamentID) {
		return em.find(Tournament.class, tournamentID);
	}

	public Tournament createTournament(Tournament tournament) {
		em.persist(tournament);
		return tournament;
	}

	public Tournament updateTournament(Tournament tournament) {
		return em.merge(tournament);
	}
	public void removeTestTournament(String tournamentID) {
		Tournament tmpTour = this.findTournament(tournamentID);
				em.remove(tmpTour);
	}

	public List<Tournament> findAllTournaments() {

		TypedQuery<Tournament> query = em.createNamedQuery("Tournament.findAllTournaments", Tournament.class);
		List<Tournament> results = query.getResultList();
		return results;
	}

	public void addParticipant(String tournamentId, String teamId) {
		Tournament tmpTour = this.findTournament(tournamentId);
		Team tmpTeam = em.find(Team.class, teamId);
		if (tmpTour != null && tmpTeam != null) {

			tmpTour.getTeams().add(tmpTeam);

		}
	}
}
