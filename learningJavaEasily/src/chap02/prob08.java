package chap02;

import java.util.Scanner;

public class prob08 {

	public static void main(String[] args) {
		int num, digit, hundred, ten, one;
		Scanner in = new Scanner(System.in);
		System.out.print("0부터 999사이의 숫자를 입력하세요:");
		num = in.nextInt();
		hundred = num / 100;
		ten = (num / 10) % 10;
		one = num % 10;
		System.out.printf("각 자릿수의 합 = %d\n", hundred + ten + one);
	}

}
