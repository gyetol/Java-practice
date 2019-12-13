package chap03;

public class challenge03 {

	public static void main(String[] args) {

		/*
		 * int result = 1, n1, n2; Scanner in = new Scanner(System.in);
		 * System.out.print("구간 팩토리얼 계산을 할 시작 정수를 입력하시오:"); n1 = in.nextInt();
		 * System.out.print("구간 팩토리얼 계산을 할 끝 정수를 입력하시오:"); n2 = in.nextInt();
		 */

		System.out.println(factorial(5));
		System.out.println(factorial(1, 5));
		System.out.println(factorial(3, 5));
		System.out.println(factorial(10, 5));
	}

	public static int factorial(int x) {
		int result = 1;
		while (true) {
			if (x <= 0) {
				break;
			}
			result *= x;
			x--;
		}
		return result;
	}

	public static int factorial(int x, int y) {
		int result = 1;
		while (true) {
			if (y < x) {
				break;
			}
			result *= y;
			y--;
		}
		return result;
	}
}
