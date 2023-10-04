package CH_03_05;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int value = sc.nextInt();
		value = value/4;
		for (int i = 0; i < value; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
