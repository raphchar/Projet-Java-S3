public class U2 extends Rocket {
    double random = Math.random() * 1;

    // Constructeur de U2
    public U2() {
        super(120,18,29);
    }

    @Override
    public boolean land() {
        return (0.08 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }

    @Override
    public boolean launch() {
        return (0.04 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }
}