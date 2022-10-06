package week1.day2;

public class Car {
	
	public void printCarname() {
		
		System.out.println("BMW");
	
	}
	
	public short getRegNumber () {
		short RegNumber = 4555;
		return RegNumber;
	}
	
	public String getColor() {
		String CarColor = "RED";
		return CarColor;
	}
	
	public boolean isCarPuncture() {
		boolean puncture = false;
		return puncture;
	}
	
	public  int addThreeNumbers(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		return sum;
		
	}
	
	private  int subtractTwoNumbers(int num1, int num2) {
		int sub = num1-num2;
		return sub;		
		
	}
	  float multiplyThreetNumbers(float num1, float num2, float num3) {
		float multiply = num1*num2*num3;
		return multiply;		
		
	}
	
	public  int divideTwoNumbers(int num1, int num2) {
		int div = num1/num2;
		return div;		
		
	}
	
	public static void main(String[] args) {
		
	Car key = new Car();
	key.printCarname();
	short carNumber = key.getRegNumber();
	System.out.println(carNumber);
	
	String carColor = key.getColor();
	System.out.println(carColor);

	boolean tireStatus = key.isCarPuncture();
	System.out.println(tireStatus);
	
	int add = key.addThreeNumbers(3, 4, 10);
	System.out.println(add);
	
	float multi = key.multiplyThreetNumbers(23425.6426F,3425.6426F, 425.6426F);
	System.out.println(multi);
	
	int minus = key.subtractTwoNumbers(5, 4);
	System.out.println(minus);
	
	int reminder = key.divideTwoNumbers(5, 2);
	System.out.println(reminder);
	
	}
}



