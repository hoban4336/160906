package chapter01_Homework;
import java.util.Scanner;


public class PrimeDetect {

	public static void getPrime() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소수인지 판단할 숫자:");
		int num = scanner.nextInt();
		
		int divisor =2;
		boolean isPrime = true;
		int result =0;
		int i =2;
		
		while(i<num){
			if(num%i==0){
				isPrime = false;break;
			}
			i++;
		}
		
		if(isPrime){
			System.out.println(num+"은 소수입니다.");
		}else{
			System.out.println(num+"은 소수가 아닙니다.");
		}
	}
	
	public static void main(String[] args) {
	       long start = System.currentTimeMillis();
	        getPrime();
	        long end = System.currentTimeMillis();
	        System.out.println("실행 시간 : " + (double)(end-start)/1000 + "(s)");
	}
}
