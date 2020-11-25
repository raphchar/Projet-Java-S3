public class U2 extends Rocket {

    // Constructeur de U1
    public U2() {
        cost = 120;                         // Coût en millions de dollars
        rocketWeight = 18;                  // Poids en tonnes
        maxWeight = 29;                     // Poids en tonnes
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