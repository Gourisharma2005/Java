package basicJava;
import java.util.Scanner;
public class ArrDeleteCh44 {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] nums = inputArray(sc);
			System.out.print("enter the number you want to delete = ");
			int delete = sc.nextInt();
			int[] newArr = newArray(nums , delete);
			System.out.println("updated array is as follows -");
			 display(newArr);
			sc.close();
		}
		  public static int[] inputArray(Scanner sc) {
			  System.out.print("enter thr number of elements = ");
			  int size = sc.nextInt();
			  int[] arr = new int[size];
			  int i = 0;
			  while(i<arr.length) {
				  System.out.print("enter the number "+(i+1)+" = ");
				  arr[i] = sc.nextInt();
				  i++;
			  }
			  return arr;
		  }
		  public static int[] newArray(int[] nums , int delete) {
			  int occ = 0;
			  for(int i=0;i<nums.length;i++) {
				  if(nums[i]==delete) {
					  occ++;
				  }
			  }
			  if(occ==0) {
				  return nums;
			  }
			 int newSize = nums.length-occ;
			 int[] newArray = new int[newSize];  
			 int j = 0;
			 
			 for(int i=0;i<nums.length;i++) {
				 if(nums[i]!=delete) {
					 newArray[j] = nums[i];
					 j++;
				 }
			 }
			  return newArray;
		  }
		  public static void display(int[] newArr) {
			  for(int i=0;i<newArr.length;i++) {
				  System.out.print(newArr[i]+" ");
			  }
		  }
}
