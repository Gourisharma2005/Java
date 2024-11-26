package basicJava;

import java.util.Scanner;
public class AddTwoNum {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("enter first number : ");
		int num1 = num.nextInt();
		System.out.print("enter second number : ");
		int num2 = num.nextInt();
		int sum = num1 + num2;
		System.out.print("result is :"+sum);

	num.close();
	}	
}
