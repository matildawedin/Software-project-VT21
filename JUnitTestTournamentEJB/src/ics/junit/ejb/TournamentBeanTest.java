package ics.junit.ejb;

import javax.naming.InitialContext;
import javax.naming.Context;

import org.ics.facade.FacadeLocal;



import junit.framework.TestCase;

public class TournamentBeanTest extends TestCase {
	
	FacadeLocal facade;

	public TournamentBeanTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		Context context = new InitialContext();
		   
		facade=(FacadeLocal)context.lookup("java:app/IsEJBProject/Facade!org.ics.facade.FacadeLocal");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		facade = null; //Test
	}
	public void testFacadeMethods() throws Exception { //�r inte tanken att vi ska skapa nya objekt som ska testas i denna metod? 
		
	}
	
	//WHAT METHODS TO PUT HERE? ALL METHODS IN FacadeLocal's...?

}
