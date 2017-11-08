
//----------------------------------------------------
import javax.swing.JFrame;


// Your extension may require you to modify this class.
// Otherwise, nothing in here needs to change.
public class Board extends JFrame {
	private AnimationPanel panel;

	public Board()
	                {

	Piece[] board = new Piece[64];
	Piece[] white = { new Rook(false, 50, 50), new Knight(false, 50, 50), new Bishop(false, 50, 50), new Queen(false, 50, 50),
			new King(false, 50, 50), new Pawn(false, 50, 50, true) };
	Piece[] black = { new Rook(true, 750, 750), new Knight(true, 750, 750), new Bishop(true, 750, 750), new Queen(true, 750, 750),
	new King(true, 750, 750), new Pawn(true, 750, 750, true) };
	int w = 0;
	while( w<16)
	{
		board[w] = (white[((int) (Math.random() * 6))]);
		w++;
	}
	int b = 47;
	while( b<64)
	{
		board[b] = (black[((int) (Math.random() * 16))]);
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

	public static void main(String[] args) {
		new Board();
	}
}
// -----------------------------------------------
