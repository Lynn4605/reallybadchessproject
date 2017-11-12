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
                private BPrint BRook1;
                private BPrint BKnight1;
                private BPrint BBishop1;
                private BPrint BQueen;
                private BPrint BKing;
                private BPrint BBishop2;
                private BPrint BKnight2;
                private BPrint BRook2;
                private BPrint BPawn1;
                private BPrint BPawn2;
                private BPrint BPawn3;
                private BPrint BPawn4;
                private BPrint BPawn5;
                private BPrint BPawn6;
                private BPrint BPawn7;
                private BPrint BPawn8;
                private BPrint WRook1;
                private BPrint WKnight1;
                private BPrint WBishop1;
                private BPrint WQueen;
                private BPrint WKing;
                private BPrint WBishop2;
                private BPrint WKnight2;
                private BPrint WRook2;
                private BPrint WPawn1;
                private BPrint WPawn2;
                private BPrint WPawn3;
                private BPrint WPawn4;
                private BPrint WPawn5;
                private BPrint WPawn6;
                private BPrint WPawn7;
                private BPrint WPawn8;
                //change/add instance variables as needed
                
                public AnimationPanel()
                {
                               
                                t = new Timer(20,this);
                                t.start();
                                board = new BPrint("board.jpg", 0, 0);
                                BRook1 = new BPrint("BRook.png", 0, 0);
                                BKnight1 = new BPrint("BKnight.png", 100, 0);
                                BBishop1 = new BPrint("BBishop.png", 200, 0);
                                BQueen = new BPrint("BQueen.png", 300, 0);
                                BKing = new BPrint("BKing.png", 400, 0);
                                BBishop2 = new BPrint("BBishop.png", 500, 0);
                                BKnight2 = new BPrint("BKnight.png", 600, 0);
                                BRook2 = new BPrint("BRook.png", 700, 0);
                                BPawn1 = new BPrint("BPawn.png", 0, 100);
                                BPawn2 = new BPrint("BPawn.png", 100, 100);
                                BPawn3 = new BPrint("BPawn.png", 200, 100);
                                BPawn4 = new BPrint("BPawn.png", 300, 100);
                                BPawn5 = new BPrint("BPawn.png", 400, 100);
                                BPawn6 = new BPrint("BPawn.png", 500, 100);
                                BPawn7 = new BPrint("BPawn.png", 600, 100);
                                BPawn8 = new BPrint("BPawn.png", 700, 100);  
                                WRook1 = new BPrint("WRook.png", 0, 700);
                                WKnight1 = new BPrint("WKnight.png", 100, 700);
                                WBishop1 = new BPrint("WBishop.png", 200, 700);
                                WQueen = new BPrint("WQueen.png", 300, 700);
                                WKing = new BPrint("WKing.png", 400, 700);
                                WBishop2 = new BPrint("WBishop.png", 500, 700);
                                WKnight2 = new BPrint("WKnight.png", 600, 700);
                                WRook2 = new BPrint("WRook.png", 700, 700);
                                WPawn1 = new BPrint("WPawn.png", 0, 600);
                                WPawn2 = new BPrint("WPawn.png", 100, 600);
                                WPawn3= new BPrint("WPawn.png", 200, 600);
                                WPawn4 = new BPrint("WPawn.png", 300, 600);
                                WPawn5 = new BPrint("WPawn.png", 400, 600);
                                WPawn6 = new BPrint("WPawn.png", 500, 600);
                                WPawn7 = new BPrint("WPawn.png", 600, 600);
                                WPawn8 = new BPrint("WPawn.png", 700, 600);  
                           
                                
                }
                
                //Overrides the paint method to draw whatever you want.
                public void paint(Graphics g)
                {
                                g.clearRect(0, 0, getWidth(), getHeight());
                                board.paintSelf(g, this);
                                BRook1.paintSelf(g, this);
                                BKnight1.paintSelf(g, this);
                                BBishop1.paintSelf(g, this);
                                BQueen.paintSelf(g, this);
                                BKing.paintSelf(g, this);
                                BBishop2.paintSelf(g, this);
                                BKnight2.paintSelf(g, this);
                                BRook2.paintSelf(g, this);
                                BPawn1.paintSelf(g, this);
                                BPawn2.paintSelf(g, this);
                                BPawn3.paintSelf(g, this);
                                BPawn4.paintSelf(g, this);
                                BPawn5.paintSelf(g, this);
                                BPawn6.paintSelf(g, this);
                                BPawn7.paintSelf(g, this);
                                BPawn8.paintSelf(g, this);
                                WRook1.paintSelf(g, this);
                                WKnight1.paintSelf(g, this);
                                WBishop1.paintSelf(g, this);
                                WQueen.paintSelf(g, this);
                                WKing.paintSelf(g, this);
                                WBishop2.paintSelf(g, this);
                                WKnight2.paintSelf(g, this);
                                WRook2.paintSelf(g, this);
                                WPawn1.paintSelf(g, this);
                                WPawn2.paintSelf(g, this);
                                WPawn3.paintSelf(g, this);
                                WPawn4.paintSelf(g, this);
                                WPawn5.paintSelf(g, this);
                                WPawn6.paintSelf(g, this);
                                WPawn7.paintSelf(g, this);
                                WPawn8.paintSelf(g, this);
                               
                           
                }
                
                //Modify this method as needed.
                public void actionPerformed(ActionEvent e)
                {
                }
}
 
 
