import java.util.Random;

public class U2 extends Rocket {

    private final Random random = new Random();

    // Constructeur de U2
    public U2() {
        super(120,18000,29000);
    }

    @Override
    public boolean land() {
        this.crashPerLand = (float) (0.08 * (this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight())));
        return random.nextDouble() < this.crashPerLand;
    }


    @Override
    public boolean launch() {
        this.crashPerLaunch = (float) (0.04 * (this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight())));
        return random.nextDouble() < this.crashPerLaunch;
    }
}