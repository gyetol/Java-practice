package chap03;

import java.util.Scanner;

public class prob01 {

	public static void main(String[] args) {
		int age;
		Scanner in = new Scanner(System.in);
		System.out.print("나이를 입력하세요:");
		age = in.nextInt();
		if (age >= 19) {
			System.out.println("성년");
		} else {
			System.out.println("미성년");
		}
	}

}
