public abstract class Gypsum extends DryMixture implements Layer, Alignment {

    public Gypsum(String name, int price) {
        super(name, price);
    }

    public abstract String application();

    @Override
    public String toString() {
        return super.toString() + "\nНанесение: " + this.application();
    }
}
