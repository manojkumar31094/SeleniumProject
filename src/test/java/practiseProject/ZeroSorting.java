package practiseProject;

import java.util.Arrays;

public class ZeroSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {0, 1, 0, 3, 12, 0, 5};
	        int nonZeroIndex = 0; // Pointer to track the position of the next non-zero element
	        
	        // Move all non-zero elements to the front
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                // Swap current element with nonZeroIndex
	                int temp = arr[i];
	                arr[i] = arr[nonZeroIndex];
	                arr[nonZeroIndex] = temp;
	                
	                nonZeroIndex++; // Move forward
	            }
	        }
	        
	        System.out.println(Arrays.toString(arr));
	       // System.out.println(arr);

	}

}
