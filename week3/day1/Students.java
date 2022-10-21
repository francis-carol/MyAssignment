package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println(" The Sudent Id is " + id);
	}

	public void getStudentInfo(int id, String Name) {
		System.out.println("==========================");
		System.out.println("The Sudent Id is " + id);
		System.out.println("The Student Name is " + Name);
	}

	public void getStudentInfo(String Email, Long Phone) {
		System.out.println("==========================");
		System.out.println("The Student Email Address is " + Email);
		System.out.println("The Student Phone Number is " + Phone);

	}

	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(1008);
		info.getStudentInfo(1008, "Carol");
		info.getStudentInfo("franciscarol126@gmail.com", 2233445566L);

	}

}
