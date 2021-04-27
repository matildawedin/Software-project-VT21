package ics.junit.ejb;

import javax.naming.InitialContext;
import javax.naming.Context;

import org.ics.ejb.Tournament;
import org.ics.facade.FacadeLocal;



import junit.framework.TestCase;

public class TournamentBeanTest extends TestCase {
	
	Tournament tournament;

	public TournamentBeanTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		Context context = new InitialContext();
		   
		tournament=(Tournament)context.lookup("java:app/IsEJBProject/TournamentEAOImpl!org.ics.eao.TournamentEAOLocal");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		tournament = null; //Test
	}
	public void testTournamentMethods() throws Exception { //�r inte tanken att vi ska skapa nya objekt som ska testas i denna metod? 
		tournament.setTournamentName("Giro D'italia");
		tournament.setSport("Cycling");
		assertEquals(tournament.getTournamentName(),"Giro D'italia");
		assertEquals(tournament.getSport(),"Cycling");
	}
	
	public void testTournamentMethods2() throws Exception {
		
	}
	
	//WHAT METHODS TO PUT HERE? ALL METHODS IN FacadeLocal's...?

}
