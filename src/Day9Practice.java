public class Day9Practice {

    /* Write a function to return number of occurances of particular character in a statement
      */
    public static int numberOfOccurances(String statement, char character) {
        int counter = 0;
        statement = statement.toLowerCase();
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }




    public static void main(String [] args) {

        // Find the length of below string
        String s1 = "Hi I am Nikhil. I am 27 years old and i want to become a businessman";






    }
}
