package Homework2;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }

    public void fetch() {
        System.out.println(name + " brings a stick.");
    }

}
