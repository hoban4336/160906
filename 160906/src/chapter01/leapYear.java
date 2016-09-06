package chapter01;

public class leapYear {
	public static void main(String[] args) {
		int year =2100;
		if(year % 400 == 0){
			System.out.println("윤년입니다.");
		}else if(year % 100 == 0){
			System.out.println("윤년이 아닙니다.");
		}else if(year % 4 ==0){
			System.out.println("윤년입니다.");
		}
	
	}
}
