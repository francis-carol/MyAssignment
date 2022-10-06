package week1.day2;
/*
 * Goal: To find whether a number is a Prime number or not
 * 
 * input: 13
 * output: 13 is a Prime Number
 * 
 * Shortcuts:
 * 1) Print : type: syso, followed by: ctrl + space + enter
 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
 *   
 * What are my learnings from this code?
 * 1)
 * 2)
 * 3) 
 * 
 */
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 7;
		int j;
		boolean flag = false;
		for (int i = 2; i<input;i++ )
		{
			j= input%i;
			
					if(j==0) {
						flag = true;
				
					}
		}		
					if(flag==false) {
				System.out.println("Prime Number");		
			
		}else
			System.out.println("Not a prime Number");				
			
			}
	}


