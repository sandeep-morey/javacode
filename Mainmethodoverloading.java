package javapractice;

public class Mainmethodoverloading {

	public static void main(String[] args) {

		System.out.println("main method");

		main(20);
		main(20, 30.00);
		Mainmethodoverloading ob = new Mainmethodoverloading();
		System.out.println(ob);
	}

	public static void main(int b) {
		System.out.println("with argument list");

	}

	static void main(int a, double b) {
		System.out.println("Argument list with parameter");
	}

	public void main() {

		System.out.println("no argument");

	}
}
