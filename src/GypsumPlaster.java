public class GypsumPlaster extends Gypsum{

    public GypsumPlaster(String name, int price) {
        super(name, price);
    }

    @Override
    public String application() {
        return "механизированное нанесение";
    }

    @Override
    public double maxHardeness() {
        return 2.5;
    }

    @Override
    public double maxFraction() {
        return 0.315;
    }

    @Override
    public int maxLayer() {
        return 60;
    }

    @Override
    public String alignment() {
        return "первоначальное";
    }
}
