/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consolefps;

/**
 *
 * @author krilivye
 */
public class ConsoleFPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CLI cli = new CLI();
        boolean execute = true;
        while(execute){
            execute = cli.execute();
        }
    }
}
