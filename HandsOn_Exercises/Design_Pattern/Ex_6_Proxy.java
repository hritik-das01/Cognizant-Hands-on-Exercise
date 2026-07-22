package HandsOn_Exercises.Design_Pattern;

public class Ex_6_Proxy {

    public static void main(String[] args) {

        Image image = new Ex_6_ProxyImage("nature.jpg");

        System.out.println("First Display:");
        image.display();

        System.out.println();

        System.out.println("Second Display:");
        image.display();
    }
}