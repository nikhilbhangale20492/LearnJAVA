public class Assignments {
    /**
     * 1. Write a function to reverse any given number
     *
     * 12345
     *
     *
     * 54321
     * divide by 10 reminder 1
     * 5432
     * divide by 10 reminder 2
     * 543
     * divide by 10 reminder 3
     * 54
     * divide by 10 reminder 4
     * 5
     * divide by 10 reminder 5
     *
     * 1 * 10 + 2 = 12
     *
     * 12 * 10 + 3 = 123
     *
     * 123 * 10 + 4 = 1234
     *
     * 1234 * 10 + 5 = 12345
     *
     *
     *
     * 87968 -> 86978
     *
     * number		reminder		number
     *
     * 87968 % 10 = 8 				87968/10 = 8796
     * 8796  % 10 = 6 				8796 /10 = 879
     * 879   % 10 = 9  			879  /10 = 87
     */


    /**
     * 2. see if a number is armstrong number
     * <p>
     * 153 % 10 =  3
     * <p>
     * 1^3 + 5^3 + 3^3
     * 1*1*1 + 5*5*5 + 3*3*3
     * 1 + 125 + 27 = 153
     */

    public void printArmstrongNumberOrNot(int number) { //number = 153
        int result = 0;
        int originalNumber = number;
        while (number > 0) {
            int reminder = number % 10;
            result = result + reminder * reminder * reminder;
            number = number / 10;
//            System.out.println("reminder = " + reminder);
//            System.out.println("number = " + number);
        }
        if (originalNumber == result) {
            System.out.println(originalNumber + " is armstrong number");
        } else {
//            System.out.println(originalNumber + " is not an armstrong number");
        }
    }


    /**
     * 3. Write a function to see if any given number is prime or not
     */
    public boolean isPrimeOrNot(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        }
        return isPrime;
    }

    /**
     * 4. Print first 15 fibonacci numbers
     * <p>
     * 0 1 1 2 3 5
     */
    public void printFibonacciSeries(int number) {
        int num1 = 0;
        int num2 = 1;
        int result = 0;
        System.out.print(num1 + "   " + num2);
        for (int i = 1; i <= number; i++) {
            result = num1 + num2;
            System.out.print("   " + result);
            num1 = num2;
            num2 = result;
        }
    }

    /**
     * write a method to print the following
     * 1+2+3+4+5+6....
     * 1+2+
     */

    public void printPattern(int number) {
        String pattern = "";
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i == number) {
                pattern = pattern + i + " = ";
            } else {
                pattern = pattern + i + " + ";
            }
            sum = sum + i;
        }
        System.out.println(pattern + sum);
    }


    //5.solve the below equation
    /**
     * given number=3
     *
     * 1 + x + x^2 + x^3 + x^4 + x^5
     * 1 + 3 + 3^2 + 3^3 + 3^4 + 3^5
     * 1 + 3 + 3x3 + 3x3x3 + 3x3x3x3 + 3x3x3x3x3
     */

    //6. Solve the below equation
    /**
     * given number = 7
     * 1 + X + 2X + 3X + 4X + 5X
     * 1 + 7 + 2*7 + 3*7 + 4*7 + 5*7
     */

}
