package assignments;

public class Basic {

    public static void main(String[] args) {


        /**
         * Add 765 and 876 and print result
         * 765 + 876 = 1641
         */
        int numbera = 765;
        int numberb = 876;
        int result;
        result = numbera + numberb;
        System.out.println("result = " + result);


        /**
         * Subtract 987 with 543 and print result
         * 987-543= 444
         */
        int numberc = 987;
        int numberd = 543;
        int resulta;
        resulta = numberc - numberd;
        System.out.println("resulta = " + resulta);


        /**
         * Print the reminder when 30 is divided by 7
         */
            int reminder;
            int numbere = 30;
            int numberf = 7;
            reminder = numbere % numberf;
        System.out.println("reminder = " + reminder);

        /**
         * Print the exact result including decimals when 765 is divided by 4
         */
            float resultb;
            float num = 765;
            float numa = 4;
            resultb = num / numa;
        System.out.println("Exact resultb = " + resultb);

        /**
         * Multiply 675 with 78 and print the result
         */
        int mulResult;
        int numb = 675;
        int numc = 78;
        mulResult = numb * numc;
        System.out.println("mulResult = " + mulResult);


        /**
         * Print whether 76857 is even or odd
         * 76857 % 2
         */

        int numd = 76857;
        int rem = numd % 2;
        if (rem == 1) {
            System.out.println(numd + " is odd no");
        } else {
            System.out.println(numd + " is even no ");
        }




        /**
         * Print whether reminder of 378 when divided by 7 is even or odd
         * 378 % 7 = 0
         */
        System.out.println(599 % 7);
        int nume = 599;
        int remi = nume % 7;
        int remin = remi % 2;
        if (remin == 1) {
            System.out.println(remi + " is odd ");
        } else {
            System.out.println(remi + " is even ");
        }
        System.out.println("remin = " + remin);
        System.out.println(101 > 100);


    }



}
