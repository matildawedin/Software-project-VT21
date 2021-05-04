package ics.junit.ejb;

import javax.naming.InitialContext;
import javax.naming.Context;

import org.ics.ejb.Tournament;
//import org.ics.ejb.Tournament;
import org.ics.facade.FacadeLocal;

import junit.framework.TestCase;

public class TournamentBeanTest extends TestCase {
	
	
	FacadeLocal facade;
	String expectedId;
	String expectedTournamentName;
	String expectedSport;
	Tournament tournament;


	public TournamentBeanTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		Context context = new InitialContext();
		   
//		tournament=(Tournament)context.lookup("java:app/IsEJBProject/TournamentEAOImpl!org.ics.eao.TournamentEAOLocal");
		facade=(FacadeLocal)context.lookup("java:app/IsEJBProject/Facade!org.ics.facade.FacadeLocal");
		
		expectedId = "I400";
		expectedTournamentName = "Allsvenskan";
		expectedSport = "Fotball";
		
		tournament = new Tournament(expectedId, expectedTournamentName, expectedSport);
	}
	protected void tearDown() throws Exception { //Ha med metod som tar bort i databasen ocks�, 
		super.tearDown();
		facade.removeTestTournament(expectedId);
		facade = null;
		tournament = null;
	}
	public void testTournamentMethods() throws Exception { //�r inte tanken att vi ska skapa nya objekt som ska testas i denna metod? 
	
	tournament = facade.createTournament(tournament);
	assertEquals(tournament.getTournamentID(), expectedId);
	assertEquals(tournament.getTournamentName(),expectedTournamentName);
	assertEquals(tournament.getSport(), expectedSport);
	}
}
