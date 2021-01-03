import java.util.Random;

public class U1 extends Rocket {

    private final Random random = new Random();

    // Constructeur de U1
    public U1() {
        super(100, 10000, 18000);
    }


    @Override
    public boolean land() {
        float percentage = (float) (0.1 * this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight()));

        if (percentage > maxCrashLandPer) {
            maxCrashLandPer = percentage;
        }
        if (percentage < minCrashLandPer) {
            minCrashLandPer = percentage;
        }
        return random.nextDouble() > percentage;
    }

    @Override
    public boolean launch() {
        float percentage = (float) (0.5 * this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight()));

        if (percentage > maxCrashLaunchPer) {
            maxCrashLaunchPer = percentage;
        }
        if (percentage < minCrashLaunchPer) {
            minCrashLaunchPer = percentage;
        }
        return random.nextDouble() > percentage;
    }
}
