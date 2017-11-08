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
    y-=200;
    repaint;
    } else
      System.out.println("Knight cannnot move up and right");
  }
  public void upLeft(){
    if(x>100 || y>200){
    x-=100;
    y-=200;
    repaint;
    } else
      System.out.println("Knight cannnot move up and left");
  }
  public void downRight(){
    if(x<700 || y<600)}
    x+=100;
    y+=200;
    repaint;
} else
      System.out.println("Knight cannnot move down and right");
  }
  public void downLeft(){
    if(x>100 || y<600){
    x-=100;
    y+=200;
    repaint;
    } else
      System.out.println("Knight cannnot move down and left");
  }
  public void rightSideUp(){
    if(x<600 || y>100){
    x+=200;
    y-=100;
    repaint;
  } else
      System.out.println("Knight cannnot move right and up");
  }
  public void rightSideDown(){
    if(x<600 || y <700){
    x+=200;
    y+=100;
    repaint;
    } else
      System.out.println("Knight cannnot move right and down");
  }
  public void leftSideUp(){
    if(x>200 || y>100){
    x-=200;
    y-=100;
    repaint;
    }
     else
      System.out.println("Knight cannnot move left and up");
  }
  public void rightSideDown(){
    if(x<600 || y<700){
    x-=200;
    y+=100;
    repaint;
    } else
      System.out.println("Knight cannnot move up and down");
  }

}
