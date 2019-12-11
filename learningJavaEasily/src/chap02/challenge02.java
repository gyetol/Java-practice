package chap02;

import java.util.Scanner;

public class challenge02 {

	public static void main(String[] args) {
		int integer;
		// char b;
		System.out.println("정수를 입력하세요:");
		Scanner a = new Scanner(System.in);
		integer = a.nextInt();

		System.out.print((integer % 2 == 0) ? "짝수" : "홀수");

		// (integer % 2 == 0) ?System.out.print("짝수\n") : System.out.print("홀수\n");

		/*
		 * if ((integer % 2) == 0) { System.out.print("짝수\n"); } else {
		 * System.out.print("홀수\n"); }
		 */

		/*
		 * b = (integer % 2 == 0) ? '짝' : '홀'; System.out.print(b);
		 */

	}

}
// 삼항연산자에는 void타입을 쓸 수 없다.
