package chap03;

import java.util.Scanner;

public class prob06 {

	public static void main(String[] args) {
		String cheol, young;
		Scanner in = new Scanner(System.in);
		System.out.print("철수:");
		cheol = in.next();
		System.out.print("영희:");
		young = in.next();

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
	}

}
