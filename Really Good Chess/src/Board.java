import java.util.Arrays;

public class ChessBoard {

   
   //The size of the board.
    public static final int SIZE = 8;

  //piece colors
    private static final boolean WHITE = true;
    private static final boolean BLACK = false;
   
   
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
  
  
