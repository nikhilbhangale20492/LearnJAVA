

//This is a Day2 of java training, we will learn data types

public class Day2 {
    public static void main(String[] args) {
        float num1 = 2782;
        float num2 = 7;
        float num3;
        num3 = num1 / num2;
        System.out.println("reminder is " + num3);
        //to store single character
        char char1 = 'a';
        char char2 = 'A'; //assign
        char char3 = 'Z';

        System.out.println(char1);
        /* char2 */
        System.out.println(char2);
        System.out.println(char3); //comment

        //single line comment
        /* this is a comment */

        //boolean is a datatype that stores true or false

        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1 value " + b1);
        System.out.println("b2 value " + b2);


        int num11 = 400;
        int num12 = 200;
        boolean b3 = num11 > num12;
        System.out.println(b3);


        //conditional statements
        //if else


        /**
         * if ( condition ) {
         * executes if condition is true
         * } else {
         * executes if condition is false
         * }
         */

        //find a number if it is even or odd
        int num21 = 1001;
        int reminder = num21 % 2;
        if (reminder == 0) {
            System.out.println(num21 + " is a even number");
        } else {
            System.out.println(num21 + " is a odd number");
        }


        int num31 = 34, num32 = 35;
        if (num31 > num32) {
            System.out.println(num31 + " is greater than " + num32);
        } else {
            System.out.println(num31 + " is smaller than " + num32);
        }

        /**
         * if
         */
        int age = 44;
        if (age > 60) {
            System.out.println("senior citizen");
        }

        /**
         * if elseif else
         */
        char sex = 'A';
        if (sex == 'M') {
            System.out.println("Male");
        } else if (sex == 'F') {
            System.out.println("Female");
        } else if(sex == 'O') {
            System.out.println("Others");
        } else {
            System.out.println(sex + " is not recognized, use M, F, O");
        }

        /**
         * nested if
         */
        int salary = 1000; //5000 -> manager -> 100 -> jr manager -> 200 -> sr manager
        int deductions = 399;

        if(salary > 5000) {
            System.out.println("Manager");
            if(deductions > 100) {
                System.out.println("senior manager");
            } else {
                System.out.println("Junior manager");
            }
        } else {
            System.out.println("Employee");
            if(deductions > 100) {
                System.out.println("senior Employee");
            } else {
                System.out.println("Junior Employee");
            }
        }


        /**
         * Take 2 numbers, see if the result of num1-num2 is greater than 0
         * Take 2 numbers, find out which one is greater
         * Take 2 numbers, multiply them and see if that result is even or odd
         */

        /**
         * loops
         * for, while, do while
         */
    }
}
