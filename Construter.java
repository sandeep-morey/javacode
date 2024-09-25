package javapractice;

public class Construter {

	Construter() {
		System.out.println("Constructer");
	}

	public static void main(String args[]) {

		Construter c = new Construter();
		new Construter();
		new Construter();
		new Construter();

	}

}
