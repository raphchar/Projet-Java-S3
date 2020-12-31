import java.util.ArrayList;



public class Main {

    public static void main(String args[] ) {

        Simulation missionToMars = new Simulation();

        // Rockets U1 phase 1
        ArrayList<Item> u1Ph1 = missionToMars.loadItems("Phase-1.txt");
        ArrayList<Rocket> u1Ro = missionToMars.loadU1(u1Ph1);
        Object[] u1Ph1_simu = missionToMars.runSimulation(u1Ro);
        int u1Ph1_cost = (int) u1Ph1_simu[0];
        int u1Ph1_launchCrash = (int) u1Ph1_simu[1];
        int u1Ph1_landCrash = (int) u1Ph1_simu[2];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Phase 1 with U1: $" + u1Ph1_cost + " Million");
        System.out.println("    Phase 1 with U1: " + u1Ph1_launchCrash + " Crashes during launch");
        System.out.println("    Phase 1 with U1: " + u1Ph1_landCrash + " Crashes during land");
        //System.out.println("---------------------------------------------------------------------");



        // Rockets U1 phase 2
        ArrayList<Item> u1Ph2 = missionToMars.loadItems("Phase-2.txt");
        u1Ro = missionToMars.loadU1(u1Ph2);
        Object[] u1Ph2_simu = missionToMars.runSimulation(u1Ro);
        int u1Ph2_cost = (int) u1Ph2_simu[0];
        int u1Ph2_launchCrash = (int) u1Ph2_simu[1];
        int u1Ph2_landCrash = (int) u1Ph2_simu[2];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Phase 2 with U1: $" + u1Ph2_cost + " Million");
        System.out.println("    Phase 2 with U1: " + u1Ph2_launchCrash + " Crashes during launch");
        System.out.println("    Phase 2 with U1: " + u1Ph2_landCrash + " Crashes during land");
        //System.out.println("---------------------------------------------------------------------");



        // Rockets U2 phase 1
        ArrayList<Item> u2Ph1 = missionToMars.loadItems("Phase-1.txt");
        ArrayList<Rocket> u2Ro = missionToMars.loadU2(u2Ph1);
        Object[] u2Ph1_simu = missionToMars.runSimulation(u2Ro);
        int u2Ph1_cost = (int) u2Ph1_simu[0];
        int u2Ph1_launchCrash = (int) u2Ph1_simu[1];
        int u2Ph1_landCrash = (int) u2Ph1_simu[2];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Phase 1 with U2: $" + u2Ph1_cost + " Million");
        System.out.println("    Phase 1 with U2: " + u2Ph1_launchCrash + " Crashes during launch");
        System.out.println("    Phase 1 with U2: " + u2Ph1_landCrash + " Crashes during land");


        // Rockets U2 phase 2
        ArrayList<Item> u2Ph2 = missionToMars.loadItems("Phase-2.txt");
        u2Ro = missionToMars.loadU2(u2Ph2);
        Object[] u2Ph2_simu = missionToMars.runSimulation(u2Ro);
        int u2Ph2_cost = (int) u2Ph2_simu[0];
        int u2Ph2_launchCrash = (int) u2Ph2_simu[1];
        int u2Ph2_landCrash = (int) u2Ph2_simu[2];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Phase 2 with U2: $" + u2Ph2_cost + " Million");
        System.out.println("    Phase 2 with U2: " + u2Ph2_launchCrash + " Crashes during launch");
        System.out.println("    Phase 2 with U2: " + u2Ph2_landCrash + " Crashes during land");
        System.out.println("---------------------------------------------------------------------");

    }

}
