import java.util.Scanner;
public class TypeCasting
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a floating point number : ");
		double floating_num = input.nextDouble();

		System.out.print("Enter an intiger : ");
		int intiger_num = input.nextInt();



		// performing explicit type casting
		int float_num = (int) floating_num;


/* variable floating_num is already defined in method main(String[])
   int floating_num= (int) floating_num;
   Hence we can not redefine a variable already define so here for typecasting 
   we should change the name of variable */


		System.out.println("After explicit type casting of floating point number : "+ float_num );


		// performing implicit type  casting 
		double sum = floating_num + intiger_num;
 
		System.out.println("After implicit type casting sum of numbers  : "+ sum  );

		



	}
}


//printf => round of the figure type casting truncate and do not round off figure