//create a program to sum all odd numbers from 1 to a specifies number N

package basicJava;

import java.util.Scanner;

public class OddSum {
//	public static void main(String[]args) {
//		Scanner input = new Scanner(System.in); 
//		System.out.println("enter your number = ");
//		int num = input.nextInt();
//		int i =1;
//		int sum = 0;
//		while(i<=num) {
//			if(num%2!=0) {
//			 sum = i+sum;}
//			i++;
//	}
//		System.out.println("sum is = "+sum);
//}
	
	public static void main(String[]args) {
		int num = readNumber();
		int res = oddSum(num);
		System.out.println("sum is = "+res);
	}
	
	public static int readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter your number = ");
		int value = input.nextInt();
		input.close();
		return value;
	}
	
	public static int oddSum(int num) {
		int i = 1;
		int sum = 0;
		while(i<=num) {
			sum = i+sum;
			i+=2;
			
		}
		return sum;
		
	}
}
