package entities;

public class Agent extends Entity implements Runnable{
  public Agent(int x, int y, char symbol, Status status){
    super(x, y, symbol, status);
  }

  public void run(){
    
  }

  public void moveToNeo(int x, int y, int neoX, int neoY){
    if (x < neoX){
      x++;
    }else if (x > neoX){
      x--;
    }
    if (y < neoY){
      y++;
    }else if (y > neoY){
      y--;
    }
  }
  


}
