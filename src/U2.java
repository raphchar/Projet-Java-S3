public class U2 extends Rocket {


    // Constructeur de U2
    public U2() {
        super(120,18000,29000);
    }

    @Override
    public boolean land() {
        double random = Math.random() * 0.8;
        return (0.08 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }

    @Override
    public boolean launch() {
        double random = Math.random() * 0.4;
        return (0.04 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }
}