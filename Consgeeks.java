package javapractice;

public class Consgeeks {

	String name;
	int id;

	Consgeeks(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public static void main(String[] args) {

		Consgeeks cn = new Consgeeks("Sandeep", 50);
		System.out.println("Name :" + cn.name + "and id:" + cn.id);

	}
}
