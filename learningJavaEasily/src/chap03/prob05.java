package chap03;

public class prob05 {

	public static void main(String[] args) {
		int a, b, c;
		for (a = 1; a <= 20; a++) {
			for (b = 1; b < 20; b++) {
				for (c = 1; c < 20; c++) {
					if ((a * a + b * b == c * c) && (a + b + c <= 20) && (a < b)) {
						System.out.printf("%d %d %d\n", a, b, c);
					}
				}
			}
		}
	}

}
