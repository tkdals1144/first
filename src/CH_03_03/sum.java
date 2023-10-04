package CH_03_03;
import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int a = sc.nextInt();
		
		for (int i = 1; i <= a; i++) {
			num += i;
		}
		System.out.println(num);
	}
}
