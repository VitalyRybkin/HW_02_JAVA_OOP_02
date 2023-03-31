public class PolymerPlaster extends Polymer{

    public PolymerPlaster(String name, int price) {
        super(name, price);
    }

    @Override
    public double maxHardeness() {
        return 0.1;
    }

    @Override
    public double maxFraction() {
        return 0.315;
    }

    @Override
    public String humidity() {
        return "для сухихи помещений";
    }
}
