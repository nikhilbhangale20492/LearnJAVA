package assignments;

public class NumberAssignment {

    public static void main(String[] args) {
        System.out.println("largestNumber(20,28) = " + largestNumber(20,28));
        System.out.println("smallestNumber(86, 45) = " + smallestNumber(86, 45));
        System.out.println("add3Numbers(20, 40, 50) = " + add3Numbers(20, 40, 50));
        System.out.println("subtract2Numbers(100, 20) = " + subtract2Numbers(100, 40));
        System.out.println("naturalNumbers(10) = " + naturalNumbers(10));
        System.out.println("naturalNumbers(7) = " + naturalNumbers(7));




    }

    /**
     * Write a function to return the largest number out of given 2 numbers
     */
    public static int largestNumber(int num1, int num2) {
        if (num1 >= num2){
            return num1;
        } else {
            return num2;
        }
    }


    /**
     * Write a function to return the smallest number out of given 2 numbers
     */
    public static int smallestNumber(int num1, int num2) {
      if (num1 <= num2) {
          return num1;
      } else {
          return num2;
      }
    }
    /**
     * Write a function to add 3 given numbers and return the result
     */
    public static int add3Numbers(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;
    }
    /**
     * Write a function to subract 2 given numbers and return the result
     */
    public static int subtract2Numbers(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }


    /**
     * Write a function to calculate sum of first n natural numbers
     * Eg: 10
     * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
     *
     * Eg: 7
     * 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28
     */
    public static int naturalNumbers(int num1) {
        int n = num1;
        int result = 0;
        for (int i=0; i<=n; i++) {
            result = result + i;
        }
        return result;
    }
    /**
     * Write a function to print all the even single digit numbers out of given number
     * Eg: 87624
     * 8
     * 6
     * 2
     * 4
     */
//    public static int evenSingleDigitNo(int num) {
//
//    }


    /**
     * Write a function to sum all the numbers in a given number and return result
     * Eg: 87053
     * 8 + 7 + 0 + 5 + 3 = 23
     */
//    public static int sumOfAllNumbers(int num) {
//
//    }


    /**
     * Write a function to sum all the numbers in a given number until the sum is a single digit and return result
     * Eg: 895678
     * 8+9+5+6+7+8 = 43
     * 4+3 = 7
     */


    /**
     * Write a function to find the largest single digit out of given number and return result
     * Eg: 97665
     * 9 is the largest single digit number
     */


    /**
     * Write a function that takes 5 integers as parameters and add only the even numbers and return result
     * Eg: 87,46,97,16,82
     * 46+16+82 = 144
     */


    /**
     * Write a function to reverse any given number and return the result
     */


    /**
     * Write a function to calculate the factorial of given number
     * Eg: 7
     * 7*6*5*4*3*2*1 = 5040
     *
     * Eg: 5
     * 5*4*3*2*1 = 120
     */


    /**
     * Write a function to count number of 0's and 1's in a given binary number. (Consider binary number as String)
     * Binary number will always contain 0's and 1's
     * Eg: "0010010110", "101001101"
     *
     * 0010010110
     * Count 0 = 6
     * Count 1 = 4
     */




}
