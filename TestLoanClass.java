import java.util.Scanner;

public class TestLoanClass {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Enter yearly interest rate
    System.out.print(
      "Enter yearly interest rate, for example, 8.25: ");
      /**IllegalArgumentException*/
    double annualInterestRate = input.nextDouble();
	if(annualInterestRate <= 0){
		throw new IllegalArgumentException("Annual interest rate is positive.");
	}

    // Enter number of years
    System.out.print("Enter number of years as an integer: ");
     /**IllegalArgumentException*/
    int numberOfYears = input.nextInt();
	if(numberOfYears <= 0){
		throw new IllegalArgumentException("Number of years is positive.");
	}
	
    // Enter loan amount
    System.out.print("Enter loan amount, for example, 120000.95: ");
     /**IllegalArgumentException*/
    double loanAmount =  input.nextDouble();
	if(loanAmount <= 0){
		throw new IllegalArgumentException("Loan amount is positive.");
	}

    // Create Loan object
    Loan loan =
      new Loan(annualInterestRate, numberOfYears, loanAmount);

    // Display loan date, monthly payment, and total payment
    System.out.printf("The loan was created on %s\n" +
      "The monthly payment is %.2f\nThe total payment is %.2f\n",
      loan.getLoanDate().toString(), loan.getMonthlyPayment(), 
      loan.getTotalPayment());
  }
}
