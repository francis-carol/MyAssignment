package week1.day2;

public class LearnConstructor {
	
	public LearnConstructor(String name) {
		System.out.println("Received a name " + name );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnConstructor obj = new LearnConstructor("TestLeaf");
		System.err.println(obj);

	}

}
