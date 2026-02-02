package entities;

import board.Tablero;

public class Agent extends Entity implements Runnable{
    private Tablero tablero;
    public Agent(int x, int y, char symbol, Status status, Tablero tablero){
    super(x, y, symbol, status);
    this.tablero = tablero;
  }

  public void run(){
    
  }

  public void moveToNeo(int x, int y, int neoX, int neoY){
    
  }


  public boolean validateMove(int x, int y){
        if (x>=tablero.getSize() || y>=tablero.getSize() || x<0 || y<0){
            return false;
        }
        
        Entity entidad = tablero.getEntity(x,y);
        if (entidad instanceof Wall || entidad instanceof Phone){
            return false;
        }
        
        return true;
    }
  


}
