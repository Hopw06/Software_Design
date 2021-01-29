package Factory.AbstractFactory.FurnitureFactory;

public class FurnitureFactory {
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        return materialType.getFactory();
    }
}
