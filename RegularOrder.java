import java.util.List;

public class RegularOrder extends Order {

    public RegularOrder(int id, String name, String deliveryAddress, List<OrderItem> items, Customer customer,
                        PaymentType paymentType, String orderDate) {
        super(id, name, deliveryAddress, items, customer, paymentType, orderDate);
    }
}




