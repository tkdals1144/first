package CH_03_10;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			int t = a - i;
			if (t == 0) {
				for (int k = 0; k < a; k++) System.out.print("*");
			}
			for (; t > 0; t--) {
				System.out.print(" ");
				if (t == 1) {
					for (int j = 1; j <= i; j++) System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
