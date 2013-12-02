package consolefps.models;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krilivye
 */
public class GrilleTest {
    
    public GrilleTest() {
    }
    
    @Test
    public void testGrilleParDefaut(){
        //Act
        Grille grid = new Grille();
        
        //Assert
        assertEquals(5,grid.getNbColonnes());
        assertEquals(5,grid.getNbLignes());
        assertTrue(grid.getElements() !=null);
    }
    @Test
    public void testEntete(){
        //Arrange
        Grille grid = new Grille();
        
        //Act
        String s = grid.entete();
        
        //Assert
        assertEquals("  0  1  2  3  4 \n", s);
        
    }
    
    @Test
    public void testCaseVide(){
        //Arrange
        Grille grid = new Grille();
        
        //Act
        String s = grid.caseVide();

        //Assert
        assertEquals("[ ]", s);
         
    }
    
    @Test
    public void afficherLigne(){
        //Arrange
        Grille grid = new Grille();
        
        //Act
        String s = grid.afficherLigne(0);
        
        //Assert
        assertEquals("0[ ][ ][ ][ ][ ]\n", s);
    }
    
    @Test
    public void testafficherGrille(){
        //Arrange
        Grille grid = new Grille();
        grid.setNblignes(2);
        grid.setNbColonnes(2);
        
        //Act
        String s = grid.afficherGrille();
        
        //Assert
        assertEquals(
                     grid.entete()+
                     "0[ ][ ]\n"+
                     "1[ ][ ]\n", s); 
    }
}
