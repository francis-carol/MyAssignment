package week1.day2;
/*
 * Goal: Find the sum of digits of a given number
 * 
 * input: 123
 * output: 1+2+3 = 6
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
 *   
 * What are my learnings from this code?
 * 1)
 * 2)
 * 3) 
 * 
 */
public class SumOfDigits {
	// Declare your input number (int)
			
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc= 587638;
		int sum=0;
		while(abc>0)
		{
			int remainder=abc%10;
			
			sum = sum+remainder;
			
			abc = abc/10;
		}
		System.out.println("The Sum of digits is "+sum);

	}

}
