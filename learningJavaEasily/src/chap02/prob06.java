package chap02;

import java.util.Scanner;

public class prob06 {

	public static void main(String[] args) {
		double farenheit, celcius;
		Scanner in = new Scanner(System.in);
		System.out.print("화씨온도를 입력하세요:");
		farenheit = in.nextDouble();
		celcius = (farenheit - 32) * 5.0 / 9.0;
		System.out.printf("화씨로 %f도는 섭씨로 %f도입니다.\n", farenheit, celcius);

	}

}
