package javaCoreAssesment;

import java.util.List;

record Person(String name, int age) {}

public class Ex_29 {
	public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 22),
            new Person("Bob", 17),
            new Person("Charlie", 25)
        );

        System.out.println("Adults (Age >= 18):");
        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}
