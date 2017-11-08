public class Pawn extends Piece {
	private int ycoordinate;
	private int xcoordinate;
	private boolean color;
	private boolean firstmove=true;

	public Pawn(boolean c, int x, int y, boolean f) {
		firstmove = f;
		ycoordinate = y;
		xcoordinate = x;
		color = c;
	}
	public void up() {
		if (ycoordinate < 700) {
			ycoordinate += 100;
			firstmove = false;
		}
		// convert to a dead piece
		else {
			System.out.println("Cannot move forward");
		}
	}

	public void upright() {
		// if (there's an enemy piece there){
		// }
		xcoordinate += 100;
		ycoordinate += 100;
		firstmove = false;
	}

	public void upleft() {
		// if (there's an enemy piece there){
		// }
		xcoordinate -= 100;
		ycoordinate += 100;
		firstmove = false;
	}
}
