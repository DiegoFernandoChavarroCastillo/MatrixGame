import entities.*;
import board.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Neo entro en la Matrix...");

        Tablero tablero;

        Entity[] entities = new Entity[6];
        tablero = new Tablero(10, entities);

        Neo neo = new Neo(3, 4, 'N', Status.ALIVE, tablero);
        Agent agente = new Agent(6, 2, 'A', Status.ACTIVO, tablero, neo);
        Phone telefono = new Phone(5, 7, 'T', Status.REPOSO);
        Wall wall = new Wall(4, 6, '#', Status.REPOSO);
        Wall wall2 = new Wall(4, 7, '#', Status.REPOSO);
        Wall wall3 = new Wall(6, 3, '#', Status.REPOSO);

        entities[0] = neo;
        entities[1] = agente;
        entities[2] = telefono;
        entities[3] = wall;
        entities[4] = wall2;
        entities[5] = wall3;

        tablero.initBoard();
        tablero.placeEntities();
        tablero.printBoard();

        Thread neoThread = new Thread(neo);
        neoThread.start();
        Thread agentThread = new Thread(agente);
        agentThread.start();

        try {
            neoThread.join();
            agentThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- JUEGO TERMINADO ---");
        if (neo.getStatus() == Status.FREE) {
            System.out.println("Ganaste! Neo ha escapado de la Matrix.");
        } else if (neo.getStatus() == Status.DEAD) {
            System.out.println("Perdiste. El Agente ha eliminado a Neo.");
        } else {
            System.out.println("El juego termino ???.");
        }
    }
}