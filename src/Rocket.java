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

    // CONSTRUCTEUR
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

    // Méthode de l'interface
    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return (getRocketWeight() + item.getWeight()) <= (maxWeight - rocketWeight);
    }

    @Override
    public void carry(Item item) {
        // A compléter pas très bien compris l'énoncé
        rocketWeight += item.getWeight();
    }



}
