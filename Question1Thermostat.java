import java.util.Scanner;

public class Question1Thermostat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter desired temperature");
		int temperature = sc.nextInt();
		System.out.println("Temperature is set to:" + temperature);
	}
}