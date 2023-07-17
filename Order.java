import java.util.List;

public abstract class Order {


    private int id;
    private String name;
    private String deliveryAddress;
    private List<OrderItem> items;
    private Customer customer;
    private double totalPrice;
    private PaymentType paymentType;
    private String orderDate;

    public Order(int id, String name, String deliveryAddress, List<OrderItem> items, Customer customer,
                 PaymentType paymentType, String orderDate) {

        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.items = items;
        this.customer = customer;
        this.paymentType = paymentType;
        this.orderDate = orderDate;
        calculateTotalPrice();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public String getOrderDate() {
        return orderDate;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void calculateTotalPrice() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.getItemPrice();
        }
        if (customer.getCustomerType() == CustomerType.VIP && customer.getCustomerDiscount() != null) {
            sum *= (1 - customer.getCustomerDiscount());
        }
        totalPrice = sum;
    }

}
