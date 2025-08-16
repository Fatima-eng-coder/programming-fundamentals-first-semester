public class DebugExample
{

	public static int divide(int a , int b)
	{
		if (b==0)
		{
			System.out.println("Can not divide a number by zero");
			return (0);
		}
		return (a/b);
	}
	
	public static void main (String [] args)
	{
		double number = 10.5;
		System.out.println("Number is : "+ number);

		String message = "Hello, world !" ;
		System.out.println(message);

		int result = divide (10, 0); 
		System.out.println("Result : "+ result );
	}
}