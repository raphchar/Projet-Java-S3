import java.util.ArrayList;

public class Rocket implements SpaceShip{

    int cost;                                   // Prix de la fusée
    double rocketWeight;                        // Poids de la fusée
    double maxWeight;                           // Poids max de la fusée
    ArrayList<Item> items;              // Liste des items dans la fusée

    public Rocket(int cost, double rocketWeight, double maxWeight) {
        items = new ArrayList<>();
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
        return (getCargoWeight() + item.getWeight()) <= (maxWeight - rocketWeight);
    }

    @Override
    public void carry(Item item) {
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
