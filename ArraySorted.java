package basicJava;
import java.util.Scanner;
public class ArraySorted {
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
		boolean ascendingSorted = isAscendingSorted(arr);
		boolean decendingSorted = isDecendingSorted(arr);
		if(ascendingSorted || decendingSorted) {
			System.out.println("it is  Sorted");
		}
		else System.out.println("it is not Sorted");
}
	public static boolean isAscendingSorted(int[] arr) {
		int i=1;//as we are using i-1 and below 0 index is not valid
		while(i<arr.length) {
			if(arr[i-1]>arr[i]) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static boolean isDecendingSorted(int[] arr) {
		int i=1;
		while(i<arr.length) {
			if(arr[i-1]<arr[i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}
