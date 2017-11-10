public class Coordinate{
  String[] xarray = {"A", "B", "C", "D", "E", "F", "G", "H"};
  String[] yarray = {"1", "2", "3", "4", "5", "6", "7", "8"};
  int xcoordinate;
  int ycoordinate;
  public Coordinate(int x, int y){
    xcoordinate = x;
    ycoordinate = y;
  }
  public void Block(){
    String Block = (xarray[xcoordinate/100])+(yarray[ycoordinate/100]);
  }
  public void point(){
    xcoordinate = ((xcoordinate/100)*100)+50;
    ycoordinate = ((ycoordinate/100)*100)+50;
  }
}
