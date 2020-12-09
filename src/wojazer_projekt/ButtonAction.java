/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wojazer_projekt;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
/**
 *
 * @author Natal
 */

//Klasa obsługująca przyciski gry
public class ButtonAction {
    //Przycisk wyjścia z gry
    public static void endActionPerformed(java.awt.event.ActionEvent ev) {                                         
        System.exit(0);
    } 
    //Przycisk instrukcji
    public static void infoActionPerformed(java.awt.event.ActionEvent ev, JPanel cardPanel, CardLayout cl){
        cl.show(cardPanel, "INSTRUCTION");
    }
    //przycisk powrotu
    public static void backActionPerformed(java.awt.event.ActionEvent ev, JPanel cardPanel, CardLayout cl){
        cl.show(cardPanel, "MENU");
    }
    //przycisk start - rozpoczęcie gry
    public static void startActionPerformed(java.awt.event.ActionEvent ev, JPanel cardPanel, CardLayout cl){
        cl.show(cardPanel, "LEVEL");
    }
    
    //Wybor poziomu 2
    public static void lev3ActionPerformed(ActionEvent ev, JPanel cardPanel, CardLayout cl, int width, int height){
        GamePanel gp = new GamePanel(cl,cardPanel,width,height,1);
        //GameGUI gg = new GameGUI(gp,cardPanel,cl,1);
        cardPanel.add(gp,"GAME");
        cl.show(cardPanel,"GAME");
    }

    
   
   
}
