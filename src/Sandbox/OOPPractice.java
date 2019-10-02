package Sandbox;

public class OOPPractice {
    //static property
    private final static double pi = 3.14159;

    private String firstName;
    private String lastName;
    private String nickName;
    private String favColor;
    private int age;

//    Constructor
    public OOPPractice(String fn, String ln, String nn, String fc, int age) {
        this.firstName = fn;
        this.lastName = ln;
        this.nickName = nn;
        this.favColor = fc;
        this.age = age;
    }

//    Methods

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String fn){
        this.firstName = fn;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAll(){
        System.out.println("-----------------------");
        return this.firstName+" "+this.lastName+" "+this.nickName+" "+this.favColor+" "+this.age;
    }
}
