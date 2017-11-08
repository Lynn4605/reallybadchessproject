public class Pawn extends public class Piece{
  public Pawn(int c, int x, int y, boolean firstmove){
    firstmove =true;
    //if pawn is black 
    if (c==1){
    }
    //if pawn is white 
    if (c==0){
    }
    if (firstmove==true){
      public void doubleup{
        y+=200;
        firstmove = false;
      }
    public void up{
      if (y<700){
        y+=100;
        firstmove=false;
      }
      //convert to a dead piece
      else{ System.out.println("Cannot move forward");
          }
    }
    
    public void upright{
      //if (there's an enemy piece there){
    //}
      x+=100;
      y+=100;
      firstmove=false;
    }
    
    public void upleft{
  //if (there's an enemy piece there){
    //}
      x-=100;
      y+=100;
      firstmove=false;
    }
    
