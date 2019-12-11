package chap02;

import java.util.Scanner;

public class prob04 {

	public static void main(String[] args) {
		int hour, min, sec;
		Scanner in = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요:");
		sec = in.nextInt();

		hour = sec / 3600;
		sec = sec % 3600;
		min = sec / 60;
		sec = sec % 60;

		System.out.printf("%d시간 %d분 %d초\n", hour, min, sec);
	}

}
