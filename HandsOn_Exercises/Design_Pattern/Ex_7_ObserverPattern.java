package HandsOn_Exercises.Design_Pattern;

public class Ex_7_ObserverPattern {

    public static void main(String[] args) {

        Ex_7_StockMarket stockMarket = new Ex_7_StockMarket();

        Ex_7_Observer mobile = new MobileApp();
        Ex_7_Observer web = new WebApp();

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        System.out.println("Stock Price Changed to 500");

        stockMarket.setStockPrice(500);

        System.out.println();

        System.out.println("Stock Price Changed to 750");

        stockMarket.setStockPrice(750);
    }
}
