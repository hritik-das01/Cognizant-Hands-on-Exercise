package javaCoreAssesment;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_24 {
	public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students to add: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            students.add(scanner.nextLine());
        }

        System.out.println("\nStudent List:");
        for (String name : students) {
            System.out.println("- " + name);
        }
    }
}
