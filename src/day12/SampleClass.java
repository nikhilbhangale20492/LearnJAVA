package day12;

public class SampleClass {
    public static void main(String[] args) {

    CalculatorClass calculatorClass = new CalculatorClass(20,35);

        System.out.println(calculatorClass.addFunction());
        System.out.println(calculatorClass.multipleFunction());
        System.out.println(calculatorClass.largestFunction());

        CalculatorClass nikhil = new CalculatorClass(10,15);
        System.out.println("Add " + nikhil.addFunction());
        System.out.println("Multiply " +nikhil.multipleFunction());
        System.out.println("Largest " + nikhil.largestFunction());


    }

}
