//create a program to swap two numbers
package basicJava;
import java.util.Scanner;
public class Swap {
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.print("enter first number: ");
	int firstnum = input.nextInt();
	System.out.print("enter second number: ");
	int secondnum = input.nextInt();
	int swap = firstnum;
	firstnum = secondnum;
	secondnum = swap;
	System.out.println("SWAPPED NUMBERS");
	System.out.print("first number is : "+firstnum +"  and  second number is : "+ secondnum);
	}
}
