package StatePattern;

public class PendingState implements OrderState {

    @Override
    public void payOrder(Order order) {
        System.out.println("Payment successful. Order is now Paid.");
        order.setState(new PaidState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order cannot be shipped before payment.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered before shipping.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled.");
        order.setState(new CancelledState());
    }
}