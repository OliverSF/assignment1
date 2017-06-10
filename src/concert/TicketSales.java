/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package concert;

import java.util.Scanner; //selecting and bringing in the scanner utility
import java.text.DecimalFormat; //selecting and bringing in the decimal format text 

public class TicketSales {
//Class name based on ending result

	public static void main(String[] args) {
		
		//Declare Variables
		int seatA, seatB, seatC;
		double priceA, priceB, priceC, totalSales;
		
		//Declare and create instance of the scanner class
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		//Get input from user for amount of seats A sold
		System.out.print("Enter number of A seats sold: ");
		seatA = input.nextInt();
		
		//Get input from user for price of seats A
		System.out.print("Enter price of A tickets: ");
		priceA = input.nextDouble();
		
		//Get input from user for amount of seats B sold
		System.out.print("Enter number of B seats sold: ");
		seatB = input.nextInt();
		
		//Get input from user for price of seats B
		System.out.print("Enter price of B tickets: ");
		priceB = input.nextDouble();
		
		//Get input from user for amount of seats C sold
		System.out.print("Enter number of C seats sold: ");
		seatC = input.nextInt();
		
		//Get input from user for price of seats C
		System.out.print("Enter price of C tickets: ");
		priceC = input.nextDouble();
		
		//Calculating the Total Sales the concert
		totalSales = (seatA * priceA) + (seatB * priceB) + (seatC * priceC);
		
		//Outputting the results of the user input and Total Sales calculation
		System.out.println("\n\t\t Tickets Sold \t Price per Ticket");
		System.out.println("\t\t ------------" + "\t ----------------");
		System.out.println("A Tickets: \t\t" + seatA + "\t\t" + df.format(priceA));
		System.out.println("B Tickets: \t\t" + seatB + "\t\t" + df.format(priceB));
		System.out.println("C Tickets: \t\t" + seatC + "\t\t" + df.format(priceC));
		System.out.println("\n\t\t Total Sales €" + df.format(totalSales));
		
		input.close(); //close input to avoid possible leak

	} //ending main method

} //ending class
