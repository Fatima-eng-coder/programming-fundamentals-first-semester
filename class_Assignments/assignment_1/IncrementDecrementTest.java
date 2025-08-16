public class IncrementDecrementTest {
	public static void main(String[] args) {
		int a = 5, b = 10;
		int result1 = a++ + ++b;
		int result2 = --a + b--;
		int result3 = a-- + ++b;
		System.out.println("Result 1: "+ result1);
		System.out.println("Result 2: " + result2);
		System.out.println("Result 3: "+ result3);
		System.out.println("Final values - a: "+  a  + ", b: " + b);
	}

}
