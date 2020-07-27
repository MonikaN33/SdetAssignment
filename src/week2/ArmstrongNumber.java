package week2;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		int num = 153;
		int j = 0;
		int k = num;
		
		while(num!=0)
		{
			j = j + (num%10)*(num%10)*(num%10);
			num = num/10;
		}
		
		if(j==k)
			System.out.println(k + " is armstrong number");
		else
			System.out.println(k + " is not an armstrong number");

	}

}
