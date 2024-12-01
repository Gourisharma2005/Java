//create a program to calculate product of two floating points numbers

package basicJava;

import java.util.Scanner;


public class FloatProduct {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.println("please enter the numbers");
	        System.out.print("eneter first number: ");
	        double num1 = input.nextDouble();
	        System.out.print("eneter second number: ");
	        double num2 = input.nextDouble();
	        
	        System.out.println("Multiplication is = "+(num1*num2));
	        
	        input.close();
	}

}

