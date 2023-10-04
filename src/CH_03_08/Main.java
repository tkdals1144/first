package CH_03_08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int []list = new int[a];
		int []num1 = new int[a];
		int []num2 = new int[a];
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			num1[i] = b;
			num2[i] = c;
			list[i] = b + c;
		}
		for (int i = 1; i <= a; i++) {
			System.out.println("Case #" + i + ": " + num1[i-1] 
					+ " + " + num2[i-1] + " = " + list[i-1]);
		}
	}
}
