
//----------------------------------------------------
import javax.swing.JFrame;

// Your extension may require you to modify this class.
// Otherwise, nothing in here needs to change.
public class Board extends JFrame {
	private AnimationPanel panel;

	public Board() {
		Rook BRook1 = new Rook(true, 0, 0);
        Knight BKnight1 = new Knight(true, 100, 0);
        Bishop BBishop1 = new Bishop(true, 200, 0);
        Queen BQueen = new Queen(true, 300, 0);
        King BKing = new King(true, 400, 0);
        Bishop BBishop2 = new Bishop(true, 500, 0);
        Knight BKnight2 = new Knight(true, 600, 0);
        Rook BRook2 = new Rook(true, 700, 0);
        Pawn BPawn1 = new Pawn(true, 0, 100);
        Pawn BPawn2 = new Pawn(true, 100, 100);
        Pawn BPawn3 = new Pawn(true, 200, 100);
        Pawn BPawn4 = new Pawn(true, 300, 100);
        Pawn BPawn5 = new Pawn(true, 400, 100);
        Pawn BPawn6 = new Pawn(true, 500, 100);
        Pawn BPawn7 = new Pawn(true, 600, 100);
        Pawn BPawn8 = new Pawn(true, 700, 100);  
        Rook WRook1 = new Rook(false, 0, 700);
        Knight WKnight1 = new Knight(false, 100, 700);
        Bishop WBishop1 = new Bishop(false, 200, 700);
        Queen WQueen = new Queen(false, 300, 700);
        King WKing = new King(false, 400, 700);
        Bishop WBishop2 = new Bishop(false, 500, 700);
        Knight WKnight2 = new Knight(false, 600, 700);
        Rook WRook2 = new Rook(false, 700, 700);
        Pawn WPawn1 = new Pawn(false, 0, 600);
        Pawn WPawn2 = new Pawn(false, 100, 600);
        Pawn WPawn3 = new Pawn(false, 200, 600);
        Pawn WPawn4 = new Pawn(false, 300, 600);
        Pawn WPawn5 = new Pawn(false, 400, 600);
        Pawn WPawn6 = new Pawn(false, 500, 600);
        Pawn WPawn7 = new Pawn(false, 600, 600);
        Pawn WPawn8 = new Pawn(false, 700, 600); 
		BPrint[] board = {BRook1, BKnight1, BBishop1, BQueen, BKing, BBishop2, BKnight2, BRook2,
				BPawn1, BPawn2, BPawn3, BPawn4, BPawn5, BPawn6, BPawn7, BPawn8,
				null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null,
				null, null, null, null, null, null, null, null,
				WPawn1, WPawn2, WPawn3, WPawn4, WPawn5, WPawn6, WPawn7, WPawn8,
				WRook1, WKnight1, WBishop1, WQueen, WKing, WBishop2, WKnight2, WRook2
		};

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
