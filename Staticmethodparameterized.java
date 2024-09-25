package javapractice;

public class Staticmethodparameterized {

	public static void parameterized(int a, double d, String str) {
		System.out.println("static parameterized constructor");
		byte a1 = (byte) 180;

	}

	public static void main(String[] args) {
		Staticmethodparameterized.parameterized(10, 23.80, "sandeep");
		System.out.println();
		System.out.println("Main method execution");

	}

}
