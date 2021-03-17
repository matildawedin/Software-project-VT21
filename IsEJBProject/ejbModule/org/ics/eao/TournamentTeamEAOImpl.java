package org.ics.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ics.ejb.TournamentTeam;

/**
 * Session Bean implementation class TournamentTeamEAOImpl
 */
@Stateless
public class TournamentTeamEAOImpl implements TournamentTeamEAOLocal {

	@PersistenceContext(unitName = "LabEJBSql")  //byta unitnamn?? i percistence.xml filen?
	private EntityManager em;
    
    public TournamentTeamEAOImpl() { }
    
    /*public TournamentTeam findTournamentTeam(TournamentTeamID id) {
    	return em.find(TournamentTeam.class, id);
    }*/
    
    public TournamentTeam create(TournamentTeam tournamentTeam) {
    	em.persist(tournamentTeam);
    	return tournamentTeam;
    }

}
