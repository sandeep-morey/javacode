package javapractice;

public class Forlooprealtimeexample {

	public static void main(String[] args) {
		double[] Orderamount = { 10.0, 20.0, 30.0 };

		for (int i = 0; i < Orderamount.length; i++) {
			//System.out.println("ORder amount =" + i);

			if (Orderamount[i] > 30) {
				double discount = Orderamount[i] * 1;
				double newtotal = Orderamount[i] - discount;
				System.out.println(
						"Order " + (i + 1) + ":Orginal Amount: $" + Orderamount[i] + ", discounted amout $" + newtotal);
			} else {
				System.out.println("Order" + (i + 1) + ": not discount applied, Amount $" + Orderamount[i]);
			}
		}

	}

}
