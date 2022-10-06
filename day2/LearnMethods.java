package week1.day2;

public class LearnMethods {
	
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.printMyName();
		String output = obj.getMyName();
		System.out.println(output);
		int add = obj.addTwoNumbers(7, 8);
		System.out.println(add);
		
	}
	
	public void printMyName() {
		
		System.out.println("1. CarolTestleaf");
	
	}
	
	private String getMyName() {
		String name = "2. Carol Testleaf";
		return name;
	}
	
	 int addTwoNumbers(int num1, int num2) {
		int sum = num1+num2;
		return sum;
			
	}
	
	
	}



