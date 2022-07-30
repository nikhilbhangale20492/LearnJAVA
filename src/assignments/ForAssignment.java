package assignments;

public class ForAssignment {

    static int array[] = {81, 72, 54, 88, 102, 23, 10, 77, 54, 78};

    public static void main(String[] args) {

        /**
         * Print all the numbers of the given array
         */
        System.out.println("array.length = " + array.length);
        for (int i=0; i<= array.length-1; i++) {
            System.out.println("array = " + array[i]);
        }

        /**
         * Print if the number is even or odd for all the numbers in the given array
         * reminder = array[0] % 2 = 1
         * if (reminder == 1 ) {
         *     array[0] is odd no
         * }else {
         * array[0] is even no
         *
         */
        int counter = 0;
        int counter1 = 0;
        int reminder;
        for (int i=0; i<= array.length-1; i++) {
            reminder = array[i] % 2;
            if (reminder == 1) {
                counter1++;
                System.out.println(array[i] + " is odd no");
            } else {
                counter++;
                System.out.println(array[i] + " is even no");
            }
        }
        /**
         * Count number of even numbers in the given array
         * array[i] =
         */
        System.out.println("even no count = " + counter);

        /**
         * Count number of odd numbers in the given array
         */

        System.out.println("odd no count = " + counter1);

        /**
         * Print all the numbers less than 75 in the given array
         */

        for (int i=0; i< array.length; i++) {
            if (array[i] < 75) {
                System.out.println(array[i] + " No is less than 75");
            }
        }

        /**
         * Print all the numbers that are even and less than 75 in the given array
         */

        /**
         * Print all the numbers that are greater than 75 and are odd
         */

        /**
         * Print "More even numbers than odd" if even numbers count is greater than odd
         * or else print "More Odd numbers than even" if odd numbers count is greater than even
         * if equal number of even and odd numbers then print "Equal number of odd and even numbers"
         *
         */

        /**
         * Print the sum of all the numbers in the array
         */


        /**
         * Print sum of all even numbers in the array
         */

        /**
         * Print sum of all odd numbers in the array
         */

        /**
         * Print sum of all numbers in even position in the array
         * like 0,2,4,6,8
         */


        /**
         * Print sum of all numbers in odd position in the array
         * like 1,3,5,7,9
         */

        /**
         * Print sum of first five numbers in the array
         */


        /**
         * Print sum of numbers from 3rd position to 6th position in the array
         */

        /**
         * Print the duplicate number from the array
         */

    }

}
