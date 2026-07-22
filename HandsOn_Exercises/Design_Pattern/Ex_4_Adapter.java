package HandsOn_Exercises.Design_Pattern;

public class Ex_4_Adapter {

    public static void main(String[] args) {

        Ex_4_PaymentProcessor paypal =
                new PayPalAdapter(new Ex_4_PayPalGateway());

        Ex_4_PaymentProcessor stripe =
                new Ex_4_StripeAdapter(new Ex_4_StripeGateway());

        paypal.processPayment(5000);

        stripe.processPayment(7500);
    }
}