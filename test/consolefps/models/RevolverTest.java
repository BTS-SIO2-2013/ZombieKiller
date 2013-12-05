package consolefps.models;

import static org.junit.Assert.*;

import org.junit.Test;

import consolefps.models.elements.Revolver;

public class RevolverTest {

	
	 public RevolverTest() {
    }
	 
	 
	 @Test
	 public void testAfficherRevolver() {
        //Arrange
        Revolver r = new Revolver(3, 3);
        
        //Act
        String s = r.afficher();
        
        //Assert 
        assertEquals("[r]", s);
    }

}
