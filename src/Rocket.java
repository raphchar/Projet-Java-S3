public class Rocket implements SpaceShip{

    private int cost;
    private double rocketWeight;
    private double maxWeight;

    // Constructeur
    public Rocket(int cost, double rocketWeight, double maxWeight) {
        this.cost = cost;
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
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
