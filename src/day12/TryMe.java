package day12;

public class TryMe {

    public int myNumber; //90

    //constructor -> no return type
    //syntax
    //ClassName(){}

//    public TryMe() {
//        System.out.println("Creating an object of tryme");
//        myNumber = 7;
//    }


    public TryMe(int number) {
        System.out.println("Creating an object with number " + number);
        myNumber = number;
    }


    public void printHello() {
        System.out.println("Print hello");
    }

    public void printMyNumber() {
        System.out.println("myNumber = " + myNumber);
    }

    //function without parameter

    //syntax
    //returnType functionName (arguments/parameters)
    public void function1() {

    }

    //function with parameter
    public void function2(int number1, int number2) {

    }

}
