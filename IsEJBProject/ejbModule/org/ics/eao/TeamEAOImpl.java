package org.ics.eao;


import java.util.List;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.OptimisticLockException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ics.ejb.Team;
import org.ics.ejb.Tournament;
import org.ics.interceptor.LogInterceptor;

/**
 * Session Bean implementation class TeamEAOImpl
 */
@Stateless
@Interceptors(LogInterceptor.class)
public class TeamEAOImpl implements TeamEAOLocal {

	@PersistenceContext(unitName = "ISP")  

	private EntityManager em;
   
    public TeamEAOImpl() { }
    
    public Team findTeam(String teamID) {
    	return em.find(Team.class, teamID);
    }
    
    public Team createTeam(Team team) {
    	em.persist(team);
    	
    	return team;
    }
    
    public void updateTeam(Team team) {
    	
    	try {
    		em.merge(team);
    	}
    	catch(OptimisticLockException o) {
    		//error hantering
    	}
    	
    }
   
    public List<Team> findAllTeams(){
    	
    	try {
    		TypedQuery<Team> query = em.createNamedQuery("Team.findAllTeams()", Team.class);
    		List<Team> results = query.getResultList();
    		return results;
    	}
    	catch(Exception e) {
    		
    		//error hantering???
    		
    		return null;
    	}
    }
    public void addParticipantFromTeam(String teamId, Tournament tournament) {
		Team tmpTeam = this.findTeam(teamId);
		if (tmpTeam != null && tournament != null) {
			tmpTeam.getTournaments().add(tournament);
		}
    }
   
}
