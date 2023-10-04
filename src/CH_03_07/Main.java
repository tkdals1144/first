package CH_03_07;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []list = new int[a];
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			list[i] = b + c;
		}
		for (int i = 1; i <= a; i++) {
			System.out.println("Case #" + i + ": " + list[i-1]);
		}
	}
}
