public class ForLoopPractice {

    public static void main(String[] args) {
        // 1) Reverse the number 325645

        // Answer = 546523
         int number = 3252568;
         int reminder1 = number % 10; //= 5

         int newNumber1 = number / 10; //= 325645 / 10 = 32564
         int reminder2 = newNumber1 % 10; // = 32564 % 10 = 4
         int reverseNo1 = reminder1 * 10 + reminder2;// = 5 * 10 + 4 = 54

         int newNumber2 = newNumber1 / 10; // = 32564 / 10 = 3256
         int reminder3 = newNumber2 % 10; //= 3256 % 10 = 6
         int reverseNo2 = reverseNo1 * 10 + reminder3; //= 54 * 10 + 6 = 546

         int newNumber3 = newNumber2 / 10; // = 3256 / 10 = 325
         int reminder4 = newNumber3 % 10; // = 325 % 10 = 5
         int reverseNo3 = reverseNo2 * 10 + reminder4; // = 546 * 10 + 5 = 5465

         int newNumber4 = newNumber3 / 10; //= 325 / 10 = 32
         int reminder5 = newNumber4 % 10; //= 32 % 10 = 2
         int reverseNo4 = reverseNo3 * 10 + reminder5; //= 5465 * 10 + 2 = 54652

         int newNumber5 = newNumber4 / 10; //= 32 / 10 = 3
         int reminder6 = newNumber5 % 10; //= 3 % 10 = 3
         int reverseNo5 = reverseNo4 * 10 + reminder6; //= 54652 * 10 + 3 = 546523

         System.out.println("reverseNo5 = " + reverseNo5);

        // 2) Reverse the number 086020

        // Answer = 020680
        // int number = 086020;
        // int reminder1 = number % 10 = 0

        // int newNumber1 = number / 10 = 086020 / 10 = 08602
        // int reminder2 = newNumber % 10 = 08602 % 10 = 2
        // int reverseNo1 = reminder1 * 10 + reminder2 = 0 * 10 + 2 = 2

        // int newNumber2 = newNumber1 / 10 = 08602 / 10 = 0860
        // int reminder3 = newNumber2 % 10 = 0860 % 10 = 0
        // int reverseNo2 = reverseNo1 * 10 + reminder3 = 2 * 10 + 0 = 20

        // int newNumber3 = newNumber2 / 10 = 0860 / 10 = 086
        // int reminder4 = newNumber3 % 10 = 086 % 10 = 6
        // int reverseNo3 = reverseNo2 * 10 + reminder4 = 20 * 10 + 6 = 206

        // int newNumber4 = newNumber3 / 10 = 086 / 10 = 08
        // int reminder5 = newNumber4 % 10 = 08 % 10 = 8
        // int reverseNo4 = reverseNo3 * 10 + reminder5 = 206 * 10 + 8 = 2068

        // int newNumber5 = newNumber4 / 10 = 08 / 10 = 0
        // int reminder6 = newNumber5 % 10 = 0 % 10 = 0
        // int reverseNo5 = reverseNo4 * 10 + reminder6 = 2068 * 10 + 0 = 2068








    }

}
//    //Write a program to print numbers from 1 to 10.
//        for (int i=1; i<=10; i++) {
//            System.out.println(i);
//        }
//    //Write a program to calculate the sum of first 10 natural number.
//        int sum = 0;
//        for (int i=0; i<=10; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//        // 1+2+3+4+5
//
//        // print the multiplication table of 2.
//        int num = 15;
//        int result;
//        for (int i=1; i<=15; i++) {
//            result = num * i;
//            System.out.println(num + " x " + i +  " = " + result);
//        }
//
//        //Write a program to find the factorial value of any number.
//        int resulta = 1;
//        for (int i=1; i<=8; i++) {
//          resulta = resulta * i;
//            System.out.println("factorial of 8 is = " + resulta);
//        }
//
//        //1. Write a function to reverse any given number
//        int reverse = 0;
//        int number = 12345;
//        int resultrev;
//        while (number != 0) {
//            resultrev = number % 10;
//            number = number/10;
//            reverse = reverse * 10 + resultrev;
//        }
//        System.out.println("12345 Reverse no is = " + reverse);
//
//        //2. see if a number is armstrong number
//        int numbere = 153;
//        int resultd = 0;
//        int originalNumber = numbere;
//        while (numbere > 0) {
//            int reminder = numbere % 10;
//            resultd = resultd + reminder * reminder * reminder;
//            numbere = numbere / 10;
//            System.out.println("reminder = " + reminder);
//            System.out.println("number = " + numbere);
//        }
//        if (originalNumber == resultd) {
//            System.out.println(originalNumber + " is armstrong number");
//        } else {
//            System.out.println(originalNumber + " is not an armstrong number");
//        }
//
//        //5.solve the below equation
///**
// * given number=3
// *
// * 1 + x + x^2 + x^3 + x^4 + x^5
// * 1 + 3 + 3^2 + 3^3 + 3^4 + 3^5
// * 1 + 3 + 3x3 + 3x3x3 + 3x3x3x3 + 3x3x3x3x3
// */
////        int number = 3;
////        int result = 1;
////        for (int i=1; i<=5; i++) {
////            int powerResult = 1;
////            for (int j=1; j<=i; j++) {
////                powerResult = powerResult * number;
////            }
////            result = result + powerResult;
////        }
////        System.out.println("result = " + result);
//
//
//
////6. Solve the below equation
///**
// * given number = 7
// * 1 + X + 2X + 3X + 4X + 5X
// * 1 + 7 + 2*7 + 3*7 + 4*7 + 5*7
// */
///**
// * int result = 1;+
// * for (int i=1; i<=5; i++) {
// * result = result + i * number;
// * }
// * return result;
// */


