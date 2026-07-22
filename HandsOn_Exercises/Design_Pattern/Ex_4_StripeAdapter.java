package HandsOn_Exercises.Design_Pattern;

class Ex_4_StripeAdapter implements Ex_4_PaymentProcessor {

    private Ex_4_StripeGateway stripe;

    public Ex_4_StripeAdapter(Ex_4_StripeGateway stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.pay(amount);
    }
}