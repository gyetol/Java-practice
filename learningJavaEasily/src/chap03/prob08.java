package chap03;

public class prob08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			printStar(i);
			System.out.println();
		}
	}

	public static void printStar(int i) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
	}

}
