import javax.lang.model.SourceVersion;

public class Day7HW {
    public static void main(String[] args) {

        Day7.printHello();

        // Write a function to print Hello World
        String firstName = "Hello";
        String LastName = "World";
        System.out.println(firstName + " " + LastName);

        String middleName = "India";

        // This is to call the function
        int sum = add2Numbers(120, 80);
        System.out.println("sum = " + sum);

        Day7.printHello();
        number1(30);
        number2(10);
        number3(80);

        System.out.println(sumOfLengthOfStrings("Hello", "India", "World"));


    }

   // Write a function which takes 2 numbers and return the sum of them
   public static int add2Numbers(int numa, int numb) {
       int sum = numa + numb;
       return sum;
   }

        // Write a function which takes 2 numbers and return the largest out of them

    public static int largestNumber(int number1, int number2) {
        int result = number1 > number2;
        return result;

        // Write a function which takes 3 numbers and return the smallest out of them

        public static int smallestNumber(int number1, int number, int number3) {
            int result = numa > numb;
            return result;

        // Write a function which takes 3 strings and return sum of length of the strings

            public static int sumOfLengthOfStrings(String firstName, String middleName, String lastName) {
                int firstNameLength = firstName.length();
                int middleNameLength = middleName.length();
                int lastNameLength = lastName.length();
                int sum = firstNameLength + middleNameLength + lastNameLength;
                return sum;
}

