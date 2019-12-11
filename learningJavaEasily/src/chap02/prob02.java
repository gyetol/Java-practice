package chap02;

import java.util.Scanner;

public class prob02 {

	public static void main(String[] args) {
		int num;
		System.out.println("정수를 입력하세요:");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.printf("%d의 제곱은 %d", num, num * num);
	}

}
