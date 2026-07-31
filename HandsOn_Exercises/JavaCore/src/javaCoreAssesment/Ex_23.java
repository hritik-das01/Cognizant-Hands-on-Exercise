package javaCoreAssesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex_23 {

	public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
