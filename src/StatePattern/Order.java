package StatePattern;

public class Order {

    private OrderState state;

    public Order() {
        this.state = new PendingState();
        System.out.println("Order created. Current state: Pending");
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void payOrder() {
        state.payOrder(this);
    }

    public void shipOrder() {
        state.shipOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }
}
