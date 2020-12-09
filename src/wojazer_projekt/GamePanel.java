/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wojazer_projekt;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Natal
 */
public class GamePanel extends JPanel implements ActionListener{
    public int level; //poziom gry
    private JButton back; //Powrót do menu
    public JPanel cardPanel;//Panel zwierający wszystkie panele
    public CardLayout cl;//Layout przemieszczania między panelami
    public JPanel gameWindow = new JPanel();
    public Container pane = new Container();
            
    GamePanel( CardLayout cl,JPanel cardPanel, int width, int height, int level){
        super(); 
        this.cardPanel = cardPanel;
        this.cl=cl;
        this.level=level;
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
        //this.setBackground(new java.awt.Color(135,135,135));
        
        System.out.println("START");
        this.addMouseListener(new ClickListener() );
        
        Image img;
        img = Pic.map;
        JLabel map = new JLabel(new ImageIcon(img));
        //Screen sc = new Screen(cl,cardPanel, width, height, level);
        this.add(back);
        this.add(map);
        this.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class ClickListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e){
             System.out.println(e.getX()+", "+e.getY() );
        }
    }
            
        
    }

 


    
   
    

