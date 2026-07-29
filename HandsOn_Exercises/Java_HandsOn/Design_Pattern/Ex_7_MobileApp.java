package HandsOn_Exercises.Design_Pattern;

class MobileApp implements Ex_7_Observer {

    @Override
    public void update(double price) {
        System.out.println("Mobile App: Stock Price Updated = " + price);
    }
}