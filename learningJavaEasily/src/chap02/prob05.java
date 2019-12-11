package chap02;

import java.util.Scanner;

public class prob05 {

	public static void main(String[] args) {
		char c;
		String s;
		Scanner in = new Scanner(System.in);
		System.out.print("소문자를 입력하세요:");
		s = in.next();
		c = s.charAt(0);
		System.out.printf("%c", c - 32);
	}

}

//Scanner 클래스는 문자를 입력받는 기능이 없다.
//문자열로 입력 받은 다음, charAt()으로 첫번째 문자를 꺼내오자.