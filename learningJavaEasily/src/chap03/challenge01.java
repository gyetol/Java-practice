package chap03;

import java.util.Scanner;

public class challenge01 {

	public static void main(String[] args) {
		int result = 1, n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 계산을 할 정수를 입력하시오:");
		n = in.nextInt();
		while (true) {
			if (n <= 0) {
				break;
			}
			result *= n;
			n--;
		}

		/*
		 * while (n > 0) { result *= n; n--; }
		 */

		System.out.println(result);

	}

}
