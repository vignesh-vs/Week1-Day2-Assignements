package week1.day2.assignments;

public class ArmstrongNumber {
	
	
public static void main(String[] args) {

		

		// Declare your input

		int input = 153;
		
				

			// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		
		int remainder, original, quotient, cal = 0;			

			// Assign input into variable original 

			original=input;		

			// Use loop to calculate: use while loop to set condition until the number greater than 0
while(original >0) {
	// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
	remainder = original%10;
	// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
	quotient = original/10;
	
	original=quotient;
	// Within loop: Add calculated with the cube of remainder & assign it to calculated
	cal= cal+(remainder*remainder*remainder);
}
//Check whether calculated and original are same
		if(input==cal) {
			
			//When it matches print it as Armstrong number
			System.out.println("This is Armstrong Number....");
		}
		else {
			
			System.out.println("This is not a Armstrong Number");
		}

			

			

		

			

			

			
				

			

		

			

	



	}

}
