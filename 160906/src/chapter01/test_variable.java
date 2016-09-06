package chapter01;
public class test_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d = f;

		byte b1 = (byte) 256; 

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);

	}

}

class student {
	int number; // String
	String name;
	boolean isEnrolled;
	float grade;
	char[] address; // string split 하기 쉽도록.
	String major;
	float unit; // int
	boolean haveMinor;
	double juminNo; // string 으로 가지고 있으면 2또는 1을 구분하기 쉬움.
	double cellphone; // string (-을 포함하기 때문)
	int age;
	char[] email; // string @으로 구분하기위해서
}
