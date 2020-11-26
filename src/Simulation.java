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
                Item item = new Item();                 // On crée un nouvel item pour chaque ligne
                String ligne = scan.nextLine();

                int indexSperateur = ligne.indexOf("=");        // On récupère l'index du = pour faire la séparation name, weight
                String name = ligne.substring(0, indexSperateur);
                double weight = Double.parseDouble(ligne.substring(indexSperateur + 1));

                // Ajoute dans Item
                item.name = name;
                item.weight = weight;
                // Ajout dans le ArrayList
                Items.add(item);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erreur : fichier " +nomFichier+ " non trouvé");
        }

        return Items;
    }
}
