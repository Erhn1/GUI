
package ramenhouse;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class Gooey {
    JFrame frame = new JFrame();
    ImageIcon pic = new ImageIcon("kiki.jfif");
    JButton bon = new JButton("Sign In");
    
    
    public Gooey (){
        Image img = pic.getImage();
        pic = new ImageIcon(img.getScaledInstance(474,266, Image.SCALE_SMOOTH));
        frame.setSize(474,266);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
       
        JLabel lblBack = new JLabel(pic);
        lblBack.setLayout(new FlowLayout());
        lblBack.setBounds(0, 0, 474, 266);
        
        bon.setBounds(100, 100, 100, 100);
        lblBack.add(bon);
        
        frame.add(lblBack);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        Gooey GUI = new Gooey();
    }
}
