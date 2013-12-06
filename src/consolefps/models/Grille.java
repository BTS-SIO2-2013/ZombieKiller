/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

import consolefps.models.elements.Elements;
import consolefps.models.elements.decors.Decors;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krilivye
 */
public class Grille {
    private int nbLignes;
    private int nbColonnes;
    private List<Elements> objets;

    public Grille(int nbColonnes, int nbLignes) {
        this();
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
    }
    
    public int getNbLignes(){
        return this.nbLignes;
    }
    public int getNbColonnes(){
        return this.nbColonnes;
    }

    public Grille() {
        this.nbLignes = 5;
        this.nbColonnes = 5;
        this.objets = new ArrayList<Elements>();
    }

    public String afficherGrille() {
        String retour = this.entete();
        
        for (int y=0;y<nbLignes;y++){
            retour += this.afficherLigne(y);
        }
        return retour;
    }

    public void ajouterElement(Elements e){
        this.objets.add(e);
    }

    public String entete() {
        String str = " ";
        for (int i =0;i<nbColonnes; i++){
           str+=" "+i+" ";
        }
        return str+"\n"; 
    }

    public String caseVide() {
        return "[ ]";
    }

    public String afficherLigne(int i) {
        String retour=""+i;
        for (int x= 0; x<nbColonnes;x++){
            Position courante = new Position(x, i);
            
            boolean aAfficher = false;
            for (Elements objet : this.objets){
                if (objet.getPosition().equals(courante)){
                    retour += objet.afficher();
                    aAfficher = true;
                }
            }
            if (!aAfficher){
                 retour += this.caseVide();   
            }
        }
        return retour +"\n";
    }

    public List<Elements> getElements() {
        return this.objets;
    }

    public void setNblignes(int i) {
        this.nbLignes = i;
    }

    public void setNbColonnes(int i) {
        this.nbColonnes = i;
    }
    
	public boolean isDecors(Position laPosition) {

		for (Elements element : this.objets) {
			if (laPosition.equals( element.getPosition())) {
				return element instanceof Decors;
			}
		}
		return false;
	}
    	
    	public boolean isValide(Position laPosition){
    		
    	 boolean valide = true;
    	 valide = (!isDecors(laPosition));
    	 
    	 return valide;
    	
    	
    }
    	
    
    
    
}
