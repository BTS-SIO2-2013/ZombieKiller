/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

/**
 *
 * @author krilivye
 */
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position :" + this.x + "," + this.y;
                
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Position){
            Position autre = (Position)obj;
            if (this.x == autre.getX() && this.y==autre.getY()){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    
    
    
    
    
    
}
