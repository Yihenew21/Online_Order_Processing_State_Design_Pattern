package StatePattern;

public class StatePatternDemo {

        public static void main(String[] args) {

            Order order = new Order();

            order.payOrder();
            order.shipOrder();
            order.deliverOrder();
            order.cancelOrder(); // Invalid operation
        }

}
