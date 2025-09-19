// Base class Order
class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order placed";
    }
}

// Subclass ShippedOrder extends Order
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }
}

// Subclass DeliveredOrder extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Main class to test
public class SampleProblem1 {
    public static void main(String[] args) {
        Order order = new Order("O123", "2025-09-18");
        ShippedOrder shipped = new ShippedOrder("O123", "2025-09-18", "TRK987654");
        DeliveredOrder delivered = new DeliveredOrder("O123", "2025-09-18", "TRK987654", "2025-09-20");

        System.out.println(order.getOrderStatus());
        System.out.println(shipped.getOrderStatus());
        System.out.println(delivered.getOrderStatus());
    }
}