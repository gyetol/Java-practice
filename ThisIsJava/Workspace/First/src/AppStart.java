import java.util.Scanner; 
//import java.io.File;
public class AppStart {
	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(new File("C:/Workspace/data.txt"));
		 * //System.out.print("�̸�:"); String str=sc.next(); //System.out.print("����:");
		 * int age=sc.nextInt(); //System.out.println("����:"); double height =
		 * sc.nextDouble();
		 * 
		 * System.out.println("�̸�:"+str); System.out.println("����:"+age);
		 * System.out.println("����:"+height);
		 */
		
		Scanner sc=new Scanner(System.in);
		int kor,eng,math;
		
		System.out.print("���� ����:");
		kor=sc.nextInt();
		System.out.print("���� ����:");
		eng=sc.nextInt();
		System.out.print("���� ����:");
		math=sc.nextInt();
		int tot=kor+eng+math;
		double avg=tot/3.0;
		System.out.printf("%4d %4d %4d %4d %6.2lf", kor,eng,math,tot,avg);
		}
}
	
