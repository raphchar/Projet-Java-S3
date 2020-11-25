public class Rocket implements SpaceShip{

    int cost;                                   // Prix de la fusée
    double rocketWeight;                        // Poids de la fusée
    double maxWeight;                           // Poids max de la fusée

    double rateOfExplosion;                // Pourcentage de risque d'explosion
    double rateOfCrash;                    // Pourcentage de risque de crash
    double rateOfLauchExplosion;           // Pourcentage de risque d'explosion au départ
    double rateOfLandingExplosion;         // Pourcentage de risque d'explosion à l'atterissage


    // CONSTRUCTEUR
    public Rocket(int cost, double rocketWeight, double maxWeight, double rateOfExplosion, double rateOfCrash, double rateOfLauchExplosion, double rateOfLandingExplosion) {
        this.cost = cost;
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
        this.rateOfExplosion = rateOfExplosion;
        this.rateOfCrash = rateOfCrash;
        this.rateOfLauchExplosion = rateOfLauchExplosion;
        this.rateOfLandingExplosion = rateOfLandingExplosion;
    }

    //Getter
    public int getCost() {
        return cost;
    }
    public double getRocketWeight() {
        return rocketWeight;
    }
    public double getMaxWeight() {
        return maxWeight;
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
