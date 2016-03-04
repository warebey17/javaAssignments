import java.text.DecimalFormat;
import java.util.Scanner;


public class calculations {

	public static void main(String[] args) {
		
		DecimalFormat decFor = new DecimalFormat("0.00");
		double hoursWorked;
		double payRate;
		double totalPay;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Input your total hours worked. ");
		hoursWorked = keyboard.nextDouble();
		System.out.print("What do you make per hour?  ");
		payRate = keyboard.nextDouble();
		
		
		if(hoursWorked <= 40)
		{
			totalPay = hoursWorked * payRate;
		}
		else
		{
			totalPay = (40 * payRate) + ((hoursWorked - 40) * (1.5 * payRate));
			
		}
		System.out.println("Your pay for this pay period is $" + decFor.format(totalPay));

	}

}
