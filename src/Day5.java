public class Day5 { //Starts with capital
    public static void main(String[] args) {
        /**
         * Arrays
         */
        int rollNumber;

//        int english;
//        int math;
//        int science;
//        int social;
//        int hindi;
//        int marathi;

        //To store same type of multiple data, we can use arrays
        int[] marks = new int[4];
        marks[0] = 120;
        marks[1] = 530;
        marks[2] = 1024;
        marks[3] = 239;
//        marks[4] = 26;
//        marks[5] = 43;
//        marks[6] = 40;


        int sum = 0;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
//        System.out.println(marks[5]);

        System.out.println("marks.length = " + marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(i + "---" + marks[i]);
        }

        System.out.println("-------------");

        // find the sum of number in array ?

        for (int i = 0; i < marks.length; i++) {
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            System.out.println("marks[i] = " + marks[i]);
            sum = sum + marks[i];
            System.out.println("sum = " + sum);
        }
        System.out.println("-------------");
        System.out.println("sum = " + sum);

        // Find the largest number in array ?

        int largestNumber = 0;
        for (int i = 0; i < marks.length; i++) {
            if (largestNumber < marks[i]) {
                largestNumber = marks[i];
            }
        }
        System.out.println("largestNumber = " + largestNumber);


        /**
         * find the sum of numbers in array
         * find the largest number in array
         * find the smallest number in array
         * print the even numbers in array
         * print the odd numbers in array
         */

        // find the sum of numbers in array

        for (int i = 0; i < marks.length; i++) {
            sum = marks[i] + sum;
        }
        System.out.println("sum = " + sum);

        // Find the largest number in array

        for (int i = 0; i < marks.length; i++) {
        }
        System.out.println("largestNumber = " + largestNumber);


        // Find smallest number in array

        int smallestNumber = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < smallestNumber) {
                smallestNumber = marks[i];
            }
        }
        System.out.println("smallestNumber = " + smallestNumber);

        // Print the even numbers in array

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] % 2 == 0) {
                System.out.println("even no in array is = " + marks[i]);
            }
        }
// Print the odd numbers in array

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] % 2 == 1) {
                System.out.println("odd no in array is = " + marks[i]);
            }
        }

        // average
        int suma = 0;
        for (int i = 0; i < marks.length; i++) {
            suma = suma + marks[i];
        }
        System.out.println("average = " + suma / (float) marks.length);
    }

}