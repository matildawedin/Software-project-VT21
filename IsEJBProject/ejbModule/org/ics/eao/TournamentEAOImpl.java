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
	 public String generateIDTour(String tournamentName) {
	    	TypedQuery<String> query= em.createNamedQuery("Tournament.generateIDTour()",String.class);
	    	String tmp = query.getResultList().get(0);
	    	String teamID = null;
	    	if (tmp.length() == 4) {
	    		StringBuilder sb = new StringBuilder();
				sb.append(tmp.charAt(1));
				sb.append(tmp.charAt(2));
				sb.append(tmp.charAt(3));
				String charString = sb.toString();
				int number = Integer.parseInt(charString);
				if (tmp != null) {
				number++;
	    	}
	    	String newString = Integer.toString(number);
			StringBuilder newSb = new StringBuilder();
			newSb.append(tmp.charAt(0));
			newSb.append(newString);
			teamID = newSb.toString();
	    }
	    	 return teamID;
	}
}
