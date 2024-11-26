package basicJava;

import java.util.Scanner;

public class AddFunction {
     public static void main(String[]args) {
    	 int first = readNumber();
    	 int second = readNumber();
    	 int res = Add( first ,  second);
    	 System.out.println("sum is = "+ res);
    	  }
     
    public static int readNumber() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("please enter the number : ");
    	int num = input.nextInt();
    	input.close();
    	return num;
    	}
    
    public static int Add(int a , int b) {
    	int sum = a + b;
    	return sum;
    }
    
}
