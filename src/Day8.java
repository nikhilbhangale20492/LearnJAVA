public class Day8 {

    public static void main(String[] args) {

        /**
         * Strings
         */

        String statement = "Hi This is Jitendra, we are learning JAVA";

        System.out.println("Length: " + statement.length());

        /**
         * check if the statement has JAVA or not
         */
        if (statement.contains("JAVA")) {
            System.out.println("Statement contains JAVA");
        } else {
            System.out.println("Statement does not contain JAVA");
        }

        /**
         * Print the statement in lower case
         */
        System.out.println(statement.toLowerCase());

        /**
         * Check if the statement contains jitendra, ignore the case
         */
        if (statement.toLowerCase().contains("jitendra")) { //chaining of commands
            System.out.println("Statement contains jitendra");
        } else {
            System.out.println("statement before converting to lowercase = " + statement);
            statement = statement.toLowerCase();
            System.out.println("statement after converting to lowercase = " + statement);
        }

        /**
         * Check if two string contents are equal
         */
        String firstName = "Nikhil";
        String lastName = "Bhangale";
        String constructedFullName = firstName + " " + lastName;


        String fullName = "Nikhil Bhangale";
        if (constructedFullName.contentEquals(fullName)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are NOT equal");
        }

        /**
         * indexof
         * String name=jitendra;
         */
        //j i t e n d r a
        //0 1 2 3 4 5 6 7

//        h i   t h i s   i s    j itendra, we are learning java
        //0 1 2 3 4 5 6 7 8 9 10 11
        String name = "jitendra";
        System.out.println("Index of i: " + name.indexOf("i"));
        System.out.println("Index of jitendra " + statement.indexOf("jitendra"));
        System.out.println("Index of Nikhil " + statement.indexOf("nikhil"));
        System.out.println("Index of is " + statement.indexOf("is"));

        String statement2 = "Hey this is Nikhil and learning java. this is java classes";
        System.out.println(statement2.indexOf("Hey", 10));

        /**
         * Substring
         * id:12345:id
         */
//H e y   t h i s   i s
//0 1 2 3 4 5 6 7 8 9 10
        System.out.println("-----substring----");
        System.out.println(statement2.substring(4, 8));

/**
 * String statement3 = "Hey I am Arohi and 1 year old. I like playing games"
 * 1. Does that string have "games" ?
 * 2. Find the index of name "Arohi"
 * 3. Print the substring "Arohi"
 * 4. Find the second index of "I"
 * 5. Find the length of statement3
 */


        String statement3 = "Hey I am Arohi and 1 year old. I like playing games";

        //1. Does that string have "games" ?
        if (statement3.contains("games")) {
            System.out.println("Statement does have games");
        } else {
            System.out.println("Statement does not have games");
        }

        // 2. Find the index of name "Arohi"

        // A r o h i
        // 0 1 2 3 4
        System.out.println(statement3.indexOf("Arohi"));


        // 3. Print the substring "Arohi"
        System.out.println("-----substring----");
        System.out.println(statement3.substring(9, 14));

        // 4. Find the second index of "I".

        System.out.println("Second Index of I: " + statement3.indexOf("I",5));


        // 5. Find the length of statement3

        System.out.println("Length: " + statement3.length());


    }

}
