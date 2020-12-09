package wojazer_projekt;

import java.awt.*;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.time.*;

//Klasa główna, w funckji main pobiera się rozmiary okna, wyznacza środek monitora 
//I wywoje się okno gry.
public class Game{

    public static final int Width = 1280, Height =Width/12*9; 
       
    /**
     *
     * @param args
     */
   
    public static void main(String[] args) {
        
        //pobierz rozmiar ekranu
        int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;
        
        //wyznaczenie srodka monitora
        int xCenter=(screenWidth-Width)/2;
        int yCenter=((screenHeight-Height)/2)-10;
        
        //Nowy obiekt okna gry
        Window w = new Window(Width, Height, xCenter, yCenter);
        w.setSize(Width, Height);
        w.setTitle("Wojażer");
    }
    }
    

