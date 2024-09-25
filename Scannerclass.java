package javapractice;

import java.util.Scanner;

public class Scannerclass {

	public void scannerclassmethod() {
		
		System.out.println("Scanner class method practice");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int s2 = s1.nextInt();
		System.out.println("Enter the value of B");
		int s3 = s1.nextInt();
		System.out.println(s3);
		int sum = s2 + s3;
		System.out.println("The addition of two number is ===" + sum);
	}

	public static void main(String[] args) {

		Scannerclass sc = new Scannerclass();
		sc.scannerclassmethod();
	}
}