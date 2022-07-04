
public class Day3 {
    public static void main(String[] args) {
        //loops
//        System.out.println(1);
//        System.out.println(2);

        //for
        /**
         * for (initialization; condition; increment/decrement) {statements}
         */
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("outside loop i value " + i);

        for (int j = 100; j > 50; j--) {
            System.out.println("J : " + j);
        }

        for (int k = 1; k < 1000; k = k + 10) {
            System.out.println(k);
        }

        //print 2 table
        for (int j1 = 1; j1 <= 10; j1++) {
            int result = 2 * j1;
            System.out.println("2 X " + j1 + " = " + result);
        }


        //print even numbers from 1-100
        for (int i2 = 1; i2 <= 100; i2++) {
            if (i2 % 2 == 0) {
                System.out.println(i2 + " is even");
            } else {
                System.out.println(i2 + " is odd");
            }
        }

        //find all the numbers which are divisible by 3 between 101-200
        for (int i3 = 101; i3 <= 200; i3++) {
            if (i3 % 3 == 0) {
                System.out.println(i3 + " is divisible by 3");
            } else {
                System.out.println(i3 + " is NOT divisible by 3");
            }
        }

        //find all the numbers which are divisible by 3 and are even between 101-200
        /**
         * if(condition1 && condition2)
         * if(condition1 || condition2)
         */
        for (int i3 = 10; i3 <= 20; i3++) {
            if (i3 % 3 == 0 && i3 % 2 == 0) {
                System.out.println(i3 + " is divisible by 3 and is even");
            }
        }

        //find all the numbers which are divisible by 3 or are even between 101-200
        for (int i3 = 10; i3 <= 20; i3++) {
            if (i3 % 3 == 0 || i3 % 2 == 0) {
                System.out.println(i3 + " is divisible by 3 or is even");
            }
        }

        //i         1       2               9       10          11
        //i<=10     true    true            true    true        false
        //statements        execute         exeute  execute
        //increment 2       3               10      11

        //while

        /**
         * while (condition) { statements }
         */
        //init, condition, statement
        int while1 = 0;
        while (while1 <= 20) {
            System.out.println(while1);
            while1++;
        }
        System.out.println("outside loop while1 value: " + while1);


        /**
         * print 1-20
         */
        boolean condition = true;
        int var2 = 0;
        while (condition) {
            System.out.println(var2);
            if (var2 == 20) {
                condition = false;
            }
            var2++;
        }


        //dowhile
        /**
         * do {
         * statements
         * } while(condition);
         */
        //statement,  condition, statement, condition
        int var1 = 1;
        do {
            System.out.println(var1);
            var1++;
        } while (var1 <= 10);

        /**
         * use for, while and do while loop to print numbers from 10-100
         * print all the numbers that are divisible by 5 between 1-100
         * print all the numbers that are divisible by 9 and are even
         */

        /**
         * nested loops
         */
        //use for, while and do while loop to print numbers from 10-100
        int a;
        for (a = 10; a <= 100; a++) {
            System.out.println(a);
        }
        System.out.println("outside loop n value " + a);

        int whilea = 10;
        while (whilea <= 100) {
            System.out.println(whilea);
            whilea++;
        }
        System.out.println("outside loop whilea value: " + whilea);

        int vara = 10;
        do {
            System.out.println(vara);
            vara++;
        } while (vara <= 100);


        //print all the numbers that are divisible by 5 between 1-100 ?

        for (int ia = 1; ia <= 100; ia++) {
            if (ia % 5 == 0) {
                System.out.println(ia+ " is divisible by 5");
            } else {
                System.out.println(ia+ " is not divisible by 5");
            }
        }

        //print all the numbers that are divisible by 9 and are even between 1-100 ?

        for (int ia = 1; ia <= 100; ia++) {
            if (ia % 9 == 0 && ia % 2 == 0) {
                System.out.println(ia+ " is divisible by 9 and are even");
            }
        }

        for (int ia = 1; ia <= 100; ia++) {
            if (ia % 9 == 0 || ia % 2 == 0) {
                System.out.println(ia+ " is divisible by 9 or are even");
            }
        }
    }
}
