//develop a program that prints the multiplication table for a given number

package basicJava;

import java.util.Scanner;

public class TableOfAnyNumber {
   public static void main(String[]args) {
	   Scanner value = new Scanner(System.in);
	   System.out.println("enter your number : ");
	   int num = value.nextInt();
	   int i=1;
	   System.out.println("table is as follws-");
//	   while( i<=10) {
//		  int table=i*num;
//		  System.out.println(num + " x " + i + " = " + table);
//		  i++;
//	   }
	   for(;i<=10;i++) {
		   int table=i*num;
			  System.out.println(num + " x " + i + " = " + table);
	   }
	   value.close();
   }
}
   

