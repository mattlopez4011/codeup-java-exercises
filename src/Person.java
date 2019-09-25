public class Person {
    //private name property that is a string
//    instance
    private String name; // Property

    //=====Constructor
    public Person(String name){
        setName(name); // Does the same as this.name = name;
//        this.name = name;
    }

//========= Methods
    // returns the person's name
        public String getName(){

            return this.name;
        }
        // changes the name property to the passed value
        public void setName(String name){

            this.name = name;
        }

        // prints a message to the console using the person's name
        public void sayHello(){

            System.out.println("Hi!" + this.getName());
        }

//



    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

        Person fer = new Person("fer"); // Instance or object
        fer.setName("Fernando"); // Change the object property

    }
}
