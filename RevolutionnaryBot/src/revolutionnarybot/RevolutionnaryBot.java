/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package revolutionnarybot;

import java.awt.AWTException;

/**
 *
 * @author jeremygillet
 */
public class RevolutionnaryBot {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        // TODO code application logic here
        MaliciousRobot bot = new MaliciousRobot(100, 10);
        LaunchWindow w = new LaunchWindow();
        w.setBot(bot);
    }

}
