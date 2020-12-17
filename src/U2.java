public class U2 extends Rocket {
    double random = Math.random() * 1;

    // Constructeur de U1
    public U2() {
        super(120,18000,29000);
    }

    @Override
    public boolean land() {
        return (0.8 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }

    @Override
    public boolean launch() {
        return (0.4 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }
}