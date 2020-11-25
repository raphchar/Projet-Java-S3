public class U1 extends Rocket {

    // Constructeur de U1
    public U1() {
        cost = 100;                         // Coût en millions de dollars
        rocketWeight = 10;                  // Poids en tonnes
        maxWeight = 18;                     // Poids en tonnes
        rateOfExplosion = 0.5;
        rateOfCrash = 0.1;

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