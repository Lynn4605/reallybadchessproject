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
	BufferedImage tilelight;
	{
		try {
			tilelight = ImageIO.read(new File("Lightile.png"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	BufferedImage tiledark;
	{
		try {
			tiledark = ImageIO.read(new File("Darktile.png"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	int clicknum = 0;

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
	// change/add instance variables as needed
	BPrint[] board = new BPrint[64];

	public AnimationPanel() {
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

	// Modify this method as needed.

	int index=40;
	public void mouseClicked(MouseEvent e) {
		clicknum++;
		if (clicknum == 1) {
			int ybox = e.getY();
			int xbox = e.getX();
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
			if (board[index2] == null) {
				board[index2] = board[index];
				board[index] = null;
				System.out.println("Piece moved");
			}
			else {
				boolean color1 = board[index].colorcheck();
				boolean color2 = board[index2].colorcheck();
				if (color1==color2) {
					System.out.println("Illegal move! Piece of same color! Try again");
				} else {
					System.out.println(board[index2] + " has been captured");
					board[index2] = board[index];
					board[index] = null;
				}
			}
			clicknum=0;
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
