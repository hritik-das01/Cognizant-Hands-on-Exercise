package javaCoreAssesment;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Ex_18 {

	public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();

        genericAnimal.makeSound();
        dog.makeSound();
    }
}
