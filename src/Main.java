import java.util.ArrayList;



public class Main {

    public static void main(String args[] ) {

        Simulation missionToMars = new Simulation();

        // Rockets U1 phase 1
        ArrayList<Item> u1Ph1 = missionToMars.loadItems("Phase-1.txt");
        ArrayList<Rocket> u1Ro = missionToMars.loadU1(u1Ph1);
        int u1Ph1_cost = missionToMars.runSimulation(u1Ro);

        System.out.println("Phase 1 with U1: $" + u1Ph1_cost + " Million");


        // Rockets U1 phase 2
        ArrayList<Item> u1Ph2 = missionToMars.loadItems("Phase-2.txt");
        u1Ro = missionToMars.loadU1(u1Ph2);
        int u1Ph2_cost = missionToMars.runSimulation(u1Ro);

        System.out.println("Phase 2 with U1: $" + u1Ph2_cost + " Million");


        // Rockets U2 phase 1
        ArrayList<Item> u2Ph1 = missionToMars.loadItems("Phase-1.txt");
        ArrayList<Rocket> u2Ro = missionToMars.loadU2(u2Ph1);
        int u2Ph1_cost = missionToMars.runSimulation(u2Ro);

        System.out.println("Phase 1 with U2: $" + u2Ph1_cost + " Million");


        // Rockets U2 phase 2
        ArrayList<Item> u2Ph2 = missionToMars.loadItems("Phase-2.txt");
        u2Ro = missionToMars.loadU1(u2Ph2);
        int u2Ph2_cost = missionToMars.runSimulation(u2Ro);

        System.out.println("Phase 2 with U1: $" + u2Ph2_cost + " Million");

    }

}
