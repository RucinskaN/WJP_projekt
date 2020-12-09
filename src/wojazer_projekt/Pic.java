/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wojazer_projekt;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
/**
 Klasa przechowująca grafikę 
 * @author Natal
 */
public class Pic {
    public static Image logo; //Obrazek logo pobrany z https://pixabay.com/pl/
    public static ImageIcon b_start; //Przycisk start
    public static ImageIcon b_instruction; //Przycisk instruckji gry
    public static ImageIcon  b_end; //Przycisk zakończenia gry
    public static Image name;
    public static Image space;
    public static Image instruction; //Obraz instrukcji gry
    public static ImageIcon b_back;
    public static Image levels;
    public static ImageIcon lev1; //Przycisk wyboru poziomu 1
    public static ImageIcon lev2;
    public static ImageIcon lev3;
    public static ImageIcon lev4;
    public static Image map;
    
    //Wczytanie grafiki
    public static void loadInitialResources() {
    b_start = new ImageIcon("./res/images/button1.png");
    b_instruction = new ImageIcon("./res/images/button2.png");
    b_end = new ImageIcon("./res/images/button3.png");
    logo = loadImage("./res/images/logo.png");
    name = loadImage("./res/images/logo1.png");
    space = loadImage("./res/images/odstep.png");
    instruction = loadImage("./res/images/instr.png");
    b_back = new ImageIcon("./res/images/button4.png");
    levels = loadImage ("./res/images/text1.png");
    lev1 = new ImageIcon("./res/images/lev1.png");
    lev2 = new ImageIcon("./res/images/lev2.png");
    lev3 = new ImageIcon("./res/images/lev3.png");
    lev4 = new ImageIcon("./res/images/lev4.png");
    map =  loadImage("./res/images/map.png");
    }
    
    public static Image loadImage(String fileName) { 
            return new ImageIcon(fileName).getImage();
    }
}
