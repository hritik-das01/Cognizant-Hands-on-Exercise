package javaCoreAssesment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex_27 {

	public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Alice");
        names.add("Bob");

        // Sort using lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted names: " + names);
    }
}
