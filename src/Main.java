import entities.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");



        Neo neo = new Neo(3, 4, 'N', Status.ALIVE);
        Agent agente = new Agent(6, 2, 'A', Status.ACTIVO);
        Phone telefono = new Phone(4, 2, 'T', Status.REPOSO);

        System.out.println(neo.info());
        System.out.println(agente.info());
        System.out.println(telefono.info());
    }
}