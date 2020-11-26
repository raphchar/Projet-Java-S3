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

    @Override
    public boolean land() {
        this.rateOfLandingExplosion = rateOfCrash * ((double) cargoCarried / (double) cargoLimit);
        return (this.rateOfLandingExplosion >= this.random);
    }

    @Override
    public boolean launch() {
        this.rateOfLauchExplosion = rateOfExplosion * ((double) cargoCarried / (double) cargoLimit);
        return(this.rateOfLauchExplosion >= this.random);
    }
}