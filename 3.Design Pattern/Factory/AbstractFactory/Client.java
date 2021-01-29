package Factory.AbstractFactory;

import Factory.AbstractFactory.Chair.Chair;
import Factory.AbstractFactory.FurnitureFactory.FurnitureAbstractFactory;
import Factory.AbstractFactory.FurnitureFactory.FurnitureFactory;
import Factory.AbstractFactory.FurnitureFactory.MaterialType;
import Factory.AbstractFactory.Table.Table;

public class Client {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);

        Chair chair = factory.createChair();
        chair.create();

        Table table = factory.createTable();
        table.create();
    }
}
