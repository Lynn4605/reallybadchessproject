import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AnimationPanel extends JPanel implements MouseListener {
	BufferedImage boardimage;
	{
		try {
			boardimage = ImageIO.read(new File("board.jpg"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	int clicknum = 0;
	private BPrint Ltile;
	private BPrint Dtile;
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

	BPrint[] board = new BPrint[64];
	int BRX1 = 0;
	int BRY1 = 0;
	int BKX1 = 100;
	int BKY1 = 0;
	int BBX1 = 200;
	int BBY1 = 0;
	int BQX = 300;
	int BQY = 0;
	int BKX = 400;
	int BKY = 0;
	int BBX2 = 500;
	int BBY2 = 0;
	int BKX2 = 600;
	int BKY2 = 0;
	int BRX2 = 700;
	int BRY2 = 0;
	int BPX1 = 0;
	int BPY1 = 100;
	int BPX2 = 100;
	int BPY2 = 100;
	int BPX3 = 200;
	int BPY3 = 100;
	int BPX4 = 300;
	int BPY4 = 100;
	int BPX5 = 400;
	int BPY5 = 100;
	int BPX6 = 500;
	int BPY6 = 100;
	int BPX7 = 600;
	int BPY7 = 100;
	int BPX8 = 700;
	int BPY8 = 100;
	int WRX1 = 0;
	int WRY1 = 700;
	int WKX1 = 100;
	int WKY1 = 700;
	int WBX1 = 200;
	int WBY1 = 700;
	int WQX = 300;
	int WQY = 700;
	int WKX = 400;
	int WKY = 700;
	int WBX2 = 500;
	int WBY2 = 700;
	int WKX2 = 600;
	int WKY2 = 700;
	int WRX2 = 700;
	int WRY2 = 700;
	int WPX1 = 0;
	int WPY1 = 600;
	int WPX2 = 100;
	int WPY2 = 600;
	int WPX3 = 200;
	int WPY3 = 600;
	int WPX4 = 300;
	int WPY4 = 600;
	int WPX5 = 400;
	int WPY5 = 600;
	int WPX6 = 500;
	int WPY6 = 600;
	int WPX7 = 600;
	int WPY7 = 600;
	int WPX8 = 700;
	int WPY8 = 600;

	public AnimationPanel() {
		Ltile = new BPrint("Lightile.png", 0, 0, false);
		Dtile = new BPrint("Darktile.png", 100, 0, true);
		BRook1 = new Rook(true, BRX1, BRY1);
		BKnight1 = new Knight(true, BKX1, BKY1);
		BBishop1 = new Bishop(true, BBX1, BBY1);
		BQueen = new Queen(true, BQX, BQY);
		BKing = new King(true, BKX, BKY);
		BBishop2 = new Bishop(true, BBX2, BBY2);
		BKnight2 = new Knight(true, BKX2, BKY2);
		BRook2 = new Rook(true, BRX2, BRY2);
		BPawn1 = new Pawn(true, BPX1, BPY1);
		BPawn2 = new Pawn(true, BPX2, BPY2);
		BPawn3 = new Pawn(true, BPX3, BPY3);
		BPawn4 = new Pawn(true, BPX4, BPY4);
		BPawn5 = new Pawn(true, BPX5, BPY5);
		BPawn6 = new Pawn(true, BPX6, BPY6);
		BPawn7 = new Pawn(true, BPX7, BPY7);
		BPawn8 = new Pawn(true, BPX8, BPY8);
		WRook1 = new Rook(false, WRX1, WRY1);
		WKnight1 = new Knight(false, WKX1, WKY1);
		WBishop1 = new Bishop(false, WBX1, WBY1);
		WQueen = new Queen(false, WQX, WQY);
		WKing = new King(false, WKX, WKY);
		WBishop2 = new Bishop(false, WBX2, WBY2);
		WKnight2 = new Knight(false, WKX2, WKY2);
		WRook2 = new Rook(false, WRX2, WRY2);
		WPawn1 = new Pawn(false, WPX1, WPY1);
		WPawn2 = new Pawn(false, WPX2, WPY2);
		WPawn3 = new Pawn(false, WPX3, WPY3);
		WPawn4 = new Pawn(false, WPX4, WPY4);
		WPawn5 = new Pawn(false, WPX5, WPY5);
		WPawn6 = new Pawn(false, WPX6, WPY6);
		WPawn7 = new Pawn(false, WPX7, WPY7);
		WPawn8 = new Pawn(false, WPX8, WPY8);
		board[0] = BRook1;
		board[1] = BKnight1;
		board[2] = BBishop1;
		board[3] = BQueen;
		board[4] = BKing;
		board[5] = BBishop2;
		board[6] = BKnight2;
		board[7] = BRook2;
		board[8] = BPawn1;
		board[9] = BPawn2;
		board[10] = BPawn3;
		board[11] = BPawn4;
		board[12] = BPawn5;
		board[13] = BPawn6;
		board[14] = BPawn7;
		board[15] = BPawn8;
		board[16] = null;
		board[17] = null;
		board[18] = null;
		board[19] = null;
		board[20] = null;
		board[21] = null;
		board[22] = null;
		board[23] = null;
		board[24] = null;
		board[25] = null;
		board[26] = null;
		board[27] = null;
		board[28] = null;
		board[29] = null;
		board[30] = null;
		board[31] = null;
		board[32] = null;
		board[33] = null;
		board[34] = null;
		board[35] = null;
		board[36] = null;
		board[37] = null;
		board[38] = null;
		board[39] = null;
		board[40] = null;
		board[41] = null;
		board[42] = null;
		board[43] = null;
		board[44] = null;
		board[45] = null;
		board[46] = null;
		board[47] = null;
		board[48] = WPawn1;
		board[49] = WPawn2;
		board[50] = WPawn3;
		board[51] = WPawn4;
		board[52] = WPawn5;
		board[53] = WPawn6;
		board[54] = WPawn7;
		board[55] = WPawn8;
		board[56] = WRook1;
		board[57] = WKnight1;
		board[58] = WBishop1;
		board[59] = WQueen;
		board[60] = WKing;
		board[61] = WBishop2;
		board[62] = WKnight2;
		board[63] = WRook2;
		addMouseListener(this);

	}

	// Overrides the paint method to draw whatever you want.
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawImage(boardimage, 0, 0, null);
		BRook1.paintSelf(g, BRX1, BRY1, this);
		BKnight1.paintSelf(g, BKX1, BKY1, this);
		BBishop1.paintSelf(g, BBX1, BBY1, this);
		BQueen.paintSelf(g, BQX, BQY, this);
		BKing.paintSelf(g, BKX, BKY, this);
		BBishop2.paintSelf(g, BBX2, BBY2, this);
		BKnight2.paintSelf(g, BKX2, BKY2, this);
		BRook2.paintSelf(g, BRX2, BRY2, this);
		BPawn1.paintSelf(g, BPX1, BPY1, this);
		BPawn2.paintSelf(g, BPX2, BPY2, this);
		BPawn3.paintSelf(g, BPX3, BPY3, this);
		BPawn4.paintSelf(g, BPX4, BPY4, this);
		BPawn5.paintSelf(g, BPX5, BPY5, this);
		BPawn6.paintSelf(g, BPX6, BPY6, this);
		BPawn7.paintSelf(g, BPX7, BPY7, this);
		BPawn8.paintSelf(g, BPX8, BPY8, this);
		WRook1.paintSelf(g, WRX1, WRY1, this);
		WKnight1.paintSelf(g, WKX1, WKY1, this);
		WBishop1.paintSelf(g, WBX1, WBY1, this);
		WQueen.paintSelf(g, WQX, WQY, this);
		WKing.paintSelf(g, WKX, WKY, this);
		WBishop2.paintSelf(g, WBX2, WBY2, this);
		WKnight2.paintSelf(g, WKX2, WKY2, this);
		WRook2.paintSelf(g, WRX2, WRY2, this);
		WPawn1.paintSelf(g, WPX1, WPY1, this);
		WPawn2.paintSelf(g, WPX2, WPY2, this);
		WPawn3.paintSelf(g, WPX3, WPY3, this);
		WPawn4.paintSelf(g, WPX4, WPY4, this);
		WPawn5.paintSelf(g, WPX5, WPY5, this);
		WPawn6.paintSelf(g, WPX6, WPY6, this);
		WPawn7.paintSelf(g, WPX7, WPY7, this);
		WPawn8.paintSelf(g, WPX8, WPY8, this);

	}

	// Modify this method as needed.

	int index = 40;

	public void mouseClicked(MouseEvent e) {
		clicknum++;
		int yinitial = 400;
		int xinitial = 400;
		if (clicknum == 1) {
			int ybox = e.getY();
			int xbox = e.getX();
			yinitial = (ybox / 100) * 100;
			xinitial = (xbox / 100) * 100;
			index = ((ybox / 100) * 8) + ((xbox / 100));
			if (board[index] != null) {
				System.out.println("Piece Selected: " + board[index]);
			} else {
				clicknum = 0;
				System.out.println("Blank square, please click again");
			}
		}
		if (clicknum == 2) {
			int y2 = e.getY();
			int x2 = e.getX();
			int index2 = ((y2 / 100) * 8) + ((x2 / 100));
			int nexty = ((y2 / 100) * 100);
			int nextx = ((x2 / 100) * 100);
			if (board[index2] == null) {
				board[index2] = board[index];
				board[index] = null;
				System.out.println("Piece moved");
			} else {
				boolean color1 = board[index].colorcheck();
				boolean color2 = board[index2].colorcheck();
				if (color1 == color2) {
					System.out.println("Illegal move! Piece of same color! Try again");
				} else {
					System.out.println(board[index2] + " has been captured");
					board[index2] = board[index];
					board[index] = null;
				}
			}
			clicknum = 0;
		}

		System.out.println(e.getX() + ", " + e.getY() + "   # = " + clicknum);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
