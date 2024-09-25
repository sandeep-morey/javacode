package javapractice;

public class ForPractice {

	public void forlooppractice() {
		System.out.println("This is for for loop practice");

		int Pricevalues[] = { 10, 20, 30 };
		int total =0;
		
		for(int i=0; i<Pricevalues.length;i++)
		{
			System.out.println(i);
			total += Pricevalues[i];
			
		}
		System.out.println("Total price is " +total );

	}

	public static void main(String[] args) {

		ForPractice obj = new ForPractice();
		obj.forlooppractice();

	}

}
