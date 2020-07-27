package week1;

public class NumberReverse 
{

	public static void main(String[] args)
	{
		int num = 123;
		int reversed = 0;

        while(num != 0) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }
        
        System.out.println("Reversed Number: " + reversed);
	}

}
