package HandsOn_Exercises.Design_Pattern;

class PayPalAdapter implements Ex_4_PaymentProcessor {

    private Ex_4_PayPalGateway paypal;

    public PayPalAdapter(Ex_4_PayPalGateway paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.makePayment(amount);
    }
}