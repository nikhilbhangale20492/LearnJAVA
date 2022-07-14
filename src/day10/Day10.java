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


    /**
     * 7
     * 7 X 6 X 5 X 4 X 3 X 2 X 1
     * <p>
     * result X i = result
     * 1    X 7 = 7     //first
     * 7    X 6 = 42    //second
     * 42   X 5 = 210   //third
     * 210  X 4 = 840
     * 840  X 3 = 2520
     * 2520 X 2 = 5040
     * 5040 X 1 = 5040
     */

    /**
     * 5
     * result X  i =     result
     * 1    X   5 =     5
     * 5    X   4 =     20
     * 20   X   3 =     60
     * 60   X   2 =     120
     * 120  X   1 =     120
     *
     */


    /**
     * num = 5
     * result X i   = result
     * 1    X   1   =   1
     * 1    X   2   =   2
     * 2    X   3   =   6
     * 6    X   4   =   24
     * 24   X   5   =   120
     */

    public int test5(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }


    int findFactorial(int num) {
        int result = 1;
        for (int i = num; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }


}
