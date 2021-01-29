package Factory.AbstractFactory.Chair;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("A wood chair is created");
    }
}
