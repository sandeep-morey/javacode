package javapractice;

public class Globalvariablesusingarithmaticoperaters {
	// Global Variables.

	static int x = 100;
	static int y = 200;

	static void addition() {
		int sum = x + y;
		System.out.println("addition method");
		System.out.println("The addition of two number is------------>" + sum);
	}

	static void substraction() {
		System.out.println("Substraction Method");
		int sub = x - y;
		System.out.println(sub);
	}

	static void multiplication() {
		System.out.println("Multiplicaion Method");
		int mul = x * y;
		System.out.println(mul);
	}

	static void division() {
		System.out.println("Division method");
		int div = x / y;
		System.out.println(div);
	}

	static void modulus() {
		System.out.println("Modulus method");
		int mod = x % y;
		System.out.println(mod);
	}

	public static void main(String args[]) {
		System.out.println("Main method");
		// Globalvariablesusingarithmaticoperaters obj = new
		// Globalvariablesusingarithmaticoperaters();
		addition();
		substraction();
		multiplication();
		division();
		modulus();
	}
}