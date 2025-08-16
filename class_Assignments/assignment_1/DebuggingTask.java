import java.util.Arrays;
public class DebuggingTask 
{


	public static void main  (String [] args)
	{
		int num = 20 ;
		System.out.println("The number is :" + num);
		
		String message = "Debugging in Java is fun " ;
		System.out.println(message);

		int[] values = new int[7]; 
		values[6] = 15;
		System.out.println("values array : "+ Arrays.toString(values));   
		
		/*Array.toString print the array in human readable 
		structure it does not actually convert elements of array to strings */


		double result = (double) (10-5)/2;
		System.out.println("Calculation Result : " + result);


		try
		{
			int division = 100 / 0;
			System.out.println("Division Result : "+ division);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Error can not divide a number by zero");
		}
	}
}
				