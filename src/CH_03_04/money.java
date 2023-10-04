package CH_03_04;
import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			a = a - (price * num);
		}
		if (a == 0) System.out.println("Yes");
		else System.out.println("No");
	}
}
