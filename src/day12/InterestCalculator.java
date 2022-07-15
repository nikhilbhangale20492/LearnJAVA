package day12;

public class InterestCalculator {

    int principalAmount;
    double rateOfInterest;
    int term;

    public InterestCalculator(int num1, double num2, int num3) {
        principalAmount = num1;
        rateOfInterest = num2;
        term = num3;
    }

    public double calculateMyInterest() {
        double interest = principalAmount * term * rateOfInterest / 100.0;
        return interest;
    }

    public double maturityAmount() {
        return principalAmount + calculateMyInterest();
    }
}
