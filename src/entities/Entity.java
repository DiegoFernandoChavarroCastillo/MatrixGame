package entities;

public abstract class Entity {
    private int x;
    private int y;
    private char symbol;
    private Status status;

    public Entity(int x, int y, char symbol, Status status) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
        this.status = status;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public char getSymbol(){
        return symbol;
    }
    public String info(){
        return "Symbol: " + symbol + " Position: (" + x + ", " + y + ") Status: " + status;
    }
    
}