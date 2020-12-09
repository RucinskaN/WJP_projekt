package wojazer_projekt;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Natal
 */

//Klasa podstawowych okien gry
public class Window extends JFrame{
    
    public int width;// Szerokosc okna
    public int height;// Wysokosc okna
    public JPanel menu = new JPanel(); // Panel menu
    public JPanel level = new JPanel();// Panel wyboru poziomu
    public JPanel instruction = new JPanel();// Panel instrukcji gry
    public JPanel cardPanel = new JPanel();//Layout do przemieszczania się między panelami
    public CardLayout cl = new CardLayout();// kontener cardPanelu
    public Container pane = this.getContentPane();
    
    public Window(int width, int height,int x,int y){
        super(); //wywołanie konstruktora klasy nadrzędnej
        this.width=width;  
        this.height=height;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Umożliwienie zamknięcia okna
        setSize(width, height); // Ustawienie rozmiarów okna
        setLocation(x,y); //Ustawienie pozycji okna
        setResizable(false); 
       
        menuMain(width,height); // Wywołanie panelu menu
        level(width,height); // Wywołanie panelu wyboru poziomu
        instruction(width,height); //Wywołanie panelu instrukcji gry
        
        cardPanel.setLayout(cl); //ustawienie w cardPanelu layoutu CardLayout
        cardPanel.add(menu,"MENU");  // dodawanie paneli do cardLayoutu
        cardPanel.add(instruction,"INSTRUCTION");
        cardPanel.add(level,"LEVEL");
        pane.setLayout(new BorderLayout());
        pane.add(cardPanel,BorderLayout.CENTER);
        
        this.pack();
        this.setVisible(true);
    }
    public void menuMain(int width, int height){
        
        JButton start=new JButton(); //Przycisk startu gry
        JButton instruction=new JButton(); //Przycisk wyświetlenia instrukcji gry
        JButton end=new JButton(); //Przycisk zakończenia gry
        //Definicja ikon na przyciski, grafika jest wczytywana w klasie Pic
        Image img;
        Image img2;
        Image img3;
        //Ustawienie wielkości, koloru i layoutu okna 
        menu.setPreferredSize(new java.awt.Dimension(width, height));
        menu.setLayout(new FlowLayout(1, 150, 10)); 
        menu.setBackground(new java.awt.Color(135,135,135));
              
        Pic.loadInitialResources();
        //Obrazy panelu
        img = Pic.logo;
        JLabel logo = new JLabel(new ImageIcon(img));
        logo.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        img2 = Pic.name;
        JLabel name = new JLabel(new ImageIcon(img2));
        name.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        img3 = Pic.space;
        JLabel spc = new JLabel(new ImageIcon(img3));
        logo.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        end.setIcon(Pic.b_end);
        end.setBorderPainted(true);
        end.setContentAreaFilled(false);
        end.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                ButtonAction.endActionPerformed(ev);
            }
        });
        
        start.setIcon(Pic.b_start);
        start.setBorderPainted(true);
        start.setContentAreaFilled(false);
        start.addActionListener(new java.awt.event.ActionListener(){
           @Override
           public void actionPerformed(ActionEvent ev){
               ButtonAction.startActionPerformed(ev,cardPanel, cl);
           }
        });
        
        instruction.setIcon(Pic.b_instruction);
        instruction.setBorderPainted(true);
        instruction.setContentAreaFilled(false);
        instruction.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                ButtonAction.infoActionPerformed(ev, cardPanel, cl);
            }
        });
        
        //Dodanie komponentów do panelu
        menu.add(name);
        menu.add(logo);
        menu.add(spc);
        menu.add(start);
        menu.add(instruction);
        menu.add(end);
}
    public void instruction(int width, int height){
        instruction.setPreferredSize(new java.awt.Dimension(width, height));
        instruction.setBackground(new java.awt.Color(135,135,135));
        Image img;
        Image img3;
        img = Pic.instruction;
        JLabel instr = new JLabel(new ImageIcon(img));
        
        JButton back = new JButton();
        back.setIcon(Pic.b_back);
        back.setBorderPainted(true);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                ButtonAction.backActionPerformed(ev, cardPanel, cl);
            }
        });
        back.setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        instruction.setLayout(new FlowLayout(1));
        instruction.add(instr);
        instruction.add(back);  
    }
    
    //Widok wyboru poziomu
    public void level(int weight, int height){
        level.setPreferredSize(new java.awt.Dimension(width, height));
        level.setBackground(new java.awt.Color(135,135,135));
        level.setLayout(new FlowLayout(1, 500, 0));
        Image Img;
        Image img3;
        Img = Pic.levels;
        JLabel title = new JLabel(new ImageIcon(Img));
        
        JButton lev1 = new JButton(); //Przycisk poziomu 1
        lev1.setIcon(Pic.lev1);
        lev1.setBorderPainted(true);
        lev1.setContentAreaFilled(false);
        
        JButton lev2 = new JButton(); //Przycisk poziomu 2
        lev2.setIcon(Pic.lev2);
        lev2.setBorderPainted(true);
        lev2.setContentAreaFilled(false);
        
        JButton lev3 = new JButton(); //Przycisk poziomu 3
        lev3.setIcon(Pic.lev3);
        lev3.setBorderPainted(true);
        lev3.setContentAreaFilled(false);
        lev3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                ButtonAction.lev3ActionPerformed(ev, cardPanel, cl, width, height);
            }
        });
        
        JButton lev4 = new JButton(); //Przycisk poziomu 4
        lev4.setIcon(Pic.lev4);
        lev4.setBorderPainted(true);
        lev4.setContentAreaFilled(false);
        
        JButton back = new JButton();
        back.setIcon(Pic.b_back);
        back.setBorderPainted(true);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                ButtonAction.backActionPerformed(ev, cardPanel, cl);
            }
        });
        back.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        //Dodanie komponentów do panelu
        level.add(title);
        level.add(lev1);
        level.add(lev2);
        level.add(lev3);
        level.add(lev4);
        level.add(back);
        
    }    
}
