package HandsOn_Exercises.Design_Pattern;

import java.util.ArrayList;

class Ex_7_StockMarket implements Stock {

    private ArrayList<Ex_7_Observer> observers = new ArrayList<>();
    private double stockPrice;

    @Override
    public void registerObserver(Ex_7_Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Ex_7_Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

        for (Ex_7_Observer o : observers) {
            o.update(stockPrice);
        }
    }

    public void setStockPrice(double price) {
        this.stockPrice = price;
        notifyObservers();
    }
}