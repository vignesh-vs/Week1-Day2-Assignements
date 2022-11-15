package week1.day2.assignments;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
	
		int number = -40;
		
		if (number <0) {
			number=number*(-1);
			System.out.println("The input number is converted to positive : " + number);
		}
		
		else  {
			
			System.out.println("The input number is not covereted since its positive.." +number);
		}
		}

	}


