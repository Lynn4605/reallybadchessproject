public class knight{
  public knight(int c, int x, int y )
    //if the knight is white
    if (c==1){
    }
  //if the knight is black
  if(c==0){
  }
  public void upRight(){
    x+=100;
      y+=300;
    repaint;
  }
  public void upLeft(){
    x-=100;
    x+=300;
    repaint;
  }
  public void downRight(){
    x+=100;
    y-=300;
    repaint;
  }
  public void downLeft(){
    x-=100;
    x-=300;
    repaint;
  }
  public void rightSideUp(){
    x+=300;
    y+=100;
    repaint;
  }
  public void rightSideDown(){
    x+=300;
    y-=100;
    repaint;
  }
  public void leftSideUp(){
    x-=300;
    y+=100;
    repaint;
  }
  public void rightSideDown(){
    x-=300;
    x-=100;
    repaint;
  }

}
