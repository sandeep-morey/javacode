package javapractice;

import java.util.Scanner;

public class Ifelseconditionalstatments 
{

	public static void main(String[] args) 
	{

		int age = 10;
		Scanner s1 = new Scanner(System.in);
		int ag = s1.nextInt();
		System.out.println(ag);

		if (age >= 18) {
			System.out.println("you are eligible to vote");

		} else {
			System.out.println("not eligible to vote");
		}

	}
}
