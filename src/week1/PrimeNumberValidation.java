package week1;

public class PrimeNumberValidation 
{

	public static void main(String[] args)
	{
		int num = 13;
		boolean isPrime = true;
		int rem;
		
		for (int i = 2; i <= num/2; i++)
		{
			rem = num%i;
			
			if(rem == 0)
            {
                isPrime = false;
                break;
            }
		}
		
		if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

	}

}
