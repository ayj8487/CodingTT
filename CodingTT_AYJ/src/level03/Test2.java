package level03;

import java.util.Scanner;

public class Test2 {

	//백준코딩 단계3 for문 02문제 10950
	   public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);

		    int t = sc.nextInt();

		     for (int i = 0; i < t;i++){
		       int a = sc.nextInt();
		       int b = sc.nextInt();
		       System.out.println(a + b);
		       }
		   } 
		}

/*
	1. 스캐너로 t값을 받음

	2. for문이 동작해서 i값을 0으로 만듬

	3. t값보다 i값이 작다를 허용하는 값까지만 증감하면서 스캐너로 a값과 b값을 받은후 a+b를 출력하는 작업을 반복함

 */