package day12;

public class MainClass {

    public static void main(String[] args) {
        //Create object of tryme
        //Class varaiableName = new Class();
        TryMe tryMe = new TryMe(8);
        tryMe.printHello();
        tryMe.printMyNumber();
        tryMe.myNumber = 10;
        tryMe.printMyNumber();

        TryMe newObject = new TryMe(90);
        newObject.printHello();
        newObject.printMyNumber();

        tryMe.printMyNumber(); // 10
        newObject.myNumber = 100;
        tryMe.printMyNumber(); // 10
        tryMe.myNumber = 70;
        tryMe.printMyNumber(); // 70
        newObject.printMyNumber(); //100


        int i = 10; //10-> number -> iska datatype -> int -> kisme save i
        //datatype variable = value
//        TryMe arohi = new TryMe(); //object -> ka data type -> TryMe -> kisme save karna -> arohi
//        new TryMe();
//        new TryMe();


        InterestCalculator interestCalculator = new InterestCalculator(876, 12, 1);
        System.out.println(interestCalculator.calculateMyInterest());
        System.out.println(interestCalculator.maturityAmount());

        InterestCalculator interestCalculator1 = new InterestCalculator(350000, 6.9, 30);
        System.out.println(interestCalculator1.calculateMyInterest());
        System.out.println("interestCalculator1.maturityAmount() = " + interestCalculator1.maturityAmount());


    }

}

/**
 * Create a SampleClass with psvm
 * Create a CalculatorClass
 *      create a constructor with 2 arguments
 *      write add function to add two numbers
 *      write multiple function to multiply 2 numbers
 *      write largest function to return the largest of 2 numbers
 *
 * From Sample class, create 2 objects of CalculatorClass with random numbers
 * call add, multiply and largest functions
 */
