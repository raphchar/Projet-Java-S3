public class U1 extends Rocket {
    double random = Math.random() * 1;

    // Constructeur de U1
    public U1() {
        super(100, 1000, 18000);
    }

    /**
     * Determine if the land is a success or not based on the comparison of a random number and
     * the rate of landing explosion of U1 rocket
     * @return boolean for the success or not of landing
     */
    @Override
    public boolean land() {
        return (0.1 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }

    /**
     * Determine if the launch is a success or not based on the comparison of a random number and
     * the rate of launch explosion of U1 rocket
     * @return boolean for the success or not of launch
     */
    @Override
    public boolean launch() {
        return (0.5 * (getCargoWeight()/(getMaxWeight() - getRocketWeight())) >= random);
    }
}
