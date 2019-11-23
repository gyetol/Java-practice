import java.util.Scanner; 
//import java.io.File;
public class AppStart {
	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(new File("C:/Workspace/data.txt"));
		 * //System.out.print("이름:"); String str=sc.next(); //System.out.print("연령:");
		 * int age=sc.nextInt(); //System.out.println("신장:"); double height =
		 * sc.nextDouble();
		 * 
		 * System.out.println("이름:"+str); System.out.println("연령:"+age);
		 * System.out.println("신장:"+height);
		 */
		
		Scanner sc=new Scanner(System.in);
		int kor,eng,math;
		
		System.out.print("국어 점수:");
		kor=sc.nextInt();
		System.out.print("영어 점수:");
		eng=sc.nextInt();
		System.out.print("수학 점수:");
		math=sc.nextInt();
		int tot=kor+eng+math;
		double avg=tot/3.0;
		System.out.printf("%4d %4d %4d %4d %6.2lf", kor,eng,math,tot,avg);
		}
}
	
