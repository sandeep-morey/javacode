package javapractice;

public class Constructeroverloading {

	Constructeroverloading() {
		System.out.println("Defalut constructer");
	}

	Constructeroverloading(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	Constructeroverloading(int a, int b, String sandeep) {
		int c = a * b;
		System.out.println(c);
		System.out.println("sandy");

	}

	public static void main(String[] args) {

		Constructeroverloading ob = new Constructeroverloading();
		System.out.println(ob);
		new Constructeroverloading(20, 30);
		new Constructeroverloading(10, 2, "rp");
		
		

	}

}
