package entities;

import board.Tablero;

public class Neo extends Entity implements Runnable {
    private Tablero tablero;

    public Neo(int x, int y, char symbol, Status status, Tablero tablero) {
        super(x, y, symbol, status);
        this.tablero = tablero;
    }

    public void run() {
        /**
         * Ejecuta el comportamiento del hilo de Neo.
         * Busca la posición del teléfono en el tablero y mueve a Neo
         * paso a paso hacia él, imprimiendo el tablero en cada movimiento,
         * hasta que alcanza dicha posición.
         */
        int phoneX = -1;
        int phoneY = -1;


        for (int i = 0; i < tablero.getSize(); i++) {
            for (int j = 0; j < tablero.getSize(); j++) {
                Entity e = tablero.getEntity(i, j);
                if (e instanceof Phone) {
                    phoneX = i;
                    phoneY = j;
                    break;
                }
            }
        }

        if (phoneX == -1)
            return;

        while (getX() != phoneX || getY() != phoneY) {
            moveToPhone(phoneX, phoneY);
            tablero.printBoard();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Neo ha llegado al teléfono!");
    }

    public void moveToPhone(int phoneX, int phoneY) {
        int nextX = getX();
        int nextY = getY();

        
        int diffX = phoneX - getX();
        int diffY = phoneY - getY();

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
        if (entidad instanceof Wall || entidad instanceof Agent) {
            return false;
        }

        return true;
    }
}
