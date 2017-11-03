import java.util.Arrays;
import javax.swing.*;

public class ChessBoard {

   
   //The size of the board. 8*8?
    public static final int SIZE = 8;

  //piece colors
    private static final boolean WHITE = true;
    private static final boolean BLACK = false;
   
   private JFrame board = new JFrame();
   board.setSize(1000, 1000);
   board.setLayout(null);
   board.setVisible(true);
//what the board would look like without any randomization 
private final Piece[][] UNRANDOMIZED = {
            { new Rook(WHITE), new Knight(WHITE), new Bishop(WHITE),
                    new Queen(WHITE), new King(WHITE), new Bishop(WHITE),
                    new Knight(WHITE), new Rook(WHITE) },
            { new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
                    new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
                    new Pawn(WHITE), new Pawn(WHITE) },
            { null, null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null, null },
            { null, null, null, null, null, null, null, null },
            { new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
                    new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
                    new Pawn(BLACK), new Pawn(BLACK) },
            { new Rook(BLACK), new Knight(BLACK), new Bishop(BLACK),
                    new Queen(BLACK), new King(BLACK), new Bishop(BLACK),
                    new Knight(BLACK), new Rook(BLACK) } };
   private final Piece[][] white ={
      { { new Rook(WHITE), new Knight(WHITE), new Bishop(WHITE),
                    new Queen(WHITE), new King(WHITE), new Bishop(WHITE),
                    new Knight(WHITE), new Rook(WHITE) },
            { new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
                    new Pawn(WHITE), new Pawn(WHITE), new Pawn(WHITE),
                    new Pawn(WHITE), new Pawn(WHITE) } };
      private final Piece[][] black = {{ new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
                    new Pawn(BLACK), new Pawn(BLACK), new Pawn(BLACK),
                    new Pawn(BLACK), new Pawn(BLACK) },
            { new Rook(BLACK), new Knight(BLACK), new Bishop(BLACK),
                    new Queen(BLACK), new King(BLACK), new Bishop(BLACK),
                    new Knight(BLACK), new Rook(BLACK) } };
  
  
