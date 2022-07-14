package Tryme;

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

}