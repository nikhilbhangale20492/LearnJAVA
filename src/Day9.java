public class Day9 {
    /**
     * Write a function
     * that will return the length of the string passed
     */
    public static int findLengthOfString(String statement) {
        return statement.length();
    }

    /**
     * Write a function
     * to return number of occurances of particular character
     * in a statement
     */
//    //retrunType functionName(dataType parameterName)
    public static int findOccurances(String statement, char character) {
        int counter = 0;
        statement = statement.toLowerCase();
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Find the number out of string.
     */

    //returnType functionName(dataType parameterName)
    public static int findNumberInString(String s1) {
        //logic goes here
        int number = 0;
        //number = string mein se number nikalo
        return number;
    }

    /**
     * find and return number of vowels from a statement
     * a,e,i,o,u
     */
    public static int findNoOfVowels(String statement) {
        int counter = 0;
        statement = statement.toLowerCase();
        for (int i = 0; i < statement.length(); i++) {

            char charIs = statement.charAt(i); //i

            if (charIs == 'a'
                    || charIs == 'e'
                    || charIs == 'i'
                    || charIs == 'o'
                    || charIs == 'u') {
                counter++; //3
            }

        }

        return counter;
    }

    /**
     * Find number of times space is repeated in statement
     * Find number of consonants in the statement.
     */

    // * Find number of times space is repeated in statement
    public static int numberOfSpace(String statement) {
        int counter = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == ' ') {
                counter++;

            }
        }
        return counter;
    }

    // * Find number of consonants in the statement.
    public static int findNoOfConsonants(String statement) {
        int counter = 0;
        statement = statement.toLowerCase();
        for (int i = 0; i < statement.length(); i++) {
            char a = statement.charAt(i);
            if (a != 'a' && a != 'i' && a != 'o' && a != 'u' && a != 'e') {
                counter++;
            }

        }
        return counter;
    }

    public static void test() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void test1() {
        for (int i = 1; i <= 10; i++) {
            if (i != 5) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void test2() {
        for (int i = 10; i >= 1; i--) {
            if (i == 5 || i == 8) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void test3() {
        for (int i = 10; i >= 1; i--) {
            if (i != 5 && i != 8) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        //find the length of below string
        String s1 = "Hey This is Arohi and I am 2 years old. I like playing games";
        System.out.println(findLengthOfString(s1));

        System.out.println("i repeated " + findOccurances(s1, 'i') + " times");
        System.out.println("a repeated " + findOccurances(s1, 'a') + " times");
        System.out.println("Space repeated " + numberOfSpace(s1) + " times");


        System.out.println("Index of T: " + s1.indexOf("T"));
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.charAt(1));
//        System.out.println(s1.charAt(2));
//        System.out.println(s1.charAt(3));
//        System.out.println(s1.charAt(59));
//        int counter = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.toLowerCase().charAt(i) == 'i') {
//                counter++;
//            }
//        }
//        System.out.println("Total no of times i repeated is " + counter);
//        System.out.println("Total no of times space repeated is " + counter);

        System.out.println(findNoOfVowels(s1));
        System.out.println("Consonant " + findNoOfConsonants(s1));

        test();
        test1();
        test2();
        test3();
    }


}
