package StatePattern;

public class PaidState implements OrderState {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order shipped.");
        order.setState(new ShippedState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order must be shipped before delivery.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Paid order cannot be cancelled.");
    }
}