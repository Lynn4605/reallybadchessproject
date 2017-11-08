import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;
 
public class AnimationPanel implements MouseListener{
 public void mousePressed{
  blankArea.addMouseListener(this);
  addMouseListener(this);
}

public class AnimationPanel extends JPanel implements ActionListener
{
                private Timer t;
                private bprint boardy;
                //change/add instance variables as needed
                
                public AnimationPanel()
                {
                               
                                t = new Timer(20,this);
                                t.start();
                                boardy = new bprint();
                }
                
                //Overrides the paint method to draw whatever you want.
                public void paint(Graphics g)
                {
                                g.clearRect(0, 0, getWidth(), getHeight());
                                boardy.paintSelf(g, this);
                }
                
                //Modify this method as needed.
                public void actionPerformed(ActionEvent e)
                {
                               System.out.println("Tick"); 
                }
}
 
 
