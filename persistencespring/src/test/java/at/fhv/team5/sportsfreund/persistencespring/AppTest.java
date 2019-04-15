package at.fhv.team5.sportsfreund.persistencespring;

import at.fhv.persistencespring.entities.Actor;
import at.fhv.persistencespring.entities.Film;
import at.fhv.persistencespring.entities.Genre;
import at.fhv.persistencespring.entities.Language;
import at.fhv.persistencespring.facade.Facade;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
   		assert(true);
    }
}
