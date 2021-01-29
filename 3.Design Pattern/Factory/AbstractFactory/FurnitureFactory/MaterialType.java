package Factory.AbstractFactory.FurnitureFactory;

public enum MaterialType {

    PLASTIC {
        @Override
        public FurnitureAbstractFactory getFactory() {
            return new PlasticFactory();
        }
    },
    WOOD {
        @Override
        public FurnitureAbstractFactory getFactory() {
            return new WoodFactory();
        }
    };

    public abstract FurnitureAbstractFactory getFactory();
}
