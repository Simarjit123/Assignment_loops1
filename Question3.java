
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		int count = 0, number;
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		for (int i = 1; i <= number / 2; i++) {
			if (number % 2 == 0) {
				count++;
				break;

			}
		}
		{
			if (count == 0) {
				System.out.println("It is a Prime Number.");
			} else
				System.out.println("It is not a Prime Number.");
		}
	}
}