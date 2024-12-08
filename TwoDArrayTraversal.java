//traversal of 2D array

package basicJava;

public class TwoDArrayTraversal {
public static void main(String[]args) {
	int[][] myarr =  {{1,2},{3,4}};
	
	int i = 0;
	
	while(i<myarr.length) {
		int j=0;
		while(j<myarr[i].length) {
			System.out.print(myarr[i][j]+" ");
			j++;
		}
		i++;
		System.out.println();
	}
}
}
