//to find the maximum and minimum element in an array?

package basicJava;

import java.util.Scanner;

public class ArrayMaxAndMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter number of elements = ");
		int size = input.nextInt();
		int[] arr = new int[size];
		int i = 0;
		while(i<arr.length) {
			System.out.print("enter element "+(i+1)+": ");
			arr[i] = input.nextInt();
			i++;
		}
		input.close();
		int max = max(arr);
		System.out.println("maximum number is "+max);
		int min = min(arr);
		System.out.println("minimum number is "+min);
}
	public static int max(int[] arr) {
		if(arr.length==0) {
			return Integer.MIN_VALUE;//ELSE IT WILL GIVE ARRAY OUT OF BOUND EXCEPTION
		}
		int max = arr[0];
		int i =0;
		while(i<arr.length) {
			if(arr[i]>max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}
	public static int min(int[] arr) {
		int min = arr[0];
		int i =0;
		while(i<arr.length) {//here not required to check because 
			if(arr[i]<min) {    //i is 0 so it will not go inside the loop
				min = arr[i];
			}
			i++;
		}
		return min;
	}
}
