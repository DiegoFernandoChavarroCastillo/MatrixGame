package entities;

import board.Tablero;

public class Agent extends Entity implements Runnable {
  private Tablero tablero;

  public Agent(int x, int y, char symbol, Status status, Tablero tablero) {
    super(x, y, symbol, status);
    this.tablero = tablero;
  }

  public void run() {
    while (true) {
      int neoX = -1;
      int neoY = -1;

      for (int i = 0; i < tablero.getSize(); i++) {
        for (int j = 0; j < tablero.getSize(); j++) {
          Entity e = tablero.getEntity(i, j);
          if (e instanceof Neo) {
            neoX = i;
            neoY = j;
            break;
          }
        }
      }

      if (neoX == -1) {
        System.out.println("El Agente ya no encuentra a Neo.");
        break;
      }

      moveToNeo(getX(), getY(), neoX, neoY);
      tablero.printBoard();

      if (getX() == neoX && getY() == neoY) {
        tablero.getEntity(getX(), getY()).setStatus(Status.DEAD);
        System.out.println("El Agente ha atrapado a Neo!");
        break;
      }

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void moveToNeo(int x, int y, int neoX, int neoY) {
    int nextX = getX();
    int nextY = getY();

    int diffX = neoX - getX();
    int diffY = neoY - getY();


    if (Math.abs(diffX) >= Math.abs(diffY)) {
      int stepX = diffX > 0 ? 1 : -1;
      if (validateMove(getX() + stepX, getY())) {
        nextX = getX() + stepX;
      } else {
        int stepY = diffY != 0 ? (diffY > 0 ? 1 : -1) : (Math.random() > 0.5 ? 1 : -1);
        if (validateMove(getX(), getY() + stepY)) {
          nextY = getY() + stepY;
        }
      }
    } else {
      int stepY = diffY > 0 ? 1 : -1;
      if (validateMove(getX(), getY() + stepY)) {
        nextY = getY() + stepY;
      } else {
        int stepX = diffX != 0 ? (diffX > 0 ? 1 : -1) : (Math.random() > 0.5 ? 1 : -1);
        if (validateMove(getX() + stepX, getY())) {
          nextX = getX() + stepX;
        }
      }
    }

    if (nextX != getX() || nextY != getY()) {
      tablero.moveEntity(this, nextX, nextY);
      setX(nextX);
      setY(nextY);
    }
  }

  public boolean validateMove(int x, int y) {
    if (x >= tablero.getSize() || y >= tablero.getSize() || x < 0 || y < 0) {
      return false;
    }

    Entity entidad = tablero.getEntity(x, y);
    if (entidad instanceof Wall || entidad instanceof Phone) {
      return false;
    }

    return true;
  }

}
