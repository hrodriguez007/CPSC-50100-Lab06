//Lab 2
//Exercise 1
import java.util.Scanner;

public class TimeComplexity {
	public static int cubic(int n) {
		int sum = 0;
		for (int j = 0; j < n; j++)
		{
			for(int k = 0; k < n; k++)
			{
				for(int l = 0; l < n; l++)
				{
					sum += j*k/(l +1);
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter an integer: ");
			int n = scanner.nextInt();
				System.out.println("Sum is: " + cubic(n));
			
			scanner.close();
	}

}
