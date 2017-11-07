public class Pawn{
  public Pawn(int c, int x, int y){
    //if pawn is black 
    if (c==1){
    }
    //if pawn is white 
    if (c==0){
    }
    
    public void up{
      if (y<700){
        y+=100;
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
    }
    
    public void upleft{
  //if (there's an enemy piece there){
    //}
      x-=100;
      y+=100;
    }
    
