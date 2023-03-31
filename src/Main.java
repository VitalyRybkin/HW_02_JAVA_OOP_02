public class Main {
    public static void main(String[] args) {
        Catalog dry_mix_catalog = new Catalog();
        dry_mix_catalog.AddItem(new CementPlaster("Штукатурка Базовая", 129, "серый"));
        dry_mix_catalog.AddItem(new CementPlaster("Штукатурка Стартовая", 139, "серый"));
        dry_mix_catalog.AddItem(new CementPlaster("Штукатурка Улучшенная", 169, "белый"));
        dry_mix_catalog.AddItem(new CementPutty("Шпаклевка Финишная", 179, "белый"));
        dry_mix_catalog.AddItem(new CementPutty("Шпаклевка Базовая", 165, "серый"));
        dry_mix_catalog.AddItem(new GypsumPlaster("Штукатурка ГШ", 265));
        dry_mix_catalog.AddItem(new GypsumPlaster("Штукатурка Финиш", 295));
        dry_mix_catalog.AddItem(new Glue("Клей Базовый", 125, "серый"));
        dry_mix_catalog.AddItem(new Glue("Клей Усиленный", 145, "серый"));
        dry_mix_catalog.AddItem(new GypsumPutty("Шпаклевка Супер", 325));
        dry_mix_catalog.AddItem(new PolymerPlaster("Штукатурка Экстра", 325));
        dry_mix_catalog.AddItem(new PolymerPutty("Шпаклевка Экстра Лайт", 329));

        System.out.println("Каталог сухих строительных смесей:");
        dry_mix_catalog.PrintCatalog();
    }
}