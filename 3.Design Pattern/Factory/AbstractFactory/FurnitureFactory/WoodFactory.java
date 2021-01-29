package Factory.AbstractFactory.FurnitureFactory;

import Factory.AbstractFactory.Chair.Chair;
import Factory.AbstractFactory.Chair.WoodChair;
import Factory.AbstractFactory.Table.Table;
import Factory.AbstractFactory.Table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
