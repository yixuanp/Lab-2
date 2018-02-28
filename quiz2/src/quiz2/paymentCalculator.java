package quiz2;
import java.util.Scanner;

public class paymentCalculator 
{
	public static void main(String[] args)
	{
		//using scanner method to get inputs
		Scanner sc = new Scanner(System.in);
		System.out.println("Your loan rate is(in decimal):");
		double loan = sc.nextDouble();
		System.out.println("Your loan period is(in month):");
		int month = sc.nextInt();
		System.out.println("Your present value is(in $) ");
		double price = sc.nextDouble();
		double loanMonthly = loan/12;
		sc.close();
		
		
		//calculations with pow function
		double MonthlyPayment = (loanMonthly+(loanMonthly/(Math.pow(1+loanMonthly, month)-1)))*price;
		double totalInterest = MonthlyPayment*month-price;
		System.out.println("Your monthly payment is: $"+ MonthlyPayment);
		System.out.println("Your total interest is: $"+ totalInterest);
		
				
	}

}
