package Factory.AbstractFactory.Table;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("A plastic table is created!");
    }
}
