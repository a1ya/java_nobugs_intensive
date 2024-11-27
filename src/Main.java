import Homework2.Animal;
import Homework2.Dog;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Fluffy", 5);
        dog1.makeSound();
        dog1.fetch();

        Animal dog2 = new Dog("Skipper", 1);
        dog2.makeSound();

    }



}