package chapter01;
import java.util.Scanner;


public class do_while {

	public static void main(String[] args) {
		int i =0;
		int sum=0;
		
//		long start = System.nanoTime();
		Scanner scanner = new Scanner(System.in);
		System.out.print("횟수입력 : ");
		int count = scanner.nextInt();

		while( i< count ){
			sum+=i;
			System.out.println(++i);
		}
//		long end = System.nanoTime();
//		System.out.println(end-start +"ms");
		
	}
}
