import entities.*;
import board.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Neo entro en la Matrix...");

        Tablero tablero;

        Entity[] entities = new Entity[5];
        tablero = new Tablero(10, entities);

        Neo neo = new Neo(3, 4, 'N', Status.ALIVE, tablero);
        Agent agente = new Agent(6, 2, 'A', Status.ACTIVO, tablero);
        Phone telefono = new Phone(5, 7, 'T', Status.REPOSO);
        Wall wall = new Wall(4, 6, 'M', Status.REPOSO);
        Wall wall2 = new Wall(4, 7, 'M', Status.REPOSO);

        entities[0] = neo;
        entities[1] = agente;
        entities[2] = telefono;
        entities[3] = wall;
        entities[4] = wall2;

        tablero.initBoard();
        tablero.placeEntities();
        tablero.printBoard();


        Thread neoThread = new Thread(neo);
        neoThread.start();
        Thread agentThread = new Thread(agente);
        agentThread.start();
    }
}