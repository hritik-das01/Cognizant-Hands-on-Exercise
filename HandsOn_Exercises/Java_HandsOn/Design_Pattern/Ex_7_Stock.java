package HandsOn_Exercises.Design_Pattern;

interface Stock {

    void registerObserver(Ex_7_Observer o);

    void removeObserver(Ex_7_Observer o);

    void notifyObservers();
}