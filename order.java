package coffeeorder;

import java.util.Objects;

public class order {

    int OrderId;
    String CustomerName;
    String Type;
    String Size;
    double Price;

    public order() {
    }

    public order(int OrderId, String CustomerName, String Type, String Size, double Price) {
        this.OrderId = OrderId;
        this.CustomerName = CustomerName;
        this.Type = Type;
        this.Size = Size;
        this.Price = Price;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void print() {
        System.out.println("OrderId; " + OrderId);
        System.out.println("coustomerName ; " + CustomerName);
        System.out.println("Size ; " + Size);
        System.out.println("Type ; " + Type);
        System.out.println("Price ; " + Price);
        System.out.println("-----------------");

    }

    public void applyDiscount() {
        Price = Price - (Price * 0.10);

    }

    public void changeSize(String newSize) {
        Size = newSize;

        if (newSize.equalsIgnoreCase("Small")) {
        } else if (newSize.equalsIgnoreCase("Medium")) {
            Price = Price + 5;
        } else if (newSize.equalsIgnoreCase("Large")) {
            Price = Price + 10;
        } else {
            System.out.println("Unknown size");
        }
    }

}
    
    

