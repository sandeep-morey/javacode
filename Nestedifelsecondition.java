package javapractice;

public class Nestedifelsecondition 
{
	public static void main(String[] args) 
	{
		System.out.println("nested if else condition block execution");
		int age=40;
		String gender1="MALE";
		String gender2="FEMALE";
		
		if(gender1=="FEMALE")
		{
			if(age>12)
			{
				System.out.println("Adult fare");
			}
			else
			{
				System.out.println("HALF ticket");
			}
		}
		else
		{
			System.out.println("it's free for FEMALE");
		}
		
	}
}
