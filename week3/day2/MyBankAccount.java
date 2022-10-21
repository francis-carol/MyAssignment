package week3.day2;

public class MyBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc = new HDFC();
		hdfc.provideCreditCard("HDFC Credit Card");
		hdfc.provideDreditCard("HDFC Debit Card");
		hdfc.minimumBlance(12345);
		
		//Scope restriction of object
		RBI rbi = new HDFC();
		rbi.provideCreditCard();
		rbi.provideDreditCard(null);
		rbi.minimumBlance(0);
		

	}

}
