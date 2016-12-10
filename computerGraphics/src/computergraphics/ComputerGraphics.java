/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computergraphics;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ComputerGraphics {

    public static void main(String[] args) {
        menu_frame menu = new menu_frame();
        splash_screen s_screen = new splash_screen();
        
        s_screen.setVisible(true);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ComputerGraphics.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        s_screen.dispose();
        
        
        menu.setVisible(true);
        
    }
    
}
