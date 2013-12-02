/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.controllers;


import consolefps.views.noValideOptionMenu;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author krilivye
 */
public class MenuTest {
    
    public MenuTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void afficherMenu(){
        //Arrange
        Menu menu = new Menu();
        
        //Act
        String s = menu.affichage();
        
        //Assert
        assertEquals("Super Zombie Killer\n"
                    +"1 - Jouer\n"
                    +"2 - Options\n"
                    +"3 - Sortir\n", s);
    }
    
    @Test
    public void testNoValideOption() {
        //Arrange
        Menu menu = new Menu();
        Commande com = new Commande("bla!");
        
        //Act
        ICLIControleur controlleur = menu.choisir(com);
        
        //Assert
        assertTrue(controlleur instanceof noValideOptionMenu);
    }
    
    @Test
    public void testJeuxOption(){
        //Arrange
        Menu menu = new Menu();
        Commande com = new Commande("1");
        
        //Act
        ICLIControleur ctrl = menu.choisir(com);
        
        //Assert
        assertTrue(ctrl instanceof Jeux);
    }
    
    @Test
    public void testOption(){
        //Arrange
        Menu menu = new Menu();
        Commande com = new Commande("2");
        
        //Act
        ICLIControleur ctrl = menu.choisir(com);
        
        //Assert
        assertTrue(ctrl instanceof Options);
    }
}
