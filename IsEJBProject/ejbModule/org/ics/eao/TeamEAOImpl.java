package org.ics.eao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ics.ejb.Team;

/**
 * Session Bean implementation class TeamEAOImpl
 */
@Stateless
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
    	em.merge(team);
    }
   
    
    public List<Team> findAllTeams(){
    	
    	TypedQuery<Team> query = em.createNamedQuery("Team.findAllTeams()", Team.class);
    	List<Team> results = query.getResultList();
    	return results;
    }
    public String generateID() {
    	TypedQuery<Team> query= em.createNamedQuery("TeamGenerateQuery", Team.class);
    	String tmp = query.toString();
    	String teamID = null;
    	if (tmp.length() == 4) {
    		StringBuilder sb = new StringBuilder();
			sb.append(tmp.charAt(1));
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
