public abstract class Cement extends DryMixture implements FrostResistance{

    private final String color;
    public Cement(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public abstract double maxGrip();

    @Override
    public String toString() {
        return super.toString() + "\nЦвет: " + color + "\nПрочность сцепления: "+ this.maxGrip() + " МПа";
    }
}
