public class Assignments {
    /**
     * 1. Write a function to reverse any given number
     * <p>
     * 12345
     * <p>
     * <p>
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
     * <p>
     * 1 * 10 + 2 = 12
     * <p>
     * 12 * 10 + 3 = 123
     * <p>
     * 123 * 10 + 4 = 1234
     * <p>
     * 1234 * 10 + 5 = 12345
     * <p>
     * <p>
     * <p>
     * 87968 -> 86978
     * <p>
     * number		reminder		number
     * <p>
     * 87968 % 10 = 8 				87968/10 = 8796
     * 8796  % 10 = 6 				8796 /10 = 879
     * 879   % 10 = 9  			879  /10 = 87
     */
    //1. Write a function to reverse any given number 12345
    public int reverseNumber(int number) {
        int reverse = 0;
        int result;
        while (number != 0) {
            result = number % 10;
            reverse = reverse * 10 + result;
            number = number / 10;
        }
        return reverse;
    }


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
            System.out.println("reminder = " + reminder);
            System.out.println("number = " + number);
        }
        if (originalNumber == result) {
            System.out.println(originalNumber + " is armstrong number");
        } else {
            System.out.println(originalNumber + " is not an armstrong number");
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
     * <p>
     * 1 + x^1 + x^2 + x^3 + x^4 + x^5
     * 1 + 3 + 3^2 + 3^3 + 3^4 + 3^5
     * 1 + 3 + 3x3 + 3x3x3 + 3x3x3x3 + 3x3x3x3x3
     * result 4 + 3*3
     * 1 + 3 + 3^2 + 3^3 + 3^4 + 3^5
     * 1 + 3
     * 4 + 3*3
     * 13   +   3*3*3
     * 40   +   3*3*3*3
     * 121  +   3*3*3*3*3
     * 364
     */

    public int equation1(int number) {
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            int powerResult = 1;
            for (int j = 1; j <= i; j++) {
                powerResult = powerResult * number;
            }
            result = result + powerResult;
        }
        return result;
    }

    //6. Solve the below equation

    /**
     * given number = 7
     * 1 + 1X + 2X + 3X + 4X + 5X
     * 1 + 7 + 2*7 + 3*7 + 4*7 + 5*7
     */

    public int equation2(int number) {
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result = result + i * number; // 8 + 2*7
        }
        return result;
    }
    /*
    ---------------
    number - 5
    power -  3
    number * number * number
    5   * 5 * 5
    25  * 5
    125

    2  *2*2*2*2
    4  *2*2*2
    8  *2*2
    16 *2
    32
    result = result * number
     */

    public int equation3(int number, int power) {
        // 5, 3
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;

    }

    //Find the equation 2^4
    // 2*2*2*2 = 16
    // 4*2*2
    // 8*2
    // 16

    public int equation4(int number) {
        //int number = 2;
        int result = 1;
        for (int i = 1; i <= 4; i++) {
            result = result * number;
        }
        return result;
    }


    // find 1 + x + 2x + 3x + 4x + 5x
    //
    //

    //int numb = 2;

    public int equation5(int number) {
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            // int multiply = i * number;
            result = result + i * number;
        }
        return result;
    }


}

