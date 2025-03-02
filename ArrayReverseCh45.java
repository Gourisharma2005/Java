package basicJava;
import java.util.Scanner;
public class ArrayReverseCh45 {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] nums = inputArray(input);
	reverse(nums);
	display(nums);
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
  public static void reverse(int[] nums) {
	  for(int i=0;i<nums.length/2;i++) {
		  int swap = nums[i];
		  nums[i] = nums[(nums.length-1)-i];
	  }
  }
 public static void display(int[] nums) {
	  for(int i=0;i<nums.length;i++) {
		  System.out.print(nums[i]);
	  }
  }
}
