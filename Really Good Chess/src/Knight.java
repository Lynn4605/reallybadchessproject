public class Knight extends Piece{
	private int ycoordinate;
	private int xcoordinate;
	private boolean color;
	public Knight(boolean c, int x, int y) {
		ycoordinate = y;
		xcoordinate = x;
		color = c;
	}
  public void upRight(){
    if(xcoordinate<700 && ycoordinate>200){
    xcoordinate+=100;
    ycoordinate-=200;
    } else
      System.out.println("Knight cannnot move up and right");
  }
  public void upLeft(){
    if(xcoordinate>100 && ycoordinate>200){
    xcoordinate-=100;
    ycoordinate-=200;
    } else
      System.out.println("Knight cannnot move up and left");
  }
  public void downRight(){
    if(xcoordinate<700 && ycoordinate<600) {
    xcoordinate+=100;
    ycoordinate+=200;
} else
      System.out.println("Knight cannnot move down and right");
  }
  public void downLeft(){
    if(xcoordinate>100 && ycoordinate<600){
    xcoordinate-=100;
    ycoordinate+=200;
    } else
      System.out.println("Knight cannnot move down and left");
  }
  public void rightSideUp(){
    if(xcoordinate<600 && ycoordinate>100){
    xcoordinate+=200;
    ycoordinate-=100;
  } else
      System.out.println("Knight cannnot move right and up");
  }
  public void rightSideDown(){
    if(xcoordinate<600 && ycoordinate <700){
    xcoordinate+=200;
    ycoordinate+=100;
    } else
      System.out.println("Knight cannnot move right and down");
  }
  public void leftSideUp(){
    if(xcoordinate>200 || ycoordinate>100){
    xcoordinate-=200;
    ycoordinate-=100;
    }
     else
      System.out.println("Knight cannnot move left and up");
  }

}
