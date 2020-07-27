package week2;

public class MinMaxInArray 
{

	public int max(int[] array)
	{
		int max = array[0];
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]>max);
			max = array[i];
		}
		
		return max;
	}
	
	
	public int min(int[] array)
	{
		int min = array[0];
		
		for(int i=0; i<array.length; i++)
		{
			if(array[i]<min);
			min = array[i];
		}
		
		return min;
	}
	
	
	public static void main(String[] args) 
	{
		int myArray[] = {700,100,10,6000};
		
		MinMaxInArray m = new MinMaxInArray();
	      
		System.out.println("Maximum value in the array = "+m.max(myArray));
	      
		System.out.println("Minimum value in the array = "+m.min(myArray));

	}

}
