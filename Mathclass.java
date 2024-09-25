package javapractice;

public class Mathclass {

	public static void main(String args[]) {

		Math.multiplyExact(10, 10);
		
		int sum = Math.addExact(10, 20);
		
		System.out.println(sum);

		System.out.println(Math.addExact(20, 30));
		
		double d = Math.sin(sum);
		
		System.out.println(d);

		System.out.println(Math.max(20.00, 30.00));
		
		System.out.println(Math.multiplyExact(10, 10));
		
		double d1 = Math.random();
		
		System.out.println(d1);

		for (int i = 1; i < 5; i++) {
			System.out.println(Math.random());
		}

	}

	Mathclass obj = new Mathclass();

}
