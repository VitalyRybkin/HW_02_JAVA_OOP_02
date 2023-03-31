public class Glue extends Cement implements Humidity{

    public Glue(String name, int price, String color) {
        super(name, price, color);
    }

    @Override
    public double maxGrip() {
        return 1.0;
    }

    @Override
    public double maxHardeness() {
        return 4.0;
    }

    @Override
    public double maxFraction() {
        return 0.63;
    }

    @Override
    public int frostCycles() {
        return 100;
    }

    @Override
    public String humidity() {
        return "для сухихи и влажных помещений";
    }
}
