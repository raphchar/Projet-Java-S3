import java.util.ArrayList;
import java.util.Scanner;


public class MainLoopIHM {

    public Object[] runMainLoopIHM(int nbRocketU1_Ph1, int nbRocketU1_Ph2, int nbRocketU2_Ph1, int nbRocketU2_Ph2) {

        /*Scanner sc = new Scanner(System.in);

        /System.out.println("=================================================");
        System.out.println("SIMULATIONS SUR LE LANCEMENT DES FUSÉES VERS MARS");
        System.out.println("=================================================");
        System.out.println( );

        System.out.print("Combien de fusée de type U1 voulez-vous lancer ? ");
        int nbRocketU1 = sc.nextInt();
        System.out.print("Sur les fusées U1 combien remplit-on avec la phase 1 ? ");
        int nbRocketU1_Ph1 = sc.nextInt();
        System.out.print("Sur les fusées U1 combien remplit-on avec la phase 2 ? ");
        int nbRocketU1_Ph2 = sc.nextInt();
        System.out.println();

        // Test des valeurs utilisateurs :
        while (nbRocketU1_Ph1 + nbRocketU1_Ph2 != nbRocketU1) {
            System.out.println("Il y a une erreur ! Veuillez la corriger. ");
            System.out.print("Veuillez changer la valeur du nombre de fusées utilisant la phase 1 : ");
            nbRocketU1_Ph1 = sc.nextInt();
            System.out.print("Veuillez changer la valeur du nombre de fusées utilisant la phase 2 : ");
            nbRocketU1_Ph2 = sc.nextInt();
        } System.out.println();

        System.out.print("Combien de fusée de type U2 voulez-vous lancer ? ");
        int nbRocketU2 = sc.nextInt();
        System.out.print("Sur les fusées U2 combien remplit-on avec la phase 1 ? ");
        int nbRocketU2_Ph1 = sc.nextInt();
        System.out.print("Sur les fusées U2 combien remplit-on avec la phase 2 ? ");
        int nbRocketU2_Ph2 = sc.nextInt();
        System.out.println();

        // Test des valeurs utilisateurs :
        while (nbRocketU2_Ph1 + nbRocketU2_Ph2 != nbRocketU2) {
            System.out.println("Il y a une erreur ! Veuillez la corriger. ");
            System.out.print("Veuillez changer la valeur du nombre de fusées utilisant la phase 1 : ");
            nbRocketU2_Ph1 = sc.nextInt();
            System.out.print("Veuillez changer la valeur du nombre de fusées utilisant la phase 2 : ");
            nbRocketU2_Ph2 = sc.nextInt();
        } System.out.println();*/


        Simulation missionToMars = new Simulation();

        //---------------------------------------------------------------------------------------------//
        // ROCKETS U1 PHASE 1
        int u1Ph1_TotalCost = 0, u1Ph1_TotalLaunchCrash = 0, u1Ph1_TotalLandCrash = 0;
        int u1Ph1_cost, u1Ph1_launchCrash, u1Ph1_landCrash;
        int u1Ph1_RocketNoCrash = 0;

        for (int i = 0; i < nbRocketU1_Ph1; i++) {
            ArrayList<Item> u1Ph1 = missionToMars.loadItems("Phase-1.txt");
            ArrayList<Rocket> u1Ro = missionToMars.loadU1(u1Ph1);
            Object[] u1Ph1_simu = missionToMars.runSimulation(u1Ro);
            u1Ph1_cost = (int) u1Ph1_simu[0];
            u1Ph1_launchCrash = (int) u1Ph1_simu[1];
            u1Ph1_landCrash = (int) u1Ph1_simu[2];

            u1Ph1_TotalCost += u1Ph1_cost;
            u1Ph1_TotalLaunchCrash += u1Ph1_launchCrash;
            u1Ph1_TotalLandCrash += u1Ph1_landCrash;

            if (u1Ph1_launchCrash + u1Ph1_landCrash == 0){
                u1Ph1_RocketNoCrash += 1;
            }

        }
        int u1Ph1_TotalCrash = u1Ph1_TotalLaunchCrash + u1Ph1_TotalLandCrash;

        /*
        System.out.println("---------------------------------------------------------------------");
        System.out.println("For the " + nbRocketU1_Ph1 + " rockets U1 using phase I");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("    Total cost: $" + u1Ph1_TotalCost + " Million");
        System.out.println("    Total: " + u1Ph1_TotalLaunchCrash + " Crashes during launch");
        System.out.println("    Total: " + u1Ph1_TotalLandCrash + " Crashes during land");
        System.out.println("    Total crashes: " + u1Ph1_TotalCrash);
        System.out.println("    U1 phase I rockets that not crash : " + u1Ph1_RocketNoCrash);
        System.out.println( );
        if (u1Ph1_TotalCrash > 0){
            System.out.println("    Chance of crash during launching is : " +
                    (u1Ph1_TotalLaunchCrash/(float) u1Ph1_TotalCrash) * 100 + "%");
            System.out.println("    Chance of crash during landing is : " +
                    (u1Ph1_TotalLandCrash/(float) u1Ph1_TotalCrash) * 100 + "%");
        }
        System.out.println("    Chance to have any crash for a U1 rocket with phase I : " +
                (u1Ph1_RocketNoCrash/(float) nbRocketU1_Ph1) * 100 + "%");*/


        //---------------------------------------------------------------------------------------------//
        // ROCKETS U1 PHASE 2
        int u1Ph2_TotalCost = 0, u1Ph2_TotalLaunchCrash = 0, u1Ph2_TotalLandCrash = 0;
        int u1Ph2_cost, u1Ph2_launchCrash, u1Ph2_landCrash;
        int u1Ph2_RocketNoCrash = 0;

        for (int i = 0; i < nbRocketU1_Ph2; i++) {
            ArrayList<Item> u1Ph2 = missionToMars.loadItems("Phase-2.txt");
            ArrayList<Rocket> u1Ro = missionToMars.loadU1(u1Ph2);
            Object[] u1Ph2_simu = missionToMars.runSimulation(u1Ro);
            u1Ph2_cost = (int) u1Ph2_simu[0];
            u1Ph2_launchCrash = (int) u1Ph2_simu[1];
            u1Ph2_landCrash = (int) u1Ph2_simu[2];

            u1Ph2_TotalCost += u1Ph2_cost;
            u1Ph2_TotalLaunchCrash += u1Ph2_launchCrash;
            u1Ph2_TotalLandCrash += u1Ph2_landCrash;

            if (u1Ph2_landCrash + u1Ph2_launchCrash == 0){
                u1Ph2_RocketNoCrash += 1;
            }

        }
        int u1Ph2_TotalCrash = u1Ph2_TotalLaunchCrash + u1Ph2_TotalLandCrash;
        /*
        System.out.println( );
        System.out.println("---------------------------------------------------------------------");
        System.out.println("For the " + nbRocketU1_Ph2 + " rockets U1 using phase II");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("    Total cost: $" + u1Ph2_TotalCost + " Million");
        System.out.println("    Total: " + u1Ph2_TotalLaunchCrash + " Crashes during launch");
        System.out.println("    Total: " + u1Ph2_TotalLandCrash + " Crashes during land");
        System.out.println("    Total crashes: " + u1Ph2_TotalCrash);
        System.out.println("    U1 phase II rockets that not crash : " + u1Ph2_RocketNoCrash);
        System.out.println( );
        if (u1Ph2_TotalCrash > 0){
            System.out.println("    Chance of crash during launching is : " +
                    (u1Ph2_TotalLaunchCrash/(float) u1Ph2_TotalCrash) * 100 + "%");
            System.out.println("    Chance of crash during landing is : " +
                    (u1Ph2_TotalLandCrash/(float) u1Ph2_TotalCrash) * 100 + "%");
        }
        System.out.println("    Chance to have any crash for a U1 rocket with phase II : " +
                (u1Ph2_RocketNoCrash/(float) nbRocketU1_Ph2) * 100 + "%");
        */

        //---------------------------------------------------------------------------------------------//
        // ROCKETS U2 PHASE 1
        int u2Ph1_TotalCost = 0, u2Ph1_TotalLaunchCrash = 0, u2Ph1_TotalLandCrash = 0;
        int u2Ph1_cost, u2Ph1_launchCrash, u2Ph1_landCrash;
        int u2Ph1_RocketNoCrash =0;


        for (int i = 0; i < nbRocketU2_Ph1; i++) {
            ArrayList<Item> u2Ph1 = missionToMars.loadItems("Phase-1.txt");
            ArrayList<Rocket> u2Ro = missionToMars.loadU1(u2Ph1);
            Object[] u2Ph1_simu = missionToMars.runSimulation(u2Ro);
            u2Ph1_cost = (int) u2Ph1_simu[0];
            u2Ph1_launchCrash = (int) u2Ph1_simu[1];
            u2Ph1_landCrash = (int) u2Ph1_simu[2];

            u2Ph1_TotalCost += u2Ph1_cost;
            u2Ph1_TotalLaunchCrash += u2Ph1_launchCrash;
            u2Ph1_TotalLandCrash += u2Ph1_landCrash;

            if (u2Ph1_launchCrash + u2Ph1_landCrash == 0){
                u2Ph1_RocketNoCrash += 1;
            }
        }
        int u2Ph1_TotalCrash = u2Ph1_TotalLaunchCrash + u2Ph1_TotalLandCrash;

        /*
        System.out.println("---------------------------------------------------------------------");
        System.out.println("For the " + nbRocketU2_Ph1 + " rockets U2 using phase I");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("    Total cost: $" + u2Ph1_TotalCost + " Million");
        System.out.println("    Total: " + u2Ph1_TotalLaunchCrash + " Crashes during launch");
        System.out.println("    Total: " + u2Ph1_TotalLandCrash + " Crashes during land");
        System.out.println("    Total crashes: " + u2Ph1_TotalCrash);
        System.out.println("    U2 phase I rockets that not crash : " + u2Ph1_RocketNoCrash);
        System.out.println( );
        if (u2Ph1_TotalCrash > 0){
            System.out.println("    Chance of crash during launching is : " +
                    (u2Ph1_TotalLaunchCrash/(float) u2Ph1_TotalCrash) * 100 + "%");
            System.out.println("    Chance of crash during landing is : " +
                    (u2Ph1_TotalLandCrash/(float) u2Ph1_TotalCrash) * 100 + "%");
        }
        System.out.println("    Chance to have any crash for a U2 rocket with phase I : " +
                (u2Ph1_RocketNoCrash/(float) nbRocketU2_Ph1) * 100 + "%");
        */

        //---------------------------------------------------------------------------------------------//
        // ROCKETS U2 PHASE 2
        int u2Ph2_TotalCost = 0, u2Ph2_TotalLaunchCrash = 0, u2Ph2_TotalLandCrash = 0;
        int u2Ph2_cost, u2Ph2_launchCrash, u2Ph2_landCrash;
        int u2Ph2_RocketNoCrash = 0;


        for (int i = 0; i < nbRocketU2_Ph2; i++) {
            ArrayList<Item> u2Ph2 = missionToMars.loadItems("Phase-2.txt");
            ArrayList<Rocket> u2Ro = missionToMars.loadU1(u2Ph2);
            Object[] u2Ph2_simu = missionToMars.runSimulation(u2Ro);
            u2Ph2_cost = (int) u2Ph2_simu[0];
            u2Ph2_launchCrash = (int) u2Ph2_simu[1];
            u2Ph2_landCrash = (int) u2Ph2_simu[2];

            u2Ph2_TotalCost += u2Ph2_cost;
            u2Ph2_TotalLaunchCrash += u2Ph2_launchCrash;
            u2Ph2_TotalLandCrash += u2Ph2_landCrash;

            if (u2Ph2_launchCrash + u2Ph2_landCrash == 0){
                u2Ph2_RocketNoCrash += 1;
            }
        }
        int u2Ph2_TotalCrash = u2Ph2_TotalLaunchCrash + u2Ph2_TotalLandCrash;
        /*
        System.out.println( );
        System.out.println("---------------------------------------------------------------------");
        System.out.println("For the " + nbRocketU2_Ph2 + " rockets U2 using phase II");
        System.out.println("---------------------------------------------------------------------");

        System.out.println("    Total cost: $" + u2Ph2_TotalCost + " Million");
        System.out.println("    Total: " + u2Ph2_TotalLaunchCrash + " Crashes during launch");
        System.out.println("    Total: " + u2Ph2_TotalLandCrash + " Crashes during land");
        System.out.println("    Total crashes: " + u2Ph2_TotalCrash);
        System.out.println("    U2 phase I rockets that not crash : " + u2Ph2_RocketNoCrash);
        System.out.println( );
        if (u2Ph2_TotalCrash > 0){
            System.out.println("    Chance of crash during launching is : " +
                    (u2Ph2_TotalLaunchCrash/(float) u2Ph2_TotalCrash) * 100 +
                    "%");
            System.out.println("    Chance of crash during landing is : " +
                    (u2Ph2_TotalLandCrash/(float) u2Ph2_TotalCrash) * 100 +
                    "%");
        }
        System.out.println("    Chance to have any crash for a U2 rocket with phase II : " +
                (u2Ph2_RocketNoCrash/(float) nbRocketU2_Ph2) * 100 +
                "%");

         */


        return new Object[]{
                u1Ph1_TotalCost, u1Ph1_TotalLaunchCrash, u1Ph1_TotalLandCrash, u1Ph1_RocketNoCrash, u1Ph1_TotalCrash,
                u1Ph2_TotalCost, u1Ph2_TotalLaunchCrash, u1Ph2_TotalLandCrash, u1Ph2_RocketNoCrash, u1Ph2_TotalCrash,
                u2Ph1_TotalCost, u2Ph1_TotalLaunchCrash, u2Ph1_TotalLandCrash, u2Ph1_RocketNoCrash, u2Ph1_TotalCrash,
                u2Ph2_TotalCost, u2Ph2_TotalLaunchCrash, u2Ph2_TotalLandCrash, u2Ph2_RocketNoCrash, u2Ph2_TotalCrash
        };
    }
}
