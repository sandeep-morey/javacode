package javapractice;

public class Assignment1staticmethod {

	public static void staticmethodaddition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("The addition of 2 number is =" + c);

	}

	public static void staticmethodsub() {
		System.out.println("Static method substraction");
		int a = 5;
		int b = 2;
		int c = a - b;
		System.out.println("The substraction of a and b =" + c);
	}

	public static void staticmethoddivision() {
		System.out.println("Static method division");
		int a = 10;
		int b = 5;
		int c = a / b;
		System.out.println("The division of A and B is=" + c);
	}

	public static void staticmethodmultiplication() {
		System.out.println("Static method multipication");
		int a = 10;
		int b = 10;
		int c = a * b;
		System.out.println("The mulitplication of 2 number is=" + c);

	}

	public static void staticmethodmoduls() {
		System.out.println("The modulus method");
		int a = 100;
		int b = 50;
		int c = a % b;
		System.out.println("The Modulus of 2 number is =" + c);

	}

	public static void main(String[] args) {
		System.out.println("This is the main method of the program");

		// Calling static method directly
		staticmethodaddition();
		// Calling static method using classname.
		Assignment1staticmethod.staticmethodaddition();
		// Calling static method using object name not recommended but possible

		Assignment1staticmethod st = new Assignment1staticmethod();
		st.staticmethodaddition();

		// Calling Other methods directly
		staticmethodsub();
		staticmethodmultiplication();
		staticmethoddivision();
		staticmethodmoduls();

	}
}
