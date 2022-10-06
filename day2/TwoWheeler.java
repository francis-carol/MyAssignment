package week1.day2;

//Create a class for TwoWheeler and declare below global variables with appropriate values
//int noOfWheels
//short noOfMirrors
//long chassisNumber
//boolean isPunctured
//String bikeName
//double runningKM
//create object for TwoWheeler and call all the variables inside main method and print the values.

public class TwoWheeler {
	
	public  int noOfWheels(){
		int wheel = 2;
		return wheel;
		

	}
	
	public short noOfMirrors() {
		short mirror = 2;
		return mirror;
	}
	
	public long chassisNumber() {
		
		long chasis = 9876543210L;
		
		return chasis;
		
	}
	
	public boolean isPunctured() {
		boolean puncture = false;
		return puncture;
	}
	
	public String bikeName() {
		String brand = "Yamaha 250";
		return brand;
	}
	
	public double runningKM() {
		double speedometer = 942857249578.24897234859;
		return speedometer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler wheeler = new TwoWheeler();
		int wheelcount = wheeler.noOfWheels();
		System.out.println(wheelcount);
		
		short mirrorcount = wheeler.noOfMirrors();
		System.out.println(mirrorcount);
		
		long number = wheeler.chassisNumber();
		System.out.println(number);
		
		boolean tire = wheeler.isPunctured();
		System.out.println(tire);
		
		String model = wheeler.bikeName();
		System.out.println(model);
		
		double KM = wheeler.runningKM();
		System.out.println(KM);
	}

}
