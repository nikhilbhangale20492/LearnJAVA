import static java.lang.Integer.parseInt;

public class TestMyProgram {

    public static void main(String[] args) {
        int number = 34060;

        int reminder_1 = number % 10; // = 8
        System.out.println("reminder_1 = " + reminder_1);
        int newNumber_1 = number / 10; // = 3456
        int reminder_2 = newNumber_1 % 10; // 3456 % 10 = 6
        int reverseNumber_1 = reminder_1 * 10 + reminder_2; //86

        int newNumber_2 = newNumber_1 / 10; // = 3456 / 10 = 345
        int reminder_3 = newNumber_2 % 10; // 345 % 10 = 5
        int reverseNumber_2 = reverseNumber_1 * 10 + reminder_3; // 865

        int newNumber_3 = newNumber_2 / 10; // 345/10 = 34
        int reminder_4 = newNumber_3 % 10; // 34 %10 = 4
        int reverseNumber_3 = reverseNumber_2 * 10 + reminder_4; // 8654
        System.out.println("reverseNumber_3 = " + reverseNumber_3);

        int newNumber_4 = newNumber_3 / 10; // 34/10 = 3
        int reminder_5 = newNumber_4 % 10; // 3%10 = 3
        int reverseNumber_4 = reverseNumber_3 * 10 + reminder_5; //86543
        System.out.println(reverseNumber_4);


        System.out.println("-----" + reverseNumber(76871));
        System.out.println("****" + reverseNumber_1(76871));
        System.out.println("+++++" + reverseNumber_2(76871));
        System.out.println("+++++" + reverseNumber_2(76854371));
        System.out.println("+++++" + reverseNumber_2(763564871));
        System.out.println("+++++" + reverseNumber_2(768346371));
        System.out.println("+++++" + reverseString("reverseString"));
        palindromeFunction(12126121);
        palindromeString("nikkin");


    }

    public static int reverseNumber(int number) { //7
        int reverseNumber = 0;

        while (number != 0) {  // != not equal to
            int reminder = number % 10; //7
            reverseNumber = reverseNumber * 10 + reminder; //7867
            number = number / 10;       //7/10 = 0
            System.out.println("reverseNumber = " + reverseNumber);
        }
        return reverseNumber;
    }


    public static int reverseNumber_1(int number) {
        //using string

        //length = 5
        //0 1 2 3 4
        //7 8 7 8 6


        String convertedNumber = "" + number; //string
        String reverseNumber = "";
        reverseNumber = "" + convertedNumber.charAt(4); //6
        System.out.println("reverseNumber = " + reverseNumber);
        reverseNumber = reverseNumber + convertedNumber.charAt(3); //68
        System.out.println("reverseNumber = " + reverseNumber);
        reverseNumber = reverseNumber + convertedNumber.charAt(2); //687
        System.out.println("reverseNumber = " + reverseNumber);
        reverseNumber = reverseNumber + convertedNumber.charAt(1); //6878
        System.out.println("reverseNumber = " + reverseNumber);
        reverseNumber = reverseNumber + convertedNumber.charAt(0); //68787
        System.out.println("reverseNumber = " + reverseNumber);


        String reverseNumber_1 = "";
        reverseNumber_1 = convertedNumber.charAt(0) + reverseNumber_1;
        System.out.println("reverseNumber_1 = " + reverseNumber_1);
        reverseNumber_1 = convertedNumber.charAt(1) + reverseNumber_1;
        System.out.println("reverseNumber_1 = " + reverseNumber_1);
        reverseNumber_1 = convertedNumber.charAt(2) + reverseNumber_1;
        System.out.println("reverseNumber_1 = " + reverseNumber_1);
        reverseNumber_1 = convertedNumber.charAt(3) + reverseNumber_1;
        System.out.println("reverseNumber_1 = " + reverseNumber_1);
        reverseNumber_1 = convertedNumber.charAt(4) + reverseNumber_1;
        System.out.println("reverseNumber_1 = " + reverseNumber_1);


        //convert string to number
        return parseInt(reverseNumber);


    }

    public static int reverseNumber_2(int number) {
        String reverseNumber = "";
        String stringNumber = "" + number;
        for (int i = stringNumber.length() - 1; i >= 0; i--) {
            reverseNumber = reverseNumber + stringNumber.charAt(i);
        }

//        for(int i=0; i<stringNumber.length(); i++) {
//            reverseNumber = stringNumber.charAt(i) + reverseNumber;
//        }
        return Integer.parseInt(reverseNumber);
    }

    public static String reverseString(String sampleString) {
        String reverseString = "";

        for (int i = sampleString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + sampleString.charAt(i);
        }

//        for(int i=0; i<stringNumber.length(); i++) {
//            reverseNumber = stringNumber.charAt(i) + reverseNumber;
//        }
        return reverseString;
    }

    //check if a number is palindrome
    //121 -> 121 (palindrome)
    //100 -> 1 (not palindrome)
    //13431 -> 13431 (palindrome)

    /**
     * number
     * reverse
     * <p>
     * check
     * if true then palindrome
     * if false then not palindrome
     */
// 0 1 2
// 1 2 1
    public static void palindromeFunction(int number) {
        int reverseNo = 0;
        int number1 = number;

        while (number != 0) {
            int reminder = number % 10;
            reverseNo = reverseNo * 10 + reminder;
            number = number / 10;
        }
        if (reverseNo == number1) {
            System.out.println(number1 + " is palindrome");
        } else {
            System.out.println(number1 + " is not palindrome");
        }
    }

    /*
    number = 0
    reverseNo = 121
    number1 = 121

     */

    public static int reverseString1(String number) {
        String reverseString1 = "";

        for (int i = number.length() - 1; i >= 0; i--) {
            reverseString1 = reverseString1 + number.charAt(i);
        }
        return Integer.parseInt(reverseString1);
    }

    public static void palindromeString(String a1) {
        String palindromeString = "";

        for (int i = a1.length()-1; i>=0; i--) {
            palindromeString = palindromeString + a1.charAt(i);
        }
        if (palindromeString.equalsIgnoreCase(a1)) {
            System.out.println(a1 + " is palindrome");
        } else {
            System.out.println(a1 + " is not palindrome");
        }
    }


}
