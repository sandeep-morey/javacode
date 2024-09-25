package javapractice;

import java.util.Scanner;

public class Scannerclassmethods {

	public static void main(String args[]) {

		System.out.println("Main Method");
		System.out.println("Enter the value");

		Scanner s1 = new Scanner(System.in);

		String fname = s1.next();

		System.out.println(fname);

		System.out.println("Are you graduate?");

		boolean b = s1.nextBoolean();
		System.out.println("Enter the value of byte");
		byte b2 = s1.nextByte();
		s1.close();

		String a = "sandeep";
		System.out.println("sandeep");

	}
}
