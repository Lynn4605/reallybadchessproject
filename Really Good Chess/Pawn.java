public class Pawn extends BPrint{
	boolean color;
	public Pawn(boolean c, int x, int y) {
		super("Pawn.png", x,y,c);	
		color = c;
	}

}
