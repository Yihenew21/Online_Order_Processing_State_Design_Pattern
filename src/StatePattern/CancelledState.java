package StatePattern;

public class CancelledState implements OrderState {

    @Override
    public void payOrder(Order order) {
        System.out.println("Cancelled order cannot be paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cancelled order cannot be shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cancelled order cannot be delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }
}
