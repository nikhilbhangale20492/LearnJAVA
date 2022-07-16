package day12;

public class CalculatorClass {

    // create a constructor with 2 arguments

    int collegeFees;
    int tutionFees;

    public CalculatorClass(int num1, int num2) {
        collegeFees = num1;
        tutionFees = num2;
    }




    // write add function to add two numbers
    public int addFunction() {
        return collegeFees + tutionFees;
    }

    // write multiple function to multiply 2 numbers
    public int multipleFunction() {
        return collegeFees * tutionFees;
    }

    // write largest function to return the largest of 2 numbers
    public int largestFunction() {
        if (collegeFees > tutionFees) {
            return collegeFees;
        } else {
            return tutionFees;
        }
    }

}
