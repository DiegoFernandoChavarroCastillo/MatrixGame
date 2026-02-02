package board;
import entities.Entity;

public class Tablero {
    private int size;
    private Casilla[][] board;
    private Entity[] entities;

    public Tablero(int size, Entity[] entities){
        this.size = size;
        this.board = new Casilla[size][size];
        this.entities = entities;

    }

    public void initBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = new Casilla(i, j);
            }
        }
    }

    public void placeEntities(){
        for (Entity entity : entities) {
            board[entity.getX()][entity.getY()].setEntity(entity);
        }
    }

    public void printBoard(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j].getEntity() == null){
                    System.out.print("[ ]");
                }else{
                    System.out.print("[" + board[i][j].getEntity().getSymbol() + "]");
                }
            }
            System.out.println();
        }
    }
}
