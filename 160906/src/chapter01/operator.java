package chapter01;
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 7;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println(-a); //-7
		System.out.println(++a); //8
		System.out.println(--b); //2
		System.out.println(a++); //8
		System.out.println(b--); //2
		
		System.out.println(10/3); //3
		System.out.println(10f/3f); //3.3333333 (float/float)
		System.out.println(10./3.); //3.3333333333333335 ( double/double)
		System.out.println((float)10./3.); //3.3333333333333335
		
		System.out.println(-7 % 3); //-1
		System.out.println(7 % -3); //1 (-1과 1중 7과 가까운 값으로 나온다)
		
		

	}

}
