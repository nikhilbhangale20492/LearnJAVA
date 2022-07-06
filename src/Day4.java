public class Day4 {
    public static void main(String[] args) {
        /**
         * nested loops
         */

        for (int num = 1; num <= 5; num++) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }
            System.out.println("--------------");
        }

//num = 1
        //i = 1 -> 1x1=1
        //2 1x2=2
        //3


        //10 1x10=10
//num = 2
        //i=1 -> 2x1=2

        //i=10 2x10=20
        //i=11

//num=3
//num=4
//num=5

        /**
         * in given number, find the largest number
         *
         * number = 4568130
         * //find the largest single digit number - 8
         */

        int number = 12453;
        int largestNumber = 0; //8
        //4568130 - > 4568130 % 10 = 0
        //456813 -> 456813 % 10 = 3
        //45681 -> 1
        //4568 -> 8
        //456 -> 6
        //45 -> 5
        //4 -> 4
        //0

        System.out.println("number = " + number);
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.println("lastDigit = " + lastDigit);
            number = number / 10;
            System.out.println("number = " + number);
            if (lastDigit > largestNumber) {  //8 > 3
                largestNumber = lastDigit;
            }
        }
        System.out.println("Largest Number is: " + largestNumber);


        /**
         * for a given number, find the sum of all single digits
         *
         * int number = 234235; (2+3+4+2+3+5)
         */


        //find the sum of 1-10
        //1 + 2 + 3 + 4 + 5 + ... + 10
        //1
        //1+2
        //1+2+3
        //....
        //1+2+3+..+9+10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);

        //find the factorial of 5
        //5 * 4 * 3 * 2 * 1
        //5
        //5*4
        //5*4*3
        //5*4*3*2
        //5*4*3*2*1
        int fact = 1;
        for (int i = 5; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println("fact = " + fact);

        int fact1 = 1;
        for (int i = 1; i <= 5; i++) {
            fact1 = fact1 * i;
        }
        System.out.println("fact1 = " + fact1);

        int factNumber = 5;
        int factresult = 1;
        while (factNumber > 1) {
            factresult = factresult * factNumber;
            factNumber--;
        }
        System.out.println("factresult = " + factresult);


        /**
         * In a given number, find the smallest single digit number
         * int number = 32452341; //smallest number = 1
         */

        /**
         * For a given number, find the largest divisor
         * int number = 100; //result = 50
         * 8%1 = 0
         * 8%2 = 0
         * 8%3 = 2
         * 8%4 = 0
         * 8%5 = 3
         * 8%6 = 2
         * 8%7 = 1
         *
         *
         *
         * 12
         * 12%1 = 0
         * ...
         * 12%6=0
         * 12%7=5
         *
         * 12%11=1
         *
         *
         */

        /**
         * nested for loops, pattern
         * Arrays
         */

        //In a given number, find the smallest single digit number
        // int numbera = 32452341; //smallest number = 1

        int numbera = 124508765;
        int smallestnumber = 10;

        // System.out.println("numbera = " + numbera);
        while (numbera > 0) {
            int lastDigit = numbera % 10;
            System.out.println("lastDigit = " + lastDigit);
            numbera = numbera / 10;
            System.out.println("numbera = " + numbera);
            if (lastDigit < smallestnumber) {  //1 < 5
                smallestnumber = lastDigit;
            }
        }
        System.out.println("smallest Number is: " + smallestnumber);


         // For a given number, find the largest divisor
        // int number = 100; //result = 50

//*8 % 1 = 0
//8 % 2 = 0
        //8 % 3 = 2
        //8 % 4 = 0
        //8 % 5 = 3
        //8 % 6 = 2
        //8 % 7 = 1

        int numberb = 100;
        int answer = 0;
        for (int i = 1; i < numberb; i++) {
        //for (int i = 1; i <= numberb-1; i++) {
            // System.out.println("numberb = " + numberb);
            if (numberb % i == 0) {
                answer = i;
            }
            // System.out.println("answer = " + answer);
        }
        System.out.println("answer = " + answer);


    }
}