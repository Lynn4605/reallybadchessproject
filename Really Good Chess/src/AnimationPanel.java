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
 
public class AnimationPanel extends JPanel implements ActionListener
{
                private Timer t;
                private BPrint board;
                private BPrint BPiece1;
                private BPrint BPiece2;
                private BPrint BPiece3;
                private BPrint BPiece4;
                private BPrint BPiece5;
                private BPrint BPiece6;
                private BPrint BPiece7;
                private BPrint BPiece8;
                private BPrint BPiece9;
                private BPrint BPiece10;
                private BPrint BPiece11;
                private BPrint BPiece12;
                private BPrint BPiece13;
                private BPrint BPiece14;
                private BPrint BPiece15;
                private BPrint BPiece16;
                private BPrint WPiece1;
                private BPrint WPiece2;
                private BPrint WPiece3;
                private BPrint WPiece4;
                private BPrint WPiece5;
                private BPrint WPiece6;
                private BPrint WPiece7;
                private BPrint WPiece8;
                private BPrint WPiece9;
                private BPrint WPiece10;
                private BPrint WPiece11;
                private BPrint WPiece12;
                private BPrint WPiece13;
                private BPrint WPiece14;
                private BPrint WPiece15;
                private BPrint WPiece16;
                //change/add instance variables as needed
                
                public AnimationPanel()
                {
                               
                                t = new Timer(20,this);
                                t.start();
                                board = new BPrint();
                                BPiece1 = new BPrint();
                                BPiece2 = new BPrint();
                                BPiece3 = new BPrint();
                                BPiece4 = new BPrint();
                                BPiece5 = new BPrint();
                                BPiece6 = new BPrint();
                                BPiece7 = new BPrint();
                                BPiece8 = new BPrint();
                                BPiece9 = new BPrint();
                                BPiece10 = new BPrint();
                                BPiece11 = new BPrint();
                                BPiece12 = new BPrint();
                                BPiece13 = new BPrint();
                                BPiece14 = new BPrint();
                                BPiece15 = new BPrint();
                                BPiece16 = new BPrint();
                                WPiece1 = new BPrint();
                                WPiece2 = new BPrint();
                                WPiece3 = new BPrint();
                                WPiece4 = new BPrint();
                                WPiece5 = new BPrint();
                                WPiece6 = new BPrint();
                                WPiece7 = new BPrint();
                                WPiece8 = new BPrint();
                                WPiece9 = new BPrint();
                                WPiece10 = new BPrint();
                                WPiece11 = new BPrint();
                                WPiece12 = new BPrint();
                                WPiece13 = new BPrint();
                                WPiece14 = new BPrint();
                                WPiece15 = new BPrint();
                                WPiece16 = new BPrint();
                                
                }
                
                //Overrides the paint method to draw whatever you want.
                public void paint(Graphics g)
                {
                                g.clearRect(0, 0, getWidth(), getHeight());
                                board.paintSelf(g, this);
                                BPiece1.paintSelf(g, this);
                                BPiece2.paintSelf(g, this);
                                BPiece3.paintSelf(g, this);
                                BPiece4.paintSelf(g, this);
                                BPiece5.paintSelf(g, this);
                                BPiece6.paintSelf(g, this);
                                BPiece7.paintSelf(g, this);
                                BPiece8.paintSelf(g, this);
                                BPiece9.paintSelf(g, this);
                                BPiece10.paintSelf(g, this);
                                BPiece11.paintSelf(g, this);
                                BPiece12.paintSelf(g, this);
                                BPiece13.paintSelf(g, this);
                                BPiece14.paintSelf(g, this);
                                BPiece15.paintSelf(g, this);
                                BPiece16.paintSelf(g, this);
                                WPiece1.paintSelf(g, this);
                                WPiece2.paintSelf(g, this);
                                WPiece3.paintSelf(g, this);
                                WPiece4.paintSelf(g, this);
                                WPiece5.paintSelf(g, this);
                                WPiece6.paintSelf(g, this);
                                WPiece7.paintSelf(g, this);
                                WPiece8.paintSelf(g, this);
                                WPiece9.paintSelf(g, this);
                                WPiece10.paintSelf(g, this);
                                WPiece11.paintSelf(g, this);
                                WPiece12.paintSelf(g, this);
                                WPiece13.paintSelf(g, this);
                                WPiece14.paintSelf(g, this);
                                WPiece15.paintSelf(g, this);
                                WPiece16.paintSelf(g, this);
                           
                }
                
                //Modify this method as needed.
                public void actionPerformed(ActionEvent e)
                {
                }
}
 
 
