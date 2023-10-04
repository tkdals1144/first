package CH_03_02;
import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개수를 입력하고 개수만큼 더할 값 두개를 입력하시오.");
		int a = sc.nextInt();
		int [] list = new int[a];
		for (int i = 0; i < a; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			list[i] = num1 + num2;
		}
		for (int i = 0; i < a; i++) {
			System.out.println(list[i]);
		}
	}
}
