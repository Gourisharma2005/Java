//create a program to calculate perimeter of a rectangle

package basicJava;

import java.util.Scanner;

public class PerimeterRectangle {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.println("please enter the sides");
	        System.out.print("eneter first side: ");
	        int side1 = input.nextInt();
	        System.out.print("eneter second side: ");
	        int side2 = input.nextInt();
	        System.out.print("eneter third side: ");
	        int side3 = input.nextInt();
	        System.out.print("eneter fourth side: ");
	        int side4 = input.nextInt();
	        
	        int perimeter  = side1+side2+side3+side4;
	        
	        System.out.println("Perimeter is : "+perimeter);
	        
	        input.close();
	        
	}
}
