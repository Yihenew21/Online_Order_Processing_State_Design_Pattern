package StatePattern;

public class ShippedState implements OrderState {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order is already paid and shipped.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order has already been shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order delivered.");
        order.setState(new DeliveredState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Shipped order cannot be cancelled.");
    }
}