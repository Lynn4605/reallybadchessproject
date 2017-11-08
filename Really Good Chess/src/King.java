public class King extends Piece {
	private int ycoordinate;
	private int xcoordinate;
	private boolean color;
	public King(boolean c, int x, int y) {
		ycoordinate = y;
		xcoordinate = x;
		color = c;
	}

	public void up(){
    if (ycoordinate>100){
      ycoordinate+=100;
    }
    else
      System.out.println("Cannot move forward");
  }

	public void down(){
    if (ycoordinate<700){
      ycoordinate-=100;
    }
    else
      System.out.println("Cannot move backwards");
  }

	public void left(){
    if (xcoordinate>100){
      xcoordinate-=100;
    }
     else
      System.out.println("Cannot move left");
  }

	public void right(){
    if (xcoordinate<700){
      xcoordinate+=100;
    }
     else
      System.out.println("Cannot move right");
  }

	public void upright(){
    if (xcoordinate<700 && ycoordinate>100){
      xcoordinate+=100;
      ycoordinate+=100;
    }
     else
      System.out.println("Cannot move forwards and right");
  }

	public void upleft(){
    if (xcoordinate>100 && ycoordinate>100){
      xcoordinate-=100;
      ycoordinate+=100;
    }
     else
      System.out.println("Cannot move forwards and left");
  }

	public void downleft(){
    if (xcoordinate>100 && ycoordinate<700){
      xcoordinate-=100;
      ycoordinate-=100;
    }
     else
      System.out.println("Cannot move backwards and left");
  }

	public void downright(){
    if (xcoordinate<700 && ycoordinate<700){
      xcoordinate+=100;
      ycoordinate-=100;
    }
     else
      System.out.println("Cannot move backwards and right");
  }
}
