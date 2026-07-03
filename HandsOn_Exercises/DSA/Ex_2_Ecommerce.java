package HandsOn_Exercises.DSA;

import java.util.*;

class Product {
    int id;
    String name;
    String category;
    double price;

    Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

public class Ex_2_Ecommerce {

    static List<Product> products = new ArrayList<>();

    // Search by Name
    static void searchByName(String keyword) {
        keyword = keyword.toLowerCase();

        for (Product p : products) {
            if (p.name.toLowerCase().contains(keyword)) {
                System.out.println(p.id + " " + p.name + " " + p.category + " " + p.price);
            }
        }
    }

    static void searchByCategory(String category) {
        category = category.toLowerCase();

        for (Product p : products) {
            if (p.category.toLowerCase().equals(category)) {
                System.out.println(p.id + " " + p.name + " " + p.category + " " + p.price);
            }
        }
    }

    static void searchByPrice(double minPrice, double maxPrice) {

        for (Product p : products) {
            if (p.price >= minPrice && p.price <= maxPrice) {
                System.out.println(p.id + " " + p.name + " " + p.category + " " + p.price);
            }
        }
    }

    public static void main(String[] args) {

        products.add(new Product(1, "Laptop", "Electronics", 70000));
        products.add(new Product(2, "Mouse", "Electronics", 500));
        products.add(new Product(3, "Keyboard", "Electronics", 1500));
        products.add(new Product(4, "Shirt", "Clothing", 1200));
        products.add(new Product(5, "Jeans", "Clothing", 2500));

        System.out.println("Search by Name:");
        searchByName("lap");

        System.out.println("\nSearch by Category:");
        searchByCategory("Electronics");

        System.out.println("\nSearch by Price:");
        searchByPrice(1000, 3000);
    }
}