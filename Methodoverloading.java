package javapractice;

public class Methodoverloading {

	public static void run() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("The addition of 2 number is ----->" + sum);

	}

	public static void run(int a, int b, String str) {
		System.out.println("parameterized method");
		int c = a + b;
		String z = str;
		System.out.println("The addition of the a + B ===.....>" + c);
		System.out.println("The string of the z===>" + str);
	}

	public static void run(double d, char a) {

		System.out.println("double parameterized method");
		System.out.println(d);
		System.out.println(a);

	}

	// instance method.

	public void run(float x, int a) {
		System.out.println("instance method");
		float f = x;
		System.out.println(x);
		int i = a;
		System.out.println(i);
	}

	public static void main(String args[]) {
		run();
		Methodoverloading obj = new Methodoverloading();
		run(10, 20, "sandeep");
		run(20.00, 'R');
		obj.run(23.00f, 23);

	}
}