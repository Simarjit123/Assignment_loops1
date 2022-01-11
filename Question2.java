import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input value of water adding
		System.out.println("INPUT VAlues for tank");
		int maxvol = sc.nextInt();
		// while loop to fill water upto 100litres only
		while (maxvol <= 100) {
			System.out.println("Water tank is filled with water of litre:" + maxvol);
			maxvol++;
			break;
		}
		if (maxvol >= 90) {
			System.out.println("Tank is overflowing");
		} else
			System.out.println("Fill more water");
	}
}
