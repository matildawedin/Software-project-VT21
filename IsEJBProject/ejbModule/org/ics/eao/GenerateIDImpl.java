package org.ics.eao;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.ics.interceptor.LogInterceptor;

/**
 * Session Bean implementation class GenerateIDImpl
 */
@Stateless
@Interceptors(LogInterceptor.class)
public class GenerateIDImpl implements GenerateIDLocal {

	@PersistenceContext(unitName = "ISP")

	private EntityManager em;

	public GenerateIDImpl() {
	}
	/*Method for returning new ID from a specified table. 
	It selects the current top ID, breaks it down and adds to the number. 
	Then sowing it back together and returning it as a string.*/
	public String generateID(String type) {
		TypedQuery<String> query = null;
		if (type.toUpperCase() == "TEAM") {
			query = em.createNamedQuery("Team.generateID()", String.class);
		} else if (type.toUpperCase() == "TOURNAMENT") {
			query = em.createNamedQuery("Tournament.generateID()", String.class);
		} else if (type.toUpperCase() == "GAME") {
			query = em.createNamedQuery("Game.generateID()", String.class);
		}
		String tmp = query.getResultList().get(0);
		String newID = null;

		if (tmp.length() == 4) {
			StringBuilder sb = new StringBuilder();
			sb.append(tmp.charAt(1));
			sb.append(tmp.charAt(2));
			sb.append(tmp.charAt(3));
			String charString = sb.toString();
			int number = Integer.parseInt(charString);
			number++;

			String newString = Integer.toString(number);
			StringBuilder newSb = new StringBuilder();
			newSb.append(tmp.charAt(0));
			newSb.append(newString);
			newID = newSb.toString();
		}
		return newID;
	}

}
