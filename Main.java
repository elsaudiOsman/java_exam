import java.util.List;

public class Main {
    public static void main(String[] args) {

        OrderItem item1 = new OrderItem(1, "Item 1", 10.99);
        OrderItem item2 = new OrderItem(2, "Item 2", 15.99);
        OrderItem item3 = new OrderItem(3, "Item 3", 7.99);
        System.out.println(item1.getId());
        Customer customer = new Customer(1, "John", "Doe", "john.doe@example.com", "123 Main St", CustomerType.VIP, 0.1);

        RegularOrder regularOrder = new RegularOrder(4,"Regular Order", "456 Elm St", List.of(item1, item2), customer, PaymentType.CREDIT_CARD, "2023-07-17");

        VIPOrder vipOrder = new VIPOrder(5,"VIP Order", "789 Oak St", List.of(item2, item3), customer, PaymentType.CASH, "2023-07-18");

        System.out.println(regularOrder.getTotalPrice());

    }
}
