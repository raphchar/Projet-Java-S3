import java.util.Random;

public class U1 extends Rocket {

    private final Random random = new Random();

    // Constructeur de U1
    public U1() {
        super(100, 10000, 18000);
    }


    @Override
    public boolean land() {
        this.crashPerLand = (float) (0.01 * this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight()));
        return random.nextDouble() < this.crashPerLand;
    }

    @Override
    public boolean launch() {
        this.crashPerLaunch = (float) (0.05 * this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight()));
        return random.nextDouble() < this.crashPerLaunch;
    }
}
