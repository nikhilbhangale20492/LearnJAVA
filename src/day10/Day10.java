package day10;

public class Day10 {


    //Create object

    //class should be written in SentenceCase (S caps, C caps)
    //variables should be in camelCase (camel lowercase, Case -> C -> caps) -> (starts with lowercase)
    //functions should be in camelCase (Starts with lowercase)

    //nikhil -> variable -> () nahi hai
    //nikhil() -> function -> () hai

    //Body -> class -> CamelCase

    //tryThisOut() -> function -> () aur camelCase

    //seeMe -> variable -> camelCase -> () nahi hai

    //SeeMe -> class -> SentenceCase
    //Day7 -> class -> SentenceCase

    //class Day7
    public static void main(String[] args) {
        /**
         * Create object to call methods from other class
         */
        //class variableName = new class();
        NumberUtils numberUtils = new NumberUtils(); //creating a object here -> numberUtils is object
        numberUtils.printHelloFromNumberUtils();
//        System.out.println("result = " + numberUtils.add2Numbers(10, 20));
//        System.out.println("result = " + numberUtils.add2Numbers(103, 210));
        System.out.println("Multiplication result = " + numberUtils.multiply2Numbers(103, 210));
//        System.out.println("numberUtils.varaible1 = " + numberUtils.varaible1);
//        numberUtils.varaible1 = 50;
//        System.out.println("numberUtils.varaible1 = " + numberUtils.varaible1);

        numberUtils.varaible1 = 50;
        numberUtils.varaible2 = 70;
        System.out.println("numberUtils.addAllVariables() = " + numberUtils.addAllVariables());



        NumberUtils numberUtils1 = new NumberUtils();
//        System.out.println("number utils 1 " + numberUtils1.multiply2Numbers(10,20));
//        System.out.println("numberUtils1.varaible1 = " + numberUtils1.varaible1);
        System.out.println("numberUtils1.addAllVariables() = " + numberUtils1.addAllVariables());
        numberUtils1.varaible1 = 80;
        System.out.println("numberUtils1.addAllVariables() = " + numberUtils1.addAllVariables());
        
        //Class variables

        //How to use one class into another

        //Constructor
        //default constructor
        //parameterized constructor

        //Access specifiers - private, public


    }


    /**
     * 1. Create a package named tryme
     * 2. Create a Class named MainClass and write psvm
     * 3. Create a class named UtilsClass
     * 4. Add few number functions in UtilsClass
     *      a. Add 2 numbers and return the result
     *      b. Find the largest number from given 2 numbers and return the result
     *      c. Create a class variable named number and assign to 7
     *      d. Find the factorial of a class variable number
     * 5. Create an object of UtilsClass in MainClass
     * 6. Call function to add 2 numbers and print
     * 7. Call function to find the largest number and print
     * 8. Call function to find the factorial
     * 9. Update the number to 5
     * 10. Call function to find the factorial
     */






}
