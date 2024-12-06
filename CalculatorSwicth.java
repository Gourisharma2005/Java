package basicJava;

import java.util.Scanner;

public class CalculatorSwicth {
	
	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	CalculatorSwicth ternary = new CalculatorSwicth();
	int num1 = ternary.takingInput();
	int num2 = ternary.takingInput();
	char operation = ternary.takingOperation();
	int res = ternary.Calculator(num1,num2,operation);
	System.out.println(res);
	  input.close();
	}
	
	public int takingInput() {
		System.out.print("enter number = ");
		int number = input.nextInt();
		return number;
	}
	
	public char takingOperation() {
     System.out.print("Enter operation (+, -, *, /): ");
     char operation = input.next().charAt(0);
	 return operation;
	}
	
	
	public int Calculator(int num1,int num2,char operation) {
		return switch(operation) {
		 case '+' -> num1 + num2;
         case '-' -> num1 - num2;
         case '*' -> num1 * num2;
         case '/' -> num1 / num2;
		default -> 0;
		};
	}
}
