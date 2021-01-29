package Builder.Order;

public class Client {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderBread(BreadType.SIMPLE)
                .orderSauce(SauceType.OLIVE_OIL)
                .orderVegetable(VegetableType.SALAD)
                .orderType(OrderType.TAKE_AWAY)
                .build();

        System.out.println(order);
    }
}
