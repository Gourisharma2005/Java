package basicJava;

import java.util.Scanner;
public class TakingInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter your name :");
		String name = input.nextLine();
		System.out.println("hello "+name);
		System.out.print(name+" also,tell me your age");
		int age = input.nextInt();
		System.out.print("age is "+age);
		
              input.close();
	}

}