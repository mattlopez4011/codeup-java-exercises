package Animals;


public class Dog extends Animal {
    private String breed;
    private String name;

//    === Constructor
    public Dog(String breed, String name, int age, String species, Boolean isAlive ){
        super(age, species,isAlive);
        this.breed = breed;
        this.name = name;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }




}
