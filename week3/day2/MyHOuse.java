package week3.day2;

public class MyHOuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Land land = new Land();
		land.buildGroundFloor("Estancia");
		land.buildGarden();
		
		//Scope restriction of object
		HousePlan land1 = new Land();
		land1.buildGroundFloor(null);
		land1.buildGarden();

	}

}
