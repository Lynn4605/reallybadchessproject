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
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
 
public class AnimationPanel extends JPanel implements ActionListener, MouseListener
{
            
           
              
                private Timer t;
                private BPrint boardy;
                //change/add instance variables as needed
                
                public AnimationPanel()
                {
                               
                                t = new Timer(20,this);
                                t.start();
                                boardy = new BPrint();
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
                
 public void mouseClicked(MouseEvent e){
 System.out.println("Clicked");
 System.out.println(e.getX() + ", " + e.getY());
 }
 
 public void mouseReleased(MouseEvent e){ }
 public void mouseEntered(MouseEvent e){ }
 public void mouseExited(MouseEvent e){ }
 public void mousePressed (MouseEvent e){ }        
}
 
 
 
