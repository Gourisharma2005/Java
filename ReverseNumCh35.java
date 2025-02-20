package basicJava;
import java.util.Scanner;
public class ReverseNumCh35 {
  public static void main(String[] args) {
	  int num = inputNum();
	  int reverse = reverseNum(num);
	  System.out.println("reverse is "+reverse);
}
  public static int inputNum() {
	   Scanner input = new Scanner(System.in);
	   System.out.print("enter number : ");
	   int num = input.nextInt();
	   input.close();
	   return num;
  }
  public static int reverseNum(int num) {
	  int reverse =0;
	  while(num>0) {
		  int ld = num%10;
		  num /=10;
		   reverse = reverse * 10 + ld;;
	  }
	  return reverse;
  }
}
