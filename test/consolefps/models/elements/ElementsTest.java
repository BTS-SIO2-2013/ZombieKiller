/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models.elements;

import consolefps.models.Position;
import consolefps.models.elements.Elements;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author krilivye
 */
public class ElementsTest {
    
    public ElementsTest() {
    }

    /**
     * Test of getPosition method, of class Elements.
     */
    @Test
    public void testGetPosition() {
        //Arrange
        Position pos = new Position(0,1);
        Elements instance = new ElementsImpl();
        
        
        //Act
        instance.setPosition(pos);
        Position result =  instance.getPosition();
        
        //Assert
        assertEquals(pos, result);
        
    }

    /**
     * Test of setPosition method, of class Elements.
     */
    @Test
    public void testSetPosition_int_int() {
        //Arrange
        int x = 1;
        int y = 2;
        Elements instance = new ElementsImpl();
        
        //Act
        instance.setPosition(x, y);
        
        //Assert
        assertEquals(x, instance.getPosition().getX());
        assertEquals(y, instance.getPosition().getY());
    }

    public class ElementsImpl extends Elements {

        @Override
        public String afficher() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}
