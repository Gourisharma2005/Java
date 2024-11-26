//create a program that takes two numbers and shows result of all arithmetic operators

package basicJava;

import java.util.Scanner;
public class ArithmeticOperatorsCalculator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the numbers");
        System.out.print("eneter first number: ");
        int num1 = input.nextInt();
        System.out.print("eneter second number: ");
        int num2 = input.nextInt();

        System.out.println("Addition is = " +(num1+num2));
        System.out.println("Subtraction is = " + (num1 - num2));
        System.out.println("Multiplication is = "+(num1*num2));
        System.out.println("Division is = "+(num1/num2));
        
        input.close();
    }
}