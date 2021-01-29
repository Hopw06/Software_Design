package Factory.AbstractFactory.FurnitureFactory;

import Factory.AbstractFactory.Chair.Chair;
import Factory.AbstractFactory.Table.Table;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}
