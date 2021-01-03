import java.util.Random;

public class U2 extends Rocket {

    private final Random random = new Random();

    // Constructeur de U2
    public U2() {
        super(120,18000,29000);
    }

    @Override
    public boolean land() {
        return random.nextDouble() < (0.08 * (this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight())));
    }


    @Override
    public boolean launch() {
        return random.nextDouble() < (0.04 * (this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight())));
    }
}