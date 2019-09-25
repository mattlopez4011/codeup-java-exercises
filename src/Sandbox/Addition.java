package Sandbox;

public class Addition {
    int firstNumber;
    int secondNumber;
    public int getNumber(){
        return (firstNumber + secondNumber);
    }
//=====Default Constructor
    public Addition(){
        firstNumber = 10;
        secondNumber = 20;
    }
//======Second Constructor
    public Addition(int L, int B){
        firstNumber = L;
        secondNumber = B;
    }

}
