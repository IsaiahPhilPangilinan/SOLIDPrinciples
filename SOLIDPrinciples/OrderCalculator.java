package SOLIDPrinciples;

public class OrderCalculator implements OrderTotal {

    @Override
    public void calculateTotal(double price, int quantity) {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

}