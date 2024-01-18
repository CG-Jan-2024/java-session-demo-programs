import java.util.Scanner;

public class TwoDimensionalDemo {

	public static void main(String[] args) {
		int[][] matrixA = new int[3][2];
		
		matrixA[0][0] = 3;
		matrixA[0][1] = 4;
		matrixA[1][0] = 2;
		matrixA[1][1] = 1;
		matrixA[2][0] = 6;
		matrixA[2][1] = 8;
		
		for(int i=0;i<matrixA.length;i++) {
			for(int j=0;j<matrixA[i].length;j++) {
				System.out.print(matrixA[i][j] + " ");
			}
		} 
		
		// irregular dimensional array - look into it
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int noOfEl = scan.nextInt();
		int[] elements = new int[noOfEl];
		for(int i=0; i<elements.length; i++) {
			System.out.println("enter the " + (i+1) + " element:");
			elements[i] = scan.nextInt();
		}
		
		for(int i=0; i<elements.length; i++) {
			System.out.println(elements[i] * elements[i] * elements[i]);
		}
		
		// Write a program to merge two arrays elements to store third array
		System.out.println("__________________________________________________");
		int[] arr1 = { 3,6,1,7,8 };
		int[] arr2 = { 6,2,4 };
		int[] arr3 = new int[arr1.length+arr2.length];
		for(int i=0; i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		for(int j=0, k=arr1.length; j<arr2.length; j++,k++) {
			arr3[k] = arr2[j];
		}
		for(int eachElement: arr3) {
			System.out.println(eachElement);
		}
	}

}
