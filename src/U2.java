public class U2 extends Rocket {

    // Constructeur de U1
    public U2() {
        cost = 120;                         // Coût en millions de dollars
        rocketWeight = 18000;                  // Poids en kg
        maxWeight = 29000;                     // Poids en kg
        rateOfExplosion = 0.4;
        rateOfCrash = 0.8;

        cargoLimit = maxWeight - rocketWeight;
        realWeight = rocketWeight;
    }

    /**
     * Determine if the land is a success or not based on the comparison of a random number and
     * the rate of landing explosion of U1 rocket
     * @return boolean for the success or not of landing
     */
    @Override
    public boolean land() {
        this.rateOfLandingExplosion = rateOfCrash * ((double) cargoCarried / (double) cargoLimit);
        return (this.rateOfLandingExplosion >= this.random);
    }

    /**
     * Determine if the launch is a success or not based on the comparison of a random number and
     * the rate of launch explosion of U1 rocket
     * @return boolean for the success or not of launch
     */
    @Override
    public boolean launch() {
        this.rateOfLauchExplosion = rateOfExplosion * ((double) cargoCarried / (double) cargoLimit);
        return(this.rateOfLauchExplosion >= this.random);
    }
}