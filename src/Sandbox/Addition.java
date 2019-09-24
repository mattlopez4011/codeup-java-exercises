package Sandbox;

public class Addition {
    int firstNumber;
    int secondNumber;
    public int getNumber(){
        return (firstNumber + secondNumber);
    }
//=====Default Constructor
    Addition(){
        firstNumber = 10;
        secondNumber = 20;
    }
//======Second Constructor
    Addition(int L, int B){
        firstNumber = L;
        secondNumber = B;
    }

}
