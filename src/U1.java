public class U1 extends Rocket {

    // Constructeur de U1
    public U1() {
        super(100, 10000, 18000);
    }


    @Override
    public boolean land() {
        double random = Math.random() * 0.1;
        return random > (0.01 * getCargoWeight()/(getMaxWeight() - getRocketWeight()));
    }

    @Override
    public boolean launch() {
        double random = Math.random() * 0.1;
        return random > (0.05 * getCargoWeight()/(getMaxWeight() - getRocketWeight()));
    }
}
