package chap03;

import java.util.Scanner;

public class challenge02 {

	public static void main(String[] args) {
		int result = 1, n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 계산을 할 정수를 입력하시오:");
		n = in.nextInt();
		result = factorial(n);
		System.out.println(result);
	}

	public static int factorial(int x) {
		int result = 1;
		while (true) {
			if (x <= 0) {
				break;
			}
			result *= x;
			x--;
		}
		return result;
	}
}
