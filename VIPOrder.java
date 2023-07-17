import java.util.List;

public class VIPOrder extends Order {

    public VIPOrder(int id, String name, String deliveryAddress, List<OrderItem> items, Customer customer,
                    PaymentType paymentType, String orderDate) {
        super(id,  name, deliveryAddress, items, customer, paymentType, orderDate);
        if (customer.getCustomerType() != CustomerType.VIP) {
            throw new IllegalArgumentException("VIP Order can only be placed by VIP customers.");
        }
    }
}
