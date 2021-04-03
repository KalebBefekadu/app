package interviewprep;
//Asser Assgid
//CSC 1301
import java.util.Scanner;

public class Geometry {
		//main method where all the codes run
	public static void main(String[] args) {
		//calls the display so that it runs
		displaymanu ();
		System.out.print("Enter your choice (1-3): ");
		//Creates a scanner class 
		Scanner scan = new Scanner (System.in);
		//Takes an input
		int num = scan.nextInt();
		//checks if user input is in the range of 1 - 3
		while (num < 1 || num > 3) {		
			System.out.print("Invalid choice. please enter 1 - 3: ");
			 num = scan.nextInt();
		}
		//calls the selectOption method
		selectOption (num);
	}
	//A method that prints information to the user
	public static void displaymanu () {
		System.out.println("Welcome to the Geometry Calculator Application ");
		System.out.println("Calculate the area of Circle");
		System.out.println("Calculate the area of Rectangle");
		System.out.println("Calculate the area of Triangle");
	
	}
	//Method that calculate the area of the circle
	public static double Circle () {
		System.out.println("Enter radius?");
		Scanner in = new Scanner (System.in);
		double radius = in.nextDouble();
		//Calculate
		double CArea = radius * (Math.PI);
		// returns the area of the circle
		return CArea;	
	}
	//Method that calculate the area of the rectangle
	public static double Rectangle () {
		System.out.println("Enter length?");
		Scanner in = new Scanner (System.in);
		//saves the length variable
		double length = in.nextDouble();
		
		System.out.println("Enter width?");
		//saves the width variable
		double width = in.nextDouble();
		//Calculate
		double RArea = length * width;
		// returns the area of the rectangle
		return RArea;
		
	}
	// Method that calculate the area of the triangle
	public static double Triangle () {
		System.out.println("Enter base?");
		Scanner in = new Scanner (System.in);
		//saves the base variable
		double base = in.nextDouble();
		
		System.out.println("Enter hight?");
		//saves the height variable
		double hight = in.nextDouble();
		
		//Calculate 
		double TArea = (base * hight) * 1/2;
		// returns the area of the Triangle
		return TArea;
		
		//A method that rounds the decimal point into two rounds
	} public static void PrintArea (double val) {
		System.out.printf("%.2f", val);
		
		//A method that choose which method to be executed
	} public static void selectOption (int option) {
		// checks the users input and execute the methods
		if (option == 1) {
//			Circle ();
			PrintArea (Circle());
		}else if (option == 2){
//			Rectangle ();
			PrintArea (Rectangle ());
		} else if(option == 3) {
//			Triangle ();
			PrintArea (Triangle ());
		}
		
		
	}
	
	

}
