package org.ics.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
    public Tournament updateTournament(Tournament tournament) {
    	em.merge(tournament);
    	return tournament;
    }
}
