package chap02;

import java.util.Scanner;

public class prob03 {

	public static void main(String[] args) {
		double rad, height, bulk, pi;
		final double p = 3.141592;
		Scanner in = new Scanner(System.in);
		System.out.println("원기둥의 밑면 반지름은?");
		rad = in.nextDouble();
		System.out.println("원기둥의 높이는?");
		height = in.nextDouble();
		System.out.printf("원기둥의 부피는 %.1f", rad * rad * p * height);
	}

}
