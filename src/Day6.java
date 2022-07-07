public class Day6 {
    public static void main(String[] args) {

        /**
         * patterrns using nested for
         */


        /*

         *
         **
         ***
         ****
         *****


         */

        for (int line = 1; line <= 5; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        1
        22
        333
        4444
        55555
        */

        for (int line = 1; line <= 5; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print(line);
            }
            System.out.println();
        }


        /*
        1
        12
        123
        1234
        12345
         */
        for (int line = 1; line <= 5; line++) {
            for (int column = 1; column <= line; column++) {
                System.out.print(column);
            }
            System.out.println();
        }



        /*
        55555
        4444
        333
        22
        1
         */
        System.out.println("----------------");
        for (int line = 5; line >= 1; line--) {
            for (int column = 1; column <= line; column++) {
                System.out.print(line);
            }
            System.out.println();
        }

        /*
        54321
        4321
        321
        21
        1
         */
        System.out.println("----------------");
        for (int line = 5; line >= 1; line--) {
            for (int column = line; column >= 1; column--) {
                System.out.print(column);
            }
            System.out.println();
        }

        /*
            1
           22
          333
         4444
        55555
         */
        System.out.println("----------------------");
        for (int line = 1; line <= 5; line++) { //1
            for (int column = 1; column <= 5; column++) { //1
                if (column <= 5 - line) { //4
                    System.out.print(".");
                } else {
                    System.out.print(line);
                }
            }
            System.out.println();
        }




        /*

         *****
         ****
         ***
         **
         *

         */
        System.out.println("----------------------");
        for (int line = 5; line >= 1; line--) {
            for (int column = 1; column <= line; column++) {
                System.out.print("*");
            }
            System.out.println();
        }



        /*

        ....*
        ...**
        ..***
        .****
        *****


         */

        for (int line = 1; line <= 5; line++) { //1
            for (int column = 1; column <= 5; column++) { //1
                if (column <= 5 - line) { //4
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        /*

        ....*
        ...**
        ..***
        .****
        *****

         */

        System.out.println("-------------------");
        int total = 5;
        for(int line = 1; line<=total; line++) {
            for(int dots = 1; dots <= total - line;dots++) {
                System.out.print(".");
            }

            for(int star = 1; star <=line ; star++) {
                System.out.print("*");
            }

            System.out.println();

        }




    }
}
