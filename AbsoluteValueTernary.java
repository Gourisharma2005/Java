//to calculate the absolute value of a given integer

package basicJava;

import java.util.Scanner;

public class AbsoluteValueTernary {
	
	public static void main(String[] args) {
		int num = takingInput();
		int res = absoluteValue(num);
		System.out.println("absolute value is "+res);
	}

	public static int takingInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("enter number = ");
		int number = input.nextInt();
		input.close();
		return number;
	}
	
	public static int absoluteValue(int num) {
		return num >=0  ?num:-num; 
	}
}
