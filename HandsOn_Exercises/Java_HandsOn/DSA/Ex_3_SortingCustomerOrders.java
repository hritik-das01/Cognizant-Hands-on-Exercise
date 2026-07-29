package HandsOn_Exercises.DSA;

class Order {
    int orderId;
    String customerName;
    double totalPrice;

    Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
}

public class Ex_3_SortingCustomerOrders{

    static void bubbleSort(Order[] orders) {

        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    static void print(Order[] orders) {

        for (Order o : orders) {
            System.out.println(o.orderId + " " + o.customerName + " " + o.totalPrice);
        }
    }
    public static void main(String[] args){

        Order[] orders = {
                new Order(101, "Rahul", 2500),
                new Order(102, "Priya", 1500),
                new Order(103, "Amit", 5000),
                new Order(104, "Sneha", 3200)
        };

        bubbleSort(orders);

        print(orders);
    }

    }