/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppm_reader;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PPM_reader {

    public static void main(String[] args) throws FileNotFoundException {
        
        splash_screen splash = new splash_screen();
        main_menu form = new main_menu();
        
        try {
            
            splash.setVisible(true);
            
            Thread.sleep(1500);
            
            splash.setVisible(false);
            
            form.setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(PPM_reader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
