package org.ics.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ics.ejb.Team;
import org.ics.ejb.Tournament;

/**
 * Session Bean implementation class TournamentEAOImpl
 */
@Stateless
public class TournamentEAOImpl implements TournamentEAOLocal {


	@PersistenceContext(unitName = "ISP")  
	private EntityManager em;
    
    public TournamentEAOImpl() {}

    
    public Tournament findTournament(String tournamentID) {
    	return em.find(Tournament.class, tournamentID);
    }
    
    public Tournament createTournament(Tournament tournament) {
    	em.persist(tournament);
    	return tournament;
    }
    
    public void updateTournament(Tournament tournament) {
    	em.merge(tournament);
    }

	public List<Tournament> findAllTournaments() {

		TypedQuery<Tournament> query = em.createNamedQuery("Tournament.findAllTournaments", Tournament.class);
		List<Tournament> results = query.getResultList();
		return results;
	}
}
