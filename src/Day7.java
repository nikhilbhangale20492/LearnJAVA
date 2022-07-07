import javax.lang.model.SourceVersion;

public class Day7 {
    public static void main(String[] args) {
        printHello();
        // int, char, float, long, boolean -> data types
        // String -> Class
        //int line
        String firstName = "Jitendra";
        String lastName = "Jawale";

        System.out.println(firstName);


        //nikhil    -> variable
        //nikhil()  -> function
        System.out.println(firstName.length());
        System.out.println(firstName + " " + lastName);


        printHello();
        printEvenOrOdd(100);
        printEvenOrOdd(101);
        printEvenOrOdd(50001);
        printEvenOrOdd(3452);

        add2Numbers(49, 51);
        add2Numbers(32, 90);
        add2Numbers(45, 55);

        int a1 = multiply2Numbers(6, 9);
        System.out.println("Multiply result " + a1);

        System.out.println(findLengthOf2Strings("Arohi", "Bhanagle"));
        System.out.println(findLengthOf2Strings("Nikhil", "Bhanagle"));
        System.out.println(findLengthOf2Strings("Shradha", "Jawale"));



    }


    //returnType functionName()
    public static void printHello() {
        System.out.println("Hello, Welcome to JAVA tutorial");
    }

    //returnType functionName(argument)
    /*
    Write a function to print even or odd number
     */
    public static void printEvenOrOdd(int number) { //3452
        if (number % 2 == 0) { //3452%2 = 0, 0==0, true
            System.out.println(number + " is even"); //3452 is even
        } else {
            System.out.println(number + " is odd"); //50001 is odd
        }
    }

    //returnType functionName(argument1, argument2)
    /*
    write to function to add 2 numbers and display the result
     */
    public static void add2Numbers(int number1, int number2) {
        int sum = number1 + number2; //49 + 51
        System.out.println("sum is " + sum);
    }


    /*
    find multiplication of 2 numbers and return the result
     */
    //returnType functionName(argument1, argument2)
    public static int multiply2Numbers(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }
    /*
    Write a function to return the length of 2 strings combined
     */
    //arohi bhangale = 5 + 8 = 13
    //returnType functionName(argument1, argument2)
    public static int findLengthOf2Strings(String firstName, String lastName) {
        int firstNameLength = firstName.length();
        int lastNameLength = lastName.length();
        int sum = firstNameLength + lastNameLength;
        return sum;
    }


    /*
    Write a function to print Hello World
    Write a function which takes 2 numbers and return the sum of them
    Write a function which takes 2 numbers and return the largest out of them
    Write a function which takes 3 numbers and return the smallest out of them
    Write a function which takes 3 strings and return sum of length of the strings
     */



    }

