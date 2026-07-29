package HandsOn_Exercises.Design_Pattern;

class WebApp implements Ex_7_Observer {

    @Override
    public void update(double price) {
        System.out.println("Web App: Stock Price Updated = " + price);
    }
}