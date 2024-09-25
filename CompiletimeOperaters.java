package javapractice;

public class CompiletimeOperaters {
	public static void run() {
		int a = 100;
		int b = 200;
		int sum = a + b;
		System.out.println("Sume of 2 number is=====> " + sum);

	}

	public void substraction(int a, int b) {
		int sub = a - b;
		System.out.println("sub");

	}

	public static void mulitplication() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println(c);
	}

	public void modulus() {
		int x = 102;
		int y = 20;
		int z = x % y;
		System.out.println("modulus operater value is =====>" + z);

	}

	public static void main(String[] args) {
		System.out.println("compile time variables");
		run();
		CompiletimeOperaters obj = new CompiletimeOperaters();
		obj.substraction(10, 20);
		mulitplication();
		obj.modulus();

	}
}
