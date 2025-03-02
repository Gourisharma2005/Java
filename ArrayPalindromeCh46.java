package basicJava;
import java.util.Scanner;
public class ArrayPalindromeCh46 {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] nums = inputArray(input);
	if(isPalindrome(nums)) {
		System.out.println("it is palindrome");
	}
	else {
		System.out.println("it is not palindrome");
	}
	input.close();
}
 public static int[] inputArray(Scanner sc) {
	 System.out.print("enter the number of elements = ");
	 int size = sc.nextInt();
	 int[] arr = new int[size];
	 for(int i=0;i<arr.length;i++) {
		  System.out.print("enter the number "+(i+1)+" = ");
		  arr[i] = sc.nextInt();
	  }
	 return arr;
 }
 public static boolean isPalindrome(int[] nums) {
	 for(int i=0;i<nums.length/2;i++) {
		 if(nums[i] !=nums[(nums.length-1)-i]) {
			 return false;
		 }
	 }
	 return true;
 }
 
}
