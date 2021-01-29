package Factory.AbstractFactory.Table;

public class WoodTable implements Table{
    @Override
    public void create() {
        System.out.println("A wood table is created!");
    }
}
