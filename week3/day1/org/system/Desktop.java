package org.system;

public class Desktop extends Computer{
	//Methods   :desktopSize()
	public void desktopSize() {
		System.out.println("The Desktop Size is 15.6inch");
	}
	public static void main(String[] args) {
		
		//call all your class methods into the Desktop using single inheritance
		Desktop D = new Desktop();
		D.desktopSize();
		D.computerModel();
	}

}


