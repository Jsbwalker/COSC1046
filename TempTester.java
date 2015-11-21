package question3;

import java.util.Scanner;

public class TempTester {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the initial temperatures: ");
		Temperature temp1 = new Temperature(input.nextDouble());
		Temperature temp2 = new Temperature(input.nextDouble());
		
		tempPrinter(temp1);
		System.out.println("---------------------------------------------");
		tempPrinter(temp2);
		
		System.out.print("\nPlease enter a new set of temperatures: ");
		temp1.setC(input.nextDouble());
		temp2.setC(input.nextDouble());
		System.out.println();
		
		tempPrinter(temp1);
		System.out.println("---------------------------------------------");
		tempPrinter(temp2);
		
		input.close();
	}
	
	public static void tempPrinter(Temperature temp){
		System.out.printf("The current temperature in Celsius is : %.2f%n", temp.getC());
		System.out.printf("The current temperature in Fahrenheit is : %.2f%n", temp.getF());
		System.out.printf("The current temperature in Kelvin is : %.2f%n", temp.getK());
		
	}
}
