package chap02;

import java.util.Scanner;

public class prob09 {

	public static void main(String[] args) {
		int majorCredit, liberalArtCredit, generalCredit;
		Scanner in = new Scanner(System.in);
		System.out.print("전공 이수 학점:");
		majorCredit = in.nextInt();
		System.out.print("교양 이수 학점:");
		liberalArtCredit = in.nextInt();
		System.out.print("일반 이수 학점:");
		generalCredit = in.nextInt();

		System.out.print((((majorCredit >= 70) && ((liberalArtCredit >= 30 && generalCredit >= 30)
				|| (liberalArtCredit + generalCredit >= 80))) == false) ? "졸업불가" : "졸업가능");
	}

}
