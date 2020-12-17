public class U1 extends Rocket {
    private static double random = Math.random() * 1 ;

    // Constructeur de U1
    public U1() {
        super(100, 1000, 18000);
    }


    @Override
    public boolean land() {
        return (0.1 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }

    @Override
    public boolean launch() {
        return (0.5 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }
}
