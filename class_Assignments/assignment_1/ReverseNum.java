import java.util.Scanner;
public class ReverseNum
{	
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in );
		System.out.print("Enter a five digit number");

		int num = input.nextInt();
		int reversed = 0;
		

		while (num > 0) 
		{

			int digit = num % 10 ;
			reversed = reversed * 10 + digit ;

			num = num /10;
		}
		
		System.out.println("reveresed of the given number is : " + reversed);
		input.close();
	}
}

