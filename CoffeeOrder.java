
package coffeeorder;

public class CoffeeOrder {

    public static void main(String[] args) {
        order sara = new order(1, "sara", "coffee Day", "small", 10);
        sara.print();
        sara.applyDiscount();

        order Fahad = new order(2, "fahad", "Latte", "Small", 30);
        Fahad.print();
        Fahad.changeSize("Large");
        Fahad.print();
        Fahad.applyDiscount();
        Fahad.print();

    }

}
