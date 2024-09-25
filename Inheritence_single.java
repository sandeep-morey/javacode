package javapractice;

public class Inheritence_single {

	public void run() {
		int x = 1;
		int y = 2;
		int z = x + y;
		System.out.println(z);
	}

	public class Secondclass extends Inheritence_single {

	}

	public static void main(String[] args) {

		System.out.println("Single inheritence");

		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println(c);

	}
}
