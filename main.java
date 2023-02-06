import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your dollar ammount: "); //scans dollar amount
		double amount = scan.nextDouble();
		int dollars = (int)amount;
		int apennies = (int)Math.round((amount - dollars)*100);
		
		System.out.println();
		//Finds out dollar amounts
		int hundred = dollars/100;
		dollars = dollars%100;
		
		int fifty = dollars/ 50;
		dollars = dollars%50;
		
		int twenty = dollars/ 20;
		dollars = dollars%20;
		
		int tens = dollars / 10;
		dollars = dollars%10;
		
		int fives = dollars / 5;
		dollars = dollars%5;
		
		int ones = dollars;
		dollars = dollars%1;
		//Finds cent amounts
		int quarters = apennies/25;
		apennies = apennies%25;
		
		int dimes = apennies/10;
		apennies = apennies%10;
		
		int nickels = apennies/5;
		apennies = apennies%5;
		
		int pennies = apennies/1;
		apennies = apennies%1;
		
		//print statements
		System.out.println("You have:\n");
		System.out.println("-   "+hundred + " hundred(s)\n");
		System.out.println("-   "+fifty + " fifty(s)\n");
		System.out.println("-   "+twenty + " twenty(s)\n");
		System.out.println("-   "+tens + " ten(s)\n");
		System.out.println("-   "+fives + " five(s)\n");
		System.out.println("-   "+ones + " one(s)\n");
		System.out.println("-   "+quarters + " quarter(s)\n");
		System.out.println("-   "+dimes + " dime(s)\n");
		System.out.println("-   "+nickels + " nickel(s)\n");
		System.out.println("-   "+pennies + " cent(s)\n");
		
		System.out.println();
		System.out.println("Goodbye!");
		scan.close();
	}
}