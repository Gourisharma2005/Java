//searching in array

package basicJava;

import java.util.Scanner;

public class Array {
	
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	int[]arr = {2,3,5,7,4,76,213,98,64};
	System.out.print("enter the number: ");
	int num = input.nextInt();
	boolean found = isFound(arr,num);
	if(found==true) {//Why Use if (found) Instead of if (found == true)? because if already expects a boolean expression.otherwise Both are functionally equivalent
		System.out.println("number is found");
	}
	else {
		System.out.println("number is not found");
	}
	input.close();
}

public static boolean isFound(int[] arr,int num) {//used boolean as we can either found the number or not found it
	int index = 0;
	while(index<arr.length) {
		if(arr[index]==num) {
			return true;
		}
		index++;
	}
	return false;
}

}
