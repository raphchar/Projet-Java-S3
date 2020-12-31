import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {


    public ArrayList<Item> loadItems (String nomFichier){
        ArrayList<Item> Items = new ArrayList<>();
        File fichier = new File(nomFichier);

        try{
            // On scanne le fichier
            Scanner scan = new Scanner(fichier);

            while(scan.hasNextLine()){
                String ligne = scan.nextLine();

                int indexSeparator = ligne.indexOf("=");        // On récupère l'index du = pour faire la séparation name, weight
                String name = ligne.substring(0, indexSeparator);
                double weight = Double.parseDouble(ligne.substring(indexSeparator + 1));

                // Ajoute dans Item
                Item item = new Item(name, weight);                 // On crée un nouvel item pour chaque ligne
                // Ajout dans le ArrayList
                Items.add(item);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erreur : fichier " +nomFichier+ " non trouvé");
        }

        return Items;
    }


    public ArrayList<Rocket> loadU1(ArrayList<Item> items){
        ArrayList<Rocket> Rockets = new ArrayList<>();
        // We have items in the items ArrayList
        while (items.size() > 0){
            // Create the new U1 rocket
            U1 u1 = new U1();
            for (int i = items.size() - 1; i >= 0; i--){
                // Check if the Rocket can carry the particular Item
                if (u1.canCarry(items.get(i))){
                    u1.carry(items.get(i));
                }
                items.remove(i);
            }
            Rockets.add(u1);
        }
        return Rockets;
    }


    public ArrayList<Rocket> loadU2(ArrayList<Item> items){
        ArrayList<Rocket> Rockets = new ArrayList<>();
        // We have items in the items ArrayList
        while (items.size() > 0){
            // Create the new U2 rocket
            U2 u2 = new U2();
            for (int i = items.size() - 1; i >= 0; i--){
                // Check if the Rocket can carry the particular Item
                if (u2.canCarry(items.get(i))){
                    u2.carry(items.get(i));
                }
                items.remove(i);
            }
            Rockets.add(u2);
        }
        return Rockets;
    }


    public Object[] runSimulation(ArrayList<Rocket> Rockets){
        // The total cost for the launch
        int totalCost = 0;
        int launchCrash = 0;
        int landCrash = 0;
        for (int i = 0; i <= Rockets.size()-1; i++){
            //Boolean variable for the if condition
            boolean launch = false;
            boolean land = false;
            // While a land or a launch failed we have to send a rocket
            while( !launch || !land){
                totalCost += Rockets.get(i).getCost();
                launch = Rockets.get(i).launch();
                land = Rockets.get(i).land();
                if (!launch){
                    //Rocket exploded during the launch
                    launchCrash += 1;
                } else{
                    if(!land){
                        //Rocket exploded during the land
                        landCrash += 1;
                    }
                }
            }
            Rockets.remove(i);

        }
        return new Object[]{totalCost, launchCrash, landCrash};
    }
}
