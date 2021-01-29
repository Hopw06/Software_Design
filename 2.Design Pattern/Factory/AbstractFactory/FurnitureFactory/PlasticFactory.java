package Factory.AbstractFactory.FurnitureFactory;

import Factory.AbstractFactory.Chair.Chair;
import Factory.AbstractFactory.Chair.PlasticChair;
import Factory.AbstractFactory.Table.PlasticTable;
import Factory.AbstractFactory.Table.Table;


public class PlasticFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
