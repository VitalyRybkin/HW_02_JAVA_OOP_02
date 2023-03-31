public class PolymerPutty extends Polymer implements Alignment{

    public PolymerPutty(String name, int price) {
        super(name, price);
    }

    @Override
    public double maxHardeness() {
        return 0.5;
    }

    @Override
    public double maxFraction() {
        return 0.315;
    }

    @Override
    public String humidity() {
        return "для сухих помещений";
    }

    @Override
    public String alignment() {
        return "финишное";
    }
}
