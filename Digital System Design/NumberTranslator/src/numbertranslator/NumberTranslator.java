/*
Created by Hasan Alp ZENGIN
Language : Java
 */
package numbertranslator;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NumberTranslator {

    public static void main(String[] args) {
        
        //set visible starter screen
        StarterScreen sScreen = new StarterScreen();
        sScreen.setVisible(true);
        //wait 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NumberTranslator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        sScreen.setVisible(false);
        //set visible main gui
        NumberTranslatorGui gui = new NumberTranslatorGui();
        gui.setVisible(true);
        
    }
    
}  
