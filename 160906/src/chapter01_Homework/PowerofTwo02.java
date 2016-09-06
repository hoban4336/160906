package chapter01_Homework;

import java.util.Scanner;

public class PowerofTwo02 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int result =1;
		System.out.println("승수: ");
		
		int tmp = scanner.nextInt();
		int pow = tmp;
		for(int i=0; i<=tmp;i++){
			result *=2;
		}
		System.out.println("2의 " +pow +"제곱근은 "+result+ "입니다.");
	}
}