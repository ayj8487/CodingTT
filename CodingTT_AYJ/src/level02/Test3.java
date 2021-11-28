package level02;

import java.util.Scanner;

public class Test3 {

	//백준코딩 단계2 if문 03문제 2753
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		
		if (A % 4 == 0 && (A % 100 != 0 || A % 400 == 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
    }
}
