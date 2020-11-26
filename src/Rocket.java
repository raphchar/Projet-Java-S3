import java.util.ArrayList;
import java.util.Random;


public class Rocket implements SpaceShip{

    int cost;                                   // Prix de la fusée
    int rocketWeight;                        // Poids de la fusée
    int maxWeight;                           // Poids max de la fusée

    int cargoCarried;                       // Poids de la cargaison dans la fusée
    int cargoLimit;                         // Poids limite de la cargaison dans la fusée

    int realWeight;                         // Poids de l'ensemble fusée + cargaison

    double rateOfExplosion;                // Pourcentage de risque d'explosion
    double rateOfCrash;                    // Pourcentage de risque de crash
    double rateOfLauchExplosion;           // Pourcentage de risque d'explosion au départ
    double rateOfLandingExplosion;         // Pourcentage de risque d'explosion à l'atterissage

    double random;                         // Nombre aléatoire

    ArrayList<Item> listeItems = new ArrayList<Item>();     // Liste des items dans la fusée

    /**
     * Constructeur
     * @param cost cost of the rocket in dollar
     * @param rocketWeight weight of the rocket in kilograms
     * @param maxWeight the maximum weight allowed for the rocket in kilograms
     * @param cargoCarried the curent weight of the element in the rocket in kilograms
     * @param cargoLimit the maximum weight of the cargo in the rocket
     * @param realWeight weight of the rocket + cargo
     * @param rateOfExplosion percentage of explosion
     * @param rateOfCrash percentage of crash
     * @param rateOfLauchExplosion percentage of explosion during lauch
     * @param rateOfLandingExplosion percentage of explosion during landind
     */
    public Rocket(int cost, int rocketWeight, int maxWeight, int cargoCarried, int cargoLimit, int realWeight, double rateOfExplosion, double rateOfCrash, double rateOfLauchExplosion, double rateOfLandingExplosion) {
        this.cost = cost;
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
        this.cargoCarried = cargoCarried;
        this.cargoLimit = cargoLimit;
        this.realWeight = realWeight;
        this.rateOfExplosion = rateOfExplosion;
        this.rateOfCrash = rateOfCrash;
        this.rateOfLauchExplosion = rateOfLauchExplosion;
        this.rateOfLandingExplosion = rateOfLandingExplosion;

        random = new Random().nextDouble();
    }

    public Rocket() {
    }

    //Getter
    public int getCost() {
        return cost;
    }
    public int getRocketWeight() {
        return rocketWeight;
    }
    public int getMaxWeight() {
        return maxWeight;
    }
    public int getCargoCarried() {
        return cargoCarried;
    }
    public int getCargoLimit() {
        return cargoLimit;
    }
    public int getRealWeight() {
        return realWeight;
    }
    public double getRateOfExplosion() {
        return rateOfExplosion;
    }
    public double getRateOfCrash() {
        return rateOfCrash;
    }
    public double getRateOfLauchExplosion() {
        return rateOfLauchExplosion;
    }
    public double getRateOfLandingExplosion() {
        return rateOfLandingExplosion;
    }

    /**
     * Determine if the launch is a success or not
     * @return true if we have a successful launch, false if it fails
     */
    @Override
    public boolean launch() {
        return true;
    }

    /**
     * Determine if the land is a sucess or not
     * @return true if we have a successful land, false if it fails
     */
    @Override
    public boolean land() {
        return true;
    }

    /**
     *
     * @param item
     * @return
     */
    @Override
    public boolean canCarry(Item item) {
        return (getRocketWeight() + item.getWeight()) <= (maxWeight - rocketWeight);
    }

    @Override
    public void carry(Item item) {
        // Test si l'item est déja dans la liste la dedans??
        rocketWeight += item.getWeight();
        listeItems.add(item);
    }



}
