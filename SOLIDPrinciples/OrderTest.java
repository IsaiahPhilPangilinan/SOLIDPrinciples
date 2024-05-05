package SOLIDPrinciples;

public class OrderTest {

    public static void main(String[] args) {
        OrderTotal orderTotal = new OrderCalculator();
        Order order = new OrderPlacer();
        orderTotal.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        OrderInvoice orderInvoice = new InvoiceGenerator();
        OrderNotification orderNotification = new EmailNotifier();

        orderInvoice.generateInvoice("order_123.pdf");
        orderNotification.sendEmailNotification("johndoe@example.com");
    }

}