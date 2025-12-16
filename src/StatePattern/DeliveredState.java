package StatePattern;

public class DeliveredState implements OrderState {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order already delivered. No further actions allowed.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Delivered order cannot be cancelled.");
    }
}