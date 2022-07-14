package Tryme;

public class MainClass {

    public static void main(String[] args) {

        /*
        5. Create an object of UtilsClass in MainClass
         */
        UtilsClass utilsClass = new UtilsClass();

        System.out.println("Add 2 Numbers = " + utilsClass.add2Number(65, 35));

        System.out.println("largest Number = " + utilsClass.findLargestNumber(69, 82));

      //  System.out.println("Factorial of 7 is = " + utilsClass.findFactorial(7));

        System.out.println("Factorial is " + utilsClass.factorial());

        utilsClass.number = 5;


        System.out.println("Factorial is " + utilsClass.factorial());


        UtilsClass adbc = new UtilsClass();


    }



}

/**
 * 1. Create a package named tryme
 * 2. Create a Class named MainClass and write psvm
 * 3. Create a class named UtilsClass
 * 4. Add few number functions in UtilsClass
 *      a. Add 2 numbers and return the result
 *      b. Find the largest number from given 2 numbers and return the result
 *      c. Create a class variable named number and assign to 7
 *      d. Find the factorial of a class variable named number
 * 5. Create an object of UtilsClass in MainClass
 * 6. Call function to add 2 numbers and print
 * 7. Call function to find the largest number and print
 * 8. Call function to find the factorial
 * 9. Update the number to 5
 * 10. Call function to find the factorial
 */

/**
 * Write a program to return sum of all even numbers from 1-100
 * Eg: 2 + 4 + 6 + 8...... + 100
 */

