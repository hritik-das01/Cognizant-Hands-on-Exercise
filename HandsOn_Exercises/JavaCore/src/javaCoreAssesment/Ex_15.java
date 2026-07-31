package javaCoreAssesment;

import java.util.Scanner;

public class Ex_15 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed string: " + reversed);
    }
}
