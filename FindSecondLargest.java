package week1.day2.assignments;

import java.util.Arrays;



public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				
		
				int noOfData=data.length;
				Arrays.sort(data);
				
				for (int i=0; i< noOfData ; i++);
				System.out.println(data[data.length-2]);
					


	}

}
