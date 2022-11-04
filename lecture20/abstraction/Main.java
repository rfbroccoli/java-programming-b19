import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal();  
        Dog dog = new Dog();
        Pig pig = new Pig();


        dog.makeASound();
        pig.makeASound();

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        animalList.add(pig);
        animalList.add(dog);

        System.out.println(animalList.toString());

        // myAnimal.makeASound();
        dog.makeASound();
        dog.sleep();

        pig.makeASound();
        pig.sleep();

        
     
    }
}