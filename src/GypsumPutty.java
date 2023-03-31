public class GypsumPutty extends Gypsum implements Alignment{

    public GypsumPutty(String name, int price) {
        super(name, price);
    }

    @Override
    public String application() {
        return "ручное нанесение";
    }
    @Override
    public double maxHardeness() {
        return 1.0;
    }

    @Override
    public double maxFraction() {
        return 0.315;
    }

    @Override
    public int maxLayer() {
        return 15;
    }

    @Override
    public String alignment() {
        return "улучшенное";
    }
}
