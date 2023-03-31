public abstract class DryMixture {
    private final String name;
    private final int price;


    public DryMixture(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract double maxHardeness();
    public abstract double maxFraction();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n").append(name).append("\n")
                .append("Цена - " + this.price + " р.\n")
                .append("Характеристики: \n")
                .append("Макс. прочность: " + this.maxHardeness() + " МПа\n")
                .append("Макс. фракция: " + this.maxFraction() + " мм");
        return stringBuilder.toString();
    }
}
