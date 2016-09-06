package chapter01;
public class swap {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;

		if (n1 < n2) {
			int tmp = n1;
			n1 = n2;
			n2 = n1;
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		int a1 = 20;
		int a2 = 100;
		int a3 = 50;
		
	 long start = System.nanoTime();
		//단점: n개이면 n-1번을 비교해야한다.
		if (Math.max(a1, a2) == a1) {
			if (Math.max(a1, a3) == a3) {
				System.out.println("최대값은 : " + a3);
			} else {
				System.out.println("최대값은 : " + a1);
			}
		} else if (Math.max(a2, a3) == a2) {
			if (Math.max(a1, a2) == a2) {
				System.out.println("최대값은 : " + a2);
			} else {
				System.out.println("최대값은 : " + a1);
			}
		}
		long end = System.nanoTime();
		System.out.println((end-start)+"ms");
	}
}
