package tryme;

public class UtilsClass {
    /*
     * a. Add 2 numbers and return the result
     */
    public int add2Number(int number1, int number2) {
        return number1 + number2;
    }

    /*
     b. Find the largest number from given 2 numbers and return the result
     */
    public int findLargestNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    /*
    c. Create a class variable named number and assign to 7
     */
    public int number = 7;

    /*
    d. Find the factorial of a class variable number (factorial of 7 = 7x6x5x4x3x2x1)
     result * i = result
     1 * 1 = 1
     1 * 2 = 2


     */
    public int findFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public int factorial() {
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
/**
 * Write a program to return sum of all even numbers from 1-100
 * Eg: 2 + 4 + 6 + 8...... + 100
 */
/*
i   % 2 = 0 ---> even --->add--->result
1   % 2 = 1 odd
2   % 2 = 0 even 2
3   % 2 = 1 odd
4   % 2 = 0 even 2+4
5   % 2 = 1 odd
6   % 2 = 0 even 2+4+6
7   % 2 = 1 odd
8   % 2 = 0 even
9   % 2 = 1 odd
10  % 2 = 0 even
 */

//public int sumOfEvenNo() {
    //for (int i = 1; i <= 100; i++) {
        //int result = i;
        //if (i % 2 == 0) {

       // }
        //return result;
    //}

//}

}