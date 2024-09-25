package javapractice;

import java.util.Scanner;

public class SwitchCaseprogram {
	public static void main(String[] args) {
		System.out.println("Enter the scanner value");
		Scanner s1 = new Scanner(System.in);
		int input = s1.nextInt();
		switch (input) {
		case 1:
			System.out.println("Launch Chrome browser");
			break;
		case 2:
			System.out.println("Launching Safari Browser");
			break;
		case 3:
			System.out.println("Launching Firefox Browser");
			break;
		case 4:
			System.out.println("Launching microsftedge Browser");
			break;
		case 5:
			System.out.println("Launching UC Browser");
			break;
		default:
			System.out.println("default value");
			s1.close();
		}
	}

}
