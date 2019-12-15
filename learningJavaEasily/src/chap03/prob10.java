package chap03;

import java.util.Scanner;

public class prob10 {

	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 :");
		int num = new Scanner(System.in).nextInt();
		if (isPrime(num)) {
			System.out.println(num + "는 소수입니다.");
		} else {
			System.out.println(num + "는 소수가 아닙니다.");
		}
	}

	public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		} // 1은 소수가 아니다
		if (num == 2) {
			return true;
		} // 2는 소수
		if (num % 2 == 0) {
			return false;
		} // 2 이외의 짝수는 소수가 아니다
		for (int i = 3; i * i <= num; i += 2) // 홀수만 검사한다 // num<9일 경우 for문이 한번도 안돌게 되지만, 짝수를 이미 걸렀으므로 4,6,8은 false가 되고
												// 3,5,7은 true가 된다
		{
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}