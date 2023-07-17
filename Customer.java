import java.util.List;

public class Customer implements Gift {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Double customerDiscount;
    private List<OrderItem> favoriteItems;
    private Gift customerGift;

    public Customer(int id, String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, Double customerDiscount, List<OrderItem> favoriteItems, Gift customerGift) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        this.favoriteItems = favoriteItems;
        this.customerGift = customerGift;
    }

    public Customer(int i, String john, String doe, String s, String s1, CustomerType vip, double v) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(Double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public List<OrderItem> getFavoriteItems() {
        return favoriteItems;
    }

    public void setFavoriteItems(List<OrderItem> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

    public Gift getCustomerGift() {
        return customerGift;
    }

    public void setCustomerGift(Gift customerGift) {
        this.customerGift = customerGift;
    }
    @Override
   public void openGift(){
       if (customerGift != null) {
           customerGift.openGift();
       }
   }
}
