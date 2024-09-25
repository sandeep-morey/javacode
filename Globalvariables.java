package javapractice;

public class Globalvariables {
	int a = 10;
	int b = 20;
	int c = a + b;
	static double pi;
	static String sandeep;
	
	
	//Static and non static.
	
	static int a1 =100;
	int x=100;
	
	public void global() 
	{
		
		System.out.println("Global Variables concepts");
		System.out.println(c);
	}

	public static void main(String args[]) {
		
		int x=100;
		
		sandeep = "kumar";
		System.out.println(sandeep);
		pi = 2222.00;
		
		
		Globalvariables bb = new Globalvariables();
		bb.global();
		System.out.println(pi);
		System.out.println(sandeep);
	}

}
