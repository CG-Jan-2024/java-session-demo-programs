package arrays;

public class ArraysDemo {
	public static void main(String args[]) {
		int[] nums = new int[6];
		int element = 4;
		if(nums.length <= 6) {
			addElement(nums, element);
		}
		for(int eachNum: nums) {
			System.out.println(eachNum);
		}
	}
	
	public static int[] addElement(int[] myNum, int newNum) {
		for(int i=0; i<myNum.length;i++)
		{
			if(myNum[i]==0) {
				myNum[i] = newNum;
				break;
			}
		}
		
		return myNum;
	}
}
// time complexity
//	- to add an element at a particular index - constant complexity O(1)
//  - to delete an element at a particular index - constant complexity O(1)
//  - to delete a particuler element form the array - linear complexity O(n)
//	- to update a particular element based on index - constant complexity O(1)
//  - to update a particular element - linear complexity O(n)

