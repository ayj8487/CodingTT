package level01;

import java.util.Scanner;

public class Test10 {

	//백준코딩 단계1 입출력과 사칙연산 10문제 10430
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c ;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		System.out.println((a + b) % c );
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c))%c);
		  }
}
