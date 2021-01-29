package Factory.AbstractFactory.Chair;


public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("A plastic chair is created!");
    }
}
