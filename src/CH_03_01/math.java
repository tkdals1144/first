package CH_03_01;
import java.util.Scanner;

public class math {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하시오.");
		int a = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}
}
