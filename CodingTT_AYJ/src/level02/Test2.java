package level02;

import java.util.Scanner;

public class Test2 {

	//백준코딩 단계2 if문 02문제 9498
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a ; 
		a = sc.nextInt();

		if(a >= 90) {
			System.out.println("A");
		}else if(a >=80) {
			System.out.println("B");
		}else if (a >=70) {
			System.out.println("C");
		}else if (a >=60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	
	}

}
