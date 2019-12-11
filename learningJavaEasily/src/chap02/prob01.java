package chap02;

public class prob01 {

	public static void main(String[] args) {
		System.out.printf("%6s\n", "*");
		System.out.printf("%7s\n", "***");
		System.out.printf("%8s\n", "*****");
		System.out.printf("%9s\n", "*******");
		System.out.printf("%10s\n", "*********");
		System.out.printf("%11s\n", "***********");
	}

}

/*
 * c에서는 printf("%*d",3,1); 하면 printf("%3d",1);이랑 똑같은데, 자바에서는 혹시 *같은 변경자역할을 하는것이
 * 있을까요?
 */
