/**
 * Loan Class - Exercise 2.0
 * Represents a loan with annual interest rate, number of years, and loan amount.
 * Provides methods to calculate monthly payment and total payment.
 */
public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    // Default constructor
    public Loan() {
        this(2.5, 1, 1000.0);
    }

    // Constructor with specified interest rate, years, and loan amount
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new java.util.Date();
    }

    // Getter for annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Setter for annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Getter for number of years
    public int getNumberOfYears() {
        return numberOfYears;
    }

    // Setter for number of years
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // Getter for loan amount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Setter for loan amount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Getter for loan date
    public java.util.Date getLoanDate() {
        return loanDate;
    }

    // Calculate monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        return monthlyPayment;
    }

    // Calculate total payment
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
}