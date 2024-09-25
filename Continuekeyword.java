package javapractice;

public class Continuekeyword {
	public static void main(String[] args) {
		System.out.println("continue keyword");

		for (int i = 10; i <= 100; i++) {
			if (i == 99) {
				continue;
			}

			if (i == 50) {
				continue;
			}
			System.out.println(i);
		}

	}
}
