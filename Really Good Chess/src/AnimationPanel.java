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
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
 

public class AnimationPanel extends JPanel implements ActionListener, MouseListener
{
	 BufferedImage boardimage;{
	 try {
			boardimage = ImageIO.read(new File("board.jpg"));
	 }
	 catch (IOException ioe) {
			ioe.printStackTrace();}
		}
                private Timer t;
                      private Rook BRook1;
                private Knight BKnight1;
                private Bishop BBishop1;
                private Queen BQueen;
                private King BKing;
                private Bishop BBishop2;
                private Knight BKnight2;
                private Rook BRook2;
                private Pawn BPawn1;
                private Pawn BPawn2;
                private Pawn BPawn3;
                private Pawn BPawn4;
                private Pawn BPawn5;
                private Pawn BPawn6;
                private Pawn BPawn7;
                private Pawn BPawn8;
                private Rook WRook1;
                private Knight WKnight1;
                private Bishop WBishop1;
                private Queen WQueen;
                private King WKing;
                private Bishop WBishop2;
                private Knight WKnight2;
                private Rook WRook2;
                private Pawn WPawn1;
                private Pawn WPawn2;
                private Pawn WPawn3;
                private Pawn WPawn4;
                private Pawn WPawn5;
                private Pawn WPawn6;
                private Pawn WPawn7;
                private Pawn WPawn8;
                //change/add instance variables as needed
                
                public AnimationPanel()
                {
                               
                                t = new Timer(20,this);
                                t.start();
                                BRook1 = new Rook(true, 0, 0);
                                BKnight1 = new Knight(true, 100, 0);
                                BBishop1 = new Bishop(true, 200, 0);
                                BQueen = new Queen(true, 300, 0);
                                BKing = new King(true, 400, 0);
                                BBishop2 = new Bishop(true, 500, 0);
                                BKnight2 = new Knight(true, 600, 0);
                                BRook2 = new Rook(true, 700, 0);
                                BPawn1 = new Pawn(true, 0, 100);
                                BPawn2 = new Pawn(true, 100, 100);
                                BPawn3 = new Pawn(true, 200, 100);
                                BPawn4 = new Pawn(true, 300, 100);
                                BPawn5 = new Pawn(true, 400, 100);
                                BPawn6 = new Pawn(true, 500, 100);
                                BPawn7 = new Pawn(true, 600, 100);
                                BPawn8 = new Pawn(true, 700, 100);  
                                WRook1 = new Rook(false, 0, 700);
                                WKnight1 = new Knight(false, 100, 700);
                                WBishop1 = new Bishop(false, 200, 700);
                                WQueen = new Queen(false, 300, 700);
                                WKing = new King(false, 400, 700);
                                WBishop2 = new Bishop(false, 500, 700);
                                WKnight2 = new Knight(false, 600, 700);
                                WRook2 = new Rook(false, 700, 700);
                                WPawn1 = new Pawn(false, 0, 600);
                                WPawn2 = new Pawn(false, 100, 600);
                                WPawn3 = new Pawn(false, 200, 600);
                                WPawn4 = new Pawn(false, 300, 600);
                                WPawn5 = new Pawn(false, 400, 600);
                                WPawn6 = new Pawn(false, 500, 600);
                                WPawn7 = new Pawn(false, 600, 600);
                                WPawn8 = new Pawn(false, 700, 600);  
				addMouseListener(this);
                           
                                
                }
                //Overrides the paint method to draw whatever you want.
                public void paint(Graphics g)
                {
                                g.clearRect(0, 0, getWidth(), getHeight());
                                g.drawImage(boardimage, 0, 0, null);
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
   int clicknum = 0;
   int lastX = 0;
   int lastY = 0;
                 public void mouseClicked(MouseEvent e){
	 
	   System.out.println("Clicked");
	   
	   clicknum++;
	   if (clicknum == 3) {
		   clicknum = 1;
	   }
	   System.out.println(e.getX() + ", " + e.getY() + "   # = " + clicknum);
	   lastX = e.getX;
	   lastY = e.getY;
	   

 }
 
 int counterTurn = 0;
	
	if(counterTurn %2 == 0){
	pl
	}
	
	if(counterTurn %2 == 1){
	
	}

 public void mouseReleased(MouseEvent e){ }
 public void mouseEntered(MouseEvent e){ }
 public void mouseExited(MouseEvent e){ }
 public void mousePressed (MouseEvent e){ }             
}
}
 
 
