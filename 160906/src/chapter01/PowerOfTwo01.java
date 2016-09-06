package chapter01;
import java.util.Scanner;


public class PowerOfTwo01 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int result =1;
		System.out.println("승수: ");
		
		int tmp = scanner.nextInt();
		int pow = tmp;
		while(0<tmp){
			result *=2;
			tmp--;
		}
		System.out.println("2의 " +pow +"제곱근은 "+result+ "입니다.");
	}
}
