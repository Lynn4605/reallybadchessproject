import java.util.Arrays;
import javax.swing.*;

public class ChessBoard {
//----------------------------------------------------
   import javax.swing.JFrame;

	import javax.swing.JPanel;
	 
	//Your extension may require you to modify this class.
	//Otherwise, nothing in here needs to change.
	public class Chessboard extends JFrame
	{
	                private AnimationPanel panel;
	                
	                public Chessboard()
	                {
                      private final Piece[] board = new Piece[64];
                      private final Piece[] white = { new Rook(WHITE), new Knight(WHITE), new Bishop(WHITE),
                      new Queen(WHITE), new King(WHITE), new Bishop(WHITE),
                      new Knight(WHITE), new Rook(WHITE), new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
                      new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
                      new Pawn(WHITE), new Pawn(WHITE) };
                      private final Piece[] black = { new Rook(BLACK), new Knight(BLACK), new Bishop(BLACK),
                      new Queen(BLACK), new King(BLACK), new Bishop(BLACK),
                      new Knight(BLACK), new Rook(BLACK), new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
                      new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
                      new Pawn(BLACK), new Pawn(BLACK) };
                      int w=0;
                      while (int w<16){
                         board[w]=(white[((int)(Math.random()*16))]);
                         w++;
                      }
                      int b=47;
                      while (int b<64){
                         board[b]=(black[((int)(Math.random()*16))]);
                         b++;
                      }
                         
	                   setSize(810, 840);
	                   panel = new AnimationPanel();
	                   add(panel);
	                   this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	                   setVisible(true);
	                   setResizable(false);
	                   panel.requestFocus(true);
	                }
	                
	                public static void main(String[]args)
	                {
	                                new Chessboard();
	                }
	}
//-----------------------------------------------
   

