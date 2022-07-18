public class MainClass {
    public static void main(String[] args) {
        Assignments assignments = new Assignments();
//        for(int i=1; i<=500; i++) {
//            assignments.printArmstrongNumberOrNot(i);
//        }

        int primeCounter = 0;
        for (int i = 2; i <= 200; i++) {
            if (assignments.isPrimeOrNot(i)) {
                primeCounter++;
            }
        }
        System.out.println("primeCounter = " + primeCounter);


        //break
        //condition = 5 tak print karo
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        //print first 5 numbers that is divisible by 4 between 101-200
        for (int j = 1; j <= 5; j++) {
            int counter = 0;
            for (int i = 101; i <= 200; i++) {
                if (i % 4 == 0) {
                    if (counter == 5) {
                        break;
                    }
                    System.out.println(i);
                    counter++; //2
                }
            }
            if(j%2==0) {
                break;
            }
        }



        //Print fibonacci series
        assignments.printFibonacciSeries(10);
        System.out.println();
        System.out.println();
        assignments.printPattern(10);


        System.out.println(1 + 1); //2
        System.out.println("1" + 1); //11   //string + number = string
                                            //number + string = string
                                            //number + number = number
                                            //string + string = string


        System.out.println("" + 1 + 1); //"1" + 1 = "11"
        System.out.println(""+1 + 1 + "");  //11
        System.out.println(1 + "" + 1); //1 + "" = "11"
        System.out.println("" + (1 + 1)); //"" + 2 = "2"

    }


}
