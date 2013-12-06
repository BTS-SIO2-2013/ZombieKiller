/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

import consolefps.models.elements.Joueur;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krilivye
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testDeplacer(){
        //Arrange
        Sens sens = Sens.BAS;
        Joueur j = new Joueur(0,0);
 
        //Act
        j.deplacer(sens);
        System.out.println(sens);
        System.out.println(j.getPosition());
        
        //Assert
        assertEquals(new Position(0,1), j.getPosition());
    }
    
    @Test
    public void testDeplacer2(){
        //Arrange
        Sens sens = Sens.DROITE;
        Joueur j = new Joueur(0,0);
 
        //Act
        j.deplacer(sens);
        
        //Assert
        assertEquals(new Position(1,0), j.getPosition());
   
    
    }
    
    @Test
    public void testDeplacer3(){
        //Arrange
        Sens sens = Sens.DROITE;
        Joueur j = new Joueur(0,0);
 
        //Act
        j.deplacer(sens);
        j.deplacer(sens);
        
        //Assert
        assertEquals(new Position(2,0), j.getPosition());    
    }
    
    @Test
    public void testPositionSuivante(){
        //Arrange
        Sens haut = Sens.HAUT;
        Sens bas = Sens.BAS;
        Sens gauche = Sens.GAUCHE;
        Sens droite = Sens.DROITE;
        Joueur j = new Joueur(0,0);
        //Act
        Position posHaut = j.positionSuivante(haut);
        Position posBas = j.positionSuivante(bas);
        Position posGauche = j.positionSuivante(gauche);
        Position posDroite = j.positionSuivante(droite);
        //Assert
        assertEquals(new Position(0,-1), posHaut);
        assertEquals(new Position(0,1), posBas);
        assertEquals(new Position(-1,0), posGauche);
        assertEquals(new Position(1,0), posDroite);
        
    }
}
