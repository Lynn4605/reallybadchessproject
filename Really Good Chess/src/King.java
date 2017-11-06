public class king{
  public king(int c, int x, int y )
    if (c==1){
    }
  public void up(){
    y+=100;
    repaint;
  }
  public void down(){
    y-=100;
    repaint;
  }
  public void left(){
    x-=100;
    repaint;
  }
  public void right(){
    x+=100;
    repaint;
  }
  public void upright(){
    x+=100;
    y+=100;
    repaint;
  }
  public void upleft(){
    x-=100;
    y+=100;
    repaint;
  }
  public void downleft(){
    x-=100;
    y-=100;
    repaint;
  }
  public void downright(){
    x+=100;
    y-=100;
    repaint;
  }
}
