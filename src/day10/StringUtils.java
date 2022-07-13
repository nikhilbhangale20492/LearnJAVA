package day10; //package name

//import statements


public class StringUtils { //class declaration

    //variables
    //constructor
    //functions


    public static void test3() {
        variableClass = 20;
    }

    static int variableClass = 500; //this is a class varialbe //should be used below this declaration

    public static void printClassVaraible() {
        System.out.println("variable value is " + variableClass);
    }

    public static void test2() {
        //print the value X 2
        System.out.println("Twice of " + variableClass + " is " + variableClass * 2);
    }


    public static void printTable2() {
        int variableFunction = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(variableFunction + " X " + i + " = " + variableFunction * i);
        }
        System.out.println(variableFunction);
    }

//    public static void printFunctionVariable() {
//        System.out.println(variableFunction);
//    }


    public void test4() {
        int functionVar = 10;
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        if (4 < 8) {
            int number = 10; //memory -> space -> number
            System.out.println(number * 5);
            System.out.println(functionVar);
            System.out.println(variableClass);
        } //memory -> space -> free

        else {
            int number = 30; //memory -> new space -> number
            int variableClass = 50;
            System.out.println(number);
            System.out.println("variableClass value (else variable) in else block: " + variableClass);
//            System.out.println("variableClass value (class variable) in else block: " + this.variableClass);
        }

        System.out.println(functionVar);


    }


    public static void main(String[] args) {
        int variable;

        String statement = "arohi";
        System.out.println(statement);
        printClassVaraible();
        test2();
        test3();
        printClassVaraible();
        test2();
        System.out.println(statement);
        System.out.println("class variable can be used in main method: " + variableClass);

        printTable2();

        System.out.println("statement = " + statement);
    }


}
