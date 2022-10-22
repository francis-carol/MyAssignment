package week3.day2;

public class Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleLanguage lang = new MultipleLanguage();
		System.out.println("***************************");
		lang.java();
		lang.javaScript();
		lang.python();
		lang.ruby();
		lang.selenium();
		lang.reactJs();

		System.out.println("***************************");
		// scope restriction of object
		Language lang1 = new MultipleLanguage();
		lang1.java();
		lang1.javaScript();
		lang1.ruby();

		System.out.println("***************************");
		// scope restriction of object
		TestTool testTool = new MultipleLanguage();
		testTool.selenium();

	}

}
