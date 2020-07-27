package week2;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		int year = 2000;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					System.out.println("True");
				else
					System.out.println("False");
			}
			else
				System.out.println("True");
		}
		else
			System.out.println("False");
		
		
	}

}
