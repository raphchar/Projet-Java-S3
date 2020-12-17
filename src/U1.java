public class U1 extends Rocket {
    private static double random = Math.random() * 1 ;

    // Constructeur de U1
    public U1() {
        super(100, 10, 18);
    }


    @Override
    public boolean land() {
        return (0.01 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }

    @Override
    public boolean launch() {
        return (0.05 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }
}
