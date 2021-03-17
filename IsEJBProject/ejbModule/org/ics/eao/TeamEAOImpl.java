package org.ics.eao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ics.ejb.Team;

/**
 * Session Bean implementation class TeamEAOImpl
 */
@Stateless
public class TeamEAOImpl implements TeamEAOLocal {

	@PersistenceContext(unitName = "LabEJBSql")  //byta unitnamn?? i percistence.xml filen?
	private EntityManager em;
   
    public TeamEAOImpl() { }
    
    public Team findTeam(String teamID) {
    	return em.find(Team.class, teamID);
    }
    
    public Team createTeam(Team team) {
    	em.persist(team);
    	return team;
    }
    
    public Team updateTeam(Team team) {
    	em.merge(team);
    	return team;
    }
}
