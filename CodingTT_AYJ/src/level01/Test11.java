package level01;

import java.util.Scanner;

public class Test11 {

	//백준코딩 단계1 입출력과 사칙연산 11문제 2588
	 public static void main(String[] args){

		 int a,b,temp;
			Scanner sc = new Scanner(System.in);
	        a= sc.nextInt();
	        b= sc.nextInt();
	        temp = b;
	        
	        while(temp != 0){
	            System.out.println( a * (temp%10) );
	            temp /= 10;
	        }
	       System.out.print(a*b);
	    }
	}
