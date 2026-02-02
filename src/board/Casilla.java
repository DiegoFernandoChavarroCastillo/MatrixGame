package board;
import entities.Entity;

public class Casilla {
    private int x;
    private int y;
    private Entity entity;

    public Casilla(int x, int y) {
        this.x = x;
        this.y = y;
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
    
}
