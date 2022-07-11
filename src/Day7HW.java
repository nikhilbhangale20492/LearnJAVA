public class Day7HW {
    public static void main(String[] args) {

        printHello();

        String firstName = "Hello";
        String LastName = "World";
        System.out.println(firstName + " " + LastName);

        String middleName = "India";

        // This is to call the function
        int sum = add2Numbers(120, 80);
        System.out.println("sum = " + sum);


        int a1 = largestNumbers(30, 60);
        System.out.println("Largest Number out of them is " + a1);

        printHello();
       // a2 = SmallestNumbers(30, 60, 80);
        //System.out.println("Smallest Number out of them is " + a2);

        System.out.println(sumOfLengthOfStrings("Hello", "India", "World"));


    }

    // Write a function to print Hello World I am JAVA

    public static void printHello() {
        System.out.println("Hello, World I am JAVA");
    }

    // Write a function which takes 2 numbers and return the sum of them
    public static int add2Numbers(int numa, int numb) {
        int sum = numa + numb;
        return sum;
    }

    // Write a function which takes 2 numbers and return the largest out of them

    public static int largestNumbers(int number1, int number2) {
        /*
        n1 and n2
        n1 < n2
        return n2
        else
        return n1
         */
        if (number1 < number2) {
            return number2;
        } else {
            return number1;
        }
    }
    // Write a function which takes 3 numbers and return the smallest out of them (nested if)
// 30 60 80

   // public static int SmallestNumbers(int number1, int number2, int number3) {

//        return a2;
//    }

    // Write a function which takes 3 strings and return sum of length of the strings

    public static int sumOfLengthOfStrings(String firstName, String middleName, String lastName) {
        int firstNameLength = firstName.length();
        int middleNameLength = middleName.length();
        int lastNameLength = lastName.length();
        int sum = firstNameLength + middleNameLength + lastNameLength;
        return sum;
    }
    public static int findSmallestNumber(int n1, int n2, int n3) {
        if(n1 < n2) {
            if(n1 < n3) {
                return n1;
            } else {
                return n3;
            }
        } else {
            if(n2 < n3) {
                return n2;
            } else {
                return n3;
            }
        }
    }
}

