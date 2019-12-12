package chap02;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {
		int num;
		boolean tf;
		Scanner in = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요:");
		num = in.nextInt();
		tf = (num % 4 == 0) && (num % 5 == 0) ? true : false;
		System.out.println("입력하신 양의 정수가 4와 5의 공배수인지 판별 : " + tf);
		tf = (num % 4 == 0) || (num % 5 == 0) ? true : false;
		System.out.println("입력하신 양의 정수가 4의 배수 또는 5의 배수인지 판별 : " + tf);
		tf = ((num % 4 == 0) || (num % 5 == 0)) && (num % 20 != 0) ? true : false;
		System.out.println("입력하신 양의 정수가 4의 배수 또는 5의 배수이지만 4와 5의 공배수가 아닐 경우인지 판별 : " + tf);

	}

}
