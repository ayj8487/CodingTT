package level02;

import java.util.Scanner;

public class Test1 {

	//백준코딩 단계2 if문 01문제 1330
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b ; 
		a = sc.nextInt();
		b = sc.nextInt();
		if(a>b ) {
			System.out.println(">");
		}
		if(a<b) {
			System.out.println("<");
		}
		if(a==b) {
			System.out.println("==");
		}
	}

}
