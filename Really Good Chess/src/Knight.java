public class knight{
  public knight(int c, int x, int y )
    //if the knight is black
    if (c==1){
    }
  //if the knight is white
  if(c==0){
  }
  public void upRight(){
    if(x<700 || y>200){
    x+=100;
    y-=300;
    repaint;
    } else
      System.out.println("Knight cannnot move up and right");
  }
  public void upLeft(){
    if(x>100 || y>200){
    x-=100;
    y-=300;
    repaint;
    }
  }
  public void downRight(){
    if(x
    x+=100;
    y+=300;
    repaint;
  }
  public void downLeft(){
    x-=100;
    y+=300;
    repaint;
  }
  public void rightSideUp(){
    x+=300;
    y-=100;
    repaint;
  }
  public void rightSideDown(){
    x+=300;
    y+=100;
    repaint;
  }
  public void leftSideUp(){
    x-=300;
    y-=100;
    repaint;
  }
  public void rightSideDown(){
    x-=300;
    y+=100;
    repaint;
  }

}
