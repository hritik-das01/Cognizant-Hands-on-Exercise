package HandsOn_Exercises.DSA;
import java.util.*;

public class Ex_InventoryManagament {
    
    static List<String> inventory = new ArrayList<>();

    public static void addItem(String item) {
        inventory.add(item);
        System.out.println("Item added: " + item);
    }

    public static void removeItem(String item) {
        if (inventory.remove(item)) {
            System.out.println("Item removed: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }

    public static void searchItem(String item) {
        if (inventory.contains(item)) {
            System.out.println("Item found: " + item);
        } else {
            System.out.println("Item not found: " + item);
        }
    }

    public static void displayInventory() {
        System.out.println("Current Inventory:");
        for (String item : inventory) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        addItem("Laptop");
        addItem("Mouse");
        addItem("Keyboard");
        displayInventory();
        searchItem("Mouse");
        removeItem("Mouse");
        displayInventory();
    }
}