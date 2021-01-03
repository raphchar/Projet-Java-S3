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
        int u1Ph1_crash = u1Ph1_landCrash + u1Ph1_launchCrash;
        float u1Ph1_minlandCrashPer = (float) u1Ph1_simu[3];
        float u1Ph1_maxlandCrashPer = (float) u1Ph1_simu[4];
        float u1Ph1_minlaunchCrashPer = (float) u1Ph1_simu[5];
        float u1Ph1_maxlaunchCrashPer = (float) u1Ph1_simu[6];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Phase 1 with U1: $" + u1Ph1_cost + " Million");
        System.out.println("    Phase 1 with U1: " + u1Ph1_launchCrash + " Crashes during launch");
        System.out.println("    Phase 1 with U1: " + u1Ph1_landCrash + " Crashes during land");
        System.out.println("    Phase 1 with U1 Crashes: " + u1Ph1_crash);
        System.out.println("    Phase 1 with U1 Launching: " + u1Ph1_minlaunchCrashPer + "% of crashing at min, " + u1Ph1_maxlaunchCrashPer + "% of crashing at max");
        System.out.println("    Phase 1 with U1 Landing: " + u1Ph1_minlandCrashPer + "% of crashing at min, " + u1Ph1_maxlandCrashPer + "% of crashing at max");

        //System.out.println("---------------------------------------------------------------------");



        // Rockets U1 phase 2
        ArrayList<Item> u1Ph2 = missionToMars.loadItems("Phase-2.txt");
        u1Ro = missionToMars.loadU1(u1Ph2);
        Object[] u1Ph2_simu = missionToMars.runSimulation(u1Ro);
        int u1Ph2_cost = (int) u1Ph2_simu[0];
        int u1Ph2_launchCrash = (int) u1Ph2_simu[1];
        int u1Ph2_landCrash = (int) u1Ph2_simu[2];
        int u1Ph2_crash = u1Ph2_landCrash + u1Ph2_launchCrash;
        float u1Ph2_minlandCrashPer = (float) u1Ph2_simu[3];
        float u1Ph2_maxlandCrashPer = (float) u1Ph2_simu[4];
        float u1Ph2_minlaunchCrashPer = (float) u1Ph2_simu[5];
        float u1Ph2_maxlaunchCrashPer = (float) u1Ph2_simu[6];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Phase 2 with U1: $" + u1Ph2_cost + " Million");
        System.out.println("    Phase 2 with U1: " + u1Ph2_launchCrash + " Crashes during launch");
        System.out.println("    Phase 2 with U1: " + u1Ph2_landCrash + " Crashes during land");
        System.out.println("    Phase 2 with U1 Crash: " + u1Ph2_crash);
        System.out.println("    Phase 2 with U1 Launching: " + u1Ph2_minlaunchCrashPer + "% of crashing at min, " + u1Ph2_maxlaunchCrashPer + "% of crashing at max");
        System.out.println("    Phase 2 with U1 Landing: " + u1Ph2_minlandCrashPer + "% of crashing at min, " + u1Ph2_maxlandCrashPer + "% of crashing at max");

        //System.out.println("---------------------------------------------------------------------");


        // Rockets U1 total
        int u1_crash = u1Ph1_crash +u1Ph2_crash;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("    Rockets U1 : " + u1_crash + " total crashes");


        // Rockets U2 phase 1
        ArrayList<Item> u2Ph1 = missionToMars.loadItems("Phase-1.txt");
        ArrayList<Rocket> u2Ro = missionToMars.loadU2(u2Ph1);
        Object[] u2Ph1_simu = missionToMars.runSimulation(u2Ro);
        int u2Ph1_cost = (int) u2Ph1_simu[0];
        int u2Ph1_launchCrash = (int) u2Ph1_simu[1];
        int u2Ph1_landCrash = (int) u2Ph1_simu[2];
        int u2Ph1_crash = u2Ph1_landCrash + u2Ph1_launchCrash;
        float u2Ph1_minlandCrashPer = (float) u2Ph1_simu[3];
        float u2Ph1_maxlandCrashPer = (float) u2Ph1_simu[4];
        float u2Ph1_minlaunchCrashPer = (float) u2Ph1_simu[5];
        float u2Ph1_maxlaunchCrashPer = (float) u2Ph1_simu[6];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Phase 1 with U2: $" + u2Ph1_cost + " Million");
        System.out.println("    Phase 1 with U2: " + u2Ph1_launchCrash + " Crashes during launch");
        System.out.println("    Phase 1 with U2: " + u2Ph1_landCrash + " Crashes during land");
        System.out.println("    Phase 1 with U2 Crash: " + u2Ph1_crash);
        System.out.println("    Phase 1 with U2 Launching: " + u2Ph1_minlaunchCrashPer + "% of crashing at min, " + u2Ph1_maxlaunchCrashPer + "% of crashing at max");
        System.out.println("    Phase 1 with U2 Landing: " + u2Ph1_minlandCrashPer + "% of crashing at min, " + u2Ph1_maxlandCrashPer + "% of crashing at max");


        // Rockets U2 phase 2
        ArrayList<Item> u2Ph2 = missionToMars.loadItems("Phase-2.txt");
        u2Ro = missionToMars.loadU2(u2Ph2);
        Object[] u2Ph2_simu = missionToMars.runSimulation(u2Ro);
        int u2Ph2_cost = (int) u2Ph2_simu[0];
        int u2Ph2_launchCrash = (int) u2Ph2_simu[1];
        int u2Ph2_landCrash = (int) u2Ph2_simu[2];
        int u2Ph2_crash = u2Ph2_landCrash + u2Ph2_launchCrash;
        float u2Ph2_minlandCrashPer = (float) u2Ph2_simu[3];
        float u2Ph2_maxlandCrashPer = (float) u2Ph2_simu[4];
        float u2Ph2_minlaunchCrashPer = (float) u2Ph2_simu[5];
        float u2Ph2_maxlaunchCrashPer = (float) u2Ph2_simu[6];

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Phase 2 with U2: $" + u2Ph2_cost + " Million");
        System.out.println("    Phase 2 with U2: " + u2Ph2_launchCrash + " Crashes during launch");
        System.out.println("    Phase 2 with U2: " + u2Ph2_landCrash + " Crashes during land");
        System.out.println("    Phase 2 with U2 Crash: " + u2Ph2_crash);
        System.out.println("    Phase 2 with U2 Launching: " + u2Ph2_minlaunchCrashPer + "% of crashing at min, " + u2Ph2_maxlaunchCrashPer + "% of crashing at max");
        System.out.println("    Phase 2 with U2 Landing: " + u2Ph2_minlandCrashPer + "% of crashing at min, " + u2Ph2_maxlandCrashPer + "% of crashing at max");


        // Rockets U2 total
        int u2_crash = u2Ph1_crash +u2Ph2_crash;
        System.out.println("---------------------------------------------------------------------");
        System.out.println("    Rockets U2 : " + u2_crash + " total crashes");
        System.out.println("---------------------------------------------------------------------");

    }

}
