public class CementPutty extends Cement implements Humidity, Layer{

    public CementPutty(String name, int price, String color) {
        super(name, price, color);
    }

    @Override
    public double maxGrip() {
        return 1.0;
    }

    @Override
    public double maxHardeness() {
        return 0.5;
    }

    @Override
    public double maxFraction() {
        return 0.63;
    }

    @Override
    public int frostCycles() {
        return 50;
    }

    @Override
    public String humidity() {
        return "для влажных помещений";
    }

    @Override
    public int maxLayer() {
        return 10;
    }
}
