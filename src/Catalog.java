import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private final List<DryMixture> catalog = new ArrayList<>();

    public void AddItem(DryMixture mix){
        catalog.add(mix);
    }

    public void PrintCatalog(){
        for (DryMixture item : this.catalog) {
            System.out.println(item);
            if (item instanceof FrostResistance){
                System.out.println("Морозостойкость: " + ((FrostResistance) item).frostCycles() + " циклов");
            }
            if (item instanceof Layer){
                System.out.println("Макс. слой: " + ((Layer) item).maxLayer() + " мм");
            }
            if (item instanceof Humidity){
                System.out.println("Влагостойкость: " + ((Humidity) item).humidity());
            }
            if (item instanceof Alignment){
                System.out.println("Выравнивание: " + ((Alignment) item).alignment());
            }
        }
    }
}
