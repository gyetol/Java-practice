package chap02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
		System.out.println("헤헤");

	}

}