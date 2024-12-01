//write a function that calculates the factorial of a given number

package basicJava;

import java.util.Scanner;

public class Factorial {
public static void main(String[]args) {
	int num = readNumber();
	long ans = factorialCalculate(num);
	System.out.println("factorial of "+num+" is "+ans);
}

public static int readNumber() {
	Scanner input = new Scanner(System.in);
	System.out.print("please enter your number = ");
	int value = input.nextInt();
	input.close();
	return value;
	}

public static long factorialCalculate(int num) {//long as factorial is a larger value
	int i = 1;
	int fact = 1;
	while(i<=num) {
		fact *=i;
		i++;
	}
	return fact;
}
}
