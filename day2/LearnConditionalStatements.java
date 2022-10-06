package week1.day2;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 4;
		
		if(age>=18) {
			System.err.println("Eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
		
		System.out.println("------------------");
		
		int mark = 35;
		
		if (mark>=80) {
			System.out.println("First class");
		}
		else if(mark>=60) {
			System.out.println("second calss");
		
		}
		else if (mark>=35) {
			System.out.println("average");
			
		}else {
			System.out.println("fail");
		}

	}

}
