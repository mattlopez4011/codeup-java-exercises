import java.util.Arrays;

public class ArraysExercises {
    static Person[] people = new Person[3];

//    Add person to array
    public static Person[] addPerson(Person[] people, Person person){
        Person[] newPersonArray = Arrays.copyOf(people, people.length+1);

        newPersonArray[people.length ] = person;
        System.out.println(newPersonArray);
            return newPersonArray;

    }


    public static void main(String[] args) {
    Person text = new Person("yoo, testing...");
         System.out.println(text.getClass());
         System.out.println("text.getName() = " + text.getName());

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//        Create an array that holds 3 Person objects.
//        Assign a new instance of the Person class to each element.
//        Iterate through the array and print out the name of each person in the array.

            people[0] = new Person("Lemon");
            people[1] = new Person("Ryan");
            people[2] = new Person("Michael");

//        Person[] newPeople = addPerson(people, new Person("Mark"));
        Person[] newPeople = addPerson(people, new Person("Izzy")); // Add new person
        Person[] newPeople2 = addPerson(newPeople, new Person("Kevin")); // Add new person to newPeople array :)


        for (Person onePerson : newPeople ){
            System.out.print(onePerson.getName()+ " ");
//            System.out.println(onePerson);
        }
        System.out.println("Array length = "+people.length);

        for(Person person : newPeople2){
            System.out.print(person.getName()+ " ");
        }


    }
}
