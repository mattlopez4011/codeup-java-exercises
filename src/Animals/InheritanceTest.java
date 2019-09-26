package Animals;

public class InheritanceTest {
    public static void main(String[] args) {
        Animal panda = new Animal(10, "Giant panda", true);
        Dog wienerDog  = new Dog("Dachshund", "Shadow", 5, "Dog", true);


        System.out.printf("This %s is %s years old. %n", panda.getSpecies(), panda.getAge());
        System.out.printf("My %s %s is a %s. He is %s years old.%n", wienerDog.getSpecies(), wienerDog.getName(), wienerDog.getBreed(), wienerDog.getAge());




    }
}
