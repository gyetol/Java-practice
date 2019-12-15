package chap03;

import java.util.Scanner;

public class prob07 {

	public static void main(String[] args) {

		String c = input("철수");
		String y = input("엉희");
		whosWin(c, y);
	}

	public static String input(String msg) {
		String result;
		Scanner in = new Scanner(System.in);
		System.out.print(msg + ":");
		result = in.next();
		return result;
	}

	public static void whosWin(String cheol, String young) {
		if (cheol.equals("r")) {
			if (young.equals("r")) {
				System.out.println("무승부!");
			} else if (young.equals("s")) {
				System.out.println("철수 승!");
			} else {
				System.out.println("영희 승!");
			}
		} else if (cheol.equals("s")) {
			if (young.equals("s")) {
				System.out.println("무승부!");
			} else if (young.equals("p")) {
				System.out.println("철수 승!");
			} else {
				System.out.println("영희 승!");
			}
		} else {
			if (young.equals("p")) {
				System.out.println("무승부!");
			} else if (young.equals("r")) {
				System.out.println("철수 승!");
			} else {
				System.out.println("영희 승!");
			}
		}
		return;
	}

}
