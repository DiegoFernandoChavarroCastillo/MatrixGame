package entities;

public class Neo extends Entity implements Runnable{
    public Neo(int x, int y, char symbol, Status status) {
        super(x, y, symbol, status);
    }
    public void run() {
        
    }

    public void moveToPhone(int x, int y, int phoneX, int phoneY){
        if (x < phoneX){
            x++;
        }else if (x > phoneX){
            x--;
        }
        if (y < phoneY){
            y++;
        }else if (y > phoneY){
            y--;
        }

        
    }
}
