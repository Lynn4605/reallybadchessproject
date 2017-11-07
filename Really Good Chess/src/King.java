public class king{
  public king(int c, int x, int y )
    if (c==1){
    }
  public void up(){
    if (y>100){
      y+=100;
      repaint;
    }
    else
      System.out.println("Cannot move forward");
  }
  public void down(){
    if (Y<700){
      y-=100;
      repaint;
    }
    else
      System.out.println("Cannot move backwards");
  }
  public void left(){
    if (x>100){
      x-=100;
      repaint;
    }
     else
      System.out.println("Cannot move left");
  }
  public void right(){
    if (x<700){
      x+=100;
      repaint;
    }
     else
      System.out.println("Cannot move right");
  }
  public void upright(){
    if (x<700 && y>100){
      x+=100;
      y+=100;
      repaint;
    }
     else
      System.out.println("Cannot move forwards and right");
  }
  public void upleft(){
    if (x>100 && y>100){
      x-=100;
      y+=100;
      repaint;
    }
     else
      System.out.println("Cannot move forwards and left");
  }
  public void downleft(){
    if (x>100 && y<700){
      x-=100;
      y-=100;
      repaint;
    }
     else
      System.out.println("Cannot move backwards and left");
  }
  public void downright(){
    if (x<700 && y<700){
      x+=100;
      y-=100;
      repaint;
    }
     else
      System.out.println("Cannot move backwards and right");
  }
}
