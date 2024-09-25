package javapractice;

public class NonStaticMethod {

	public static void add() {
		System.out.println("Static in nature");
	}

	public static void sub() {
		System.out.println("Subtraction of 2 number");
	}

	public void addition() {
		System.out.println("addition of  2 numers");
	}

	public void run() {
		System.out.println("substration method");
	}

	public void div() {
		System.out.println("division method");

	}

	public static void main(String[] args) {
		NonStaticMethod n1 = new NonStaticMethod();
		n1.addition();
		NonStaticMethod.add();
		sub();
		System.out.println("my main method");

	}

}
