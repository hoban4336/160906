package chapter01;
import java.util.Scanner;


public class test_scanner {
	
	public static void main(String[] args) {
	       long start = System.currentTimeMillis();
	        test();
	        long end = System.currentTimeMillis();
	        System.out.println("실행 시간 : " + (double)(end-start)/1000 + "(s)");
	}

	private static void test() {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			System.out.println(scanner.next());
			count++;
			System.out.println(count);
		}
		scanner.close();
	}
}
