import java.util.ArrayList;

public class Rocket implements SpaceShip{

    int cost;                                   // Prix de la fusée
    double rocketWeight;                        // Poids de la fusée
    double maxWeight;                           // Poids max de la fusée
    private ArrayList<Item> items;              // Liste des items dans la fusée

    public Rocket(int cost, double rocketWeight, double maxWeight) {
        this.cost = cost;
        this.rocketWeight = rocketWeight;
        this.maxWeight = maxWeight;
    }

    // Getter
    public int getCost() {
        return cost;
    }
    public double getRocketWeight() {
        return rocketWeight;
    }
    public double getMaxWeight() {
        return maxWeight;
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


    @Override
    public boolean canCarry(Item item) {
        return (getRocketWeight() + item.getWeight()) <= (maxWeight - rocketWeight);
    }

    @Override
    public void carry(Item item) {
        // Test si l'item est déja dans la liste la dedans??
        items.add(item);
    }

    public double getCargoWeight(){
        double cargoWeight = 0;
        for (Item cargoElement : items){
            cargoWeight += cargoElement.getWeight();
        }
        return cargoWeight;
    }
}
