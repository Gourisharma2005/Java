package basicJava;
import java.util.Scanner;
public class SumOfIntegerCh31 {
   public static void main(String[]args) {
	   int num = inputNum();
	   int sum = sum(num);
	   System.out.println("sum is "+sum);
   }
   public static int inputNum() {
	   Scanner input = new Scanner(System.in);
	   System.out.print("enter number : ");
	   int num = input.nextInt();
	   input.close();
	   return num;
   }
   public static int  sum(int num) {
	   int sum = 0;
	   while(num>0) {
		   int ld = num%10;
		   sum+=ld;
		   num /=10;
	   }
	   return sum;
   }
}
