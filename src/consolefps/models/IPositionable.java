/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps.models;

/**
 *
 * @author krilivye
 */
public interface IPositionable {
    public Position getPosition();
    public void setPosition(Position position);
    public void setPosition(int x, int y);
}
