import java.util.Random;

public class U2 extends Rocket {

    private final Random random = new Random();

    // Constructeur de U2
    public U2() {
        super(120,18000,29000);
    }

    @Override
    public boolean land() {
        float percentage = (float) (0.8 * (this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight())));

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
        float percentage = (float) (0.4 * (this.getCargoWeight()/(this.getMaxWeight() - this.getRocketWeight())));

        if (percentage > maxCrashLaunchPer) {
            maxCrashLaunchPer = percentage;
        }
        if (percentage < minCrashLaunchPer) {
            minCrashLaunchPer = percentage;
        }
        return random.nextDouble() > percentage;
    }
}