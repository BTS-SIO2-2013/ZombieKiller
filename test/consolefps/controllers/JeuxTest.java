/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;

import java.util.List;
import consolefps.models.Grille;
import consolefps.models.elements.Joueur;
import consolefps.models.elements.Zombie;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krilivye
 */
public class JeuxTest {
    
    public JeuxTest() {
    }

    @Test
    public void testJeux(){
        //Arrange
        
        //Act
        Jeux jeux = new Jeux();
        
        //Assert
        assertTrue(jeux.getJoueur() instanceof Joueur);
        assertTrue(jeux.getGrille() instanceof Grille);
        assertTrue(jeux.getZombies() instanceof List);
        
    }
    
    @Test
    public void testZombie(){
        //Arrange
        Zombie z = new Zombie(0,0);
        Jeux jeux = new Jeux();
        
        //Act
        jeux.ajouterZombie(z);
        
        //Assert
        assertTrue(jeux.getZombies().contains(z));
        assertTrue(jeux.getGrille().getElements().contains(z));
    }
    
    @Test
    public void testDeplacerLeJoueur(){
        //Arrange
        Jeux jeux = new Jeux();
        Commande com = new Commande("bas");
        
        //Act        
        jeux.traitementCommande(com);
        
        //Assert
        assertTrue(jeux.getJoueur().getPosition().getX() == 1);
        assertTrue(jeux.getJoueur().getPosition().getY() == 2);        
    }

}
