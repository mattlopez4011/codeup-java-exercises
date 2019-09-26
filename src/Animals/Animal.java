package Animals;

public class Animal {
    private int age;
    private String species;
    private Boolean isAlive;

//    Constructor =================
    public Animal(int age, String species, Boolean isAlive){
        this.age = age;
        this.species = species;
        this.isAlive = isAlive;
    }


//    Methods =====================
    public int getAge() { // Get Age
        return age;
    }

    public void setAge(int age) { // Set Age
        this.age = age;
    }

    public String getSpecies() {  // Get Species
        return species;
    }

    public void setSpecies(String species) {  // Set Species
        this.species = species;
    }

    public Boolean getAlive() {  //Get Alive
        return isAlive;
    }

    public void setAlive(Boolean alive) {  // Set Alive
        this.isAlive = alive;
    }
}
