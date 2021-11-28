package level02;

import java.util.Scanner;

public class Test5 {

	//백준코딩 단계2 if문 04문제 14681
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 int a = s.nextInt();
         int b = s.nextInt();
         int c=0;
        if(a>0) {
            if(b>0){
                c=1;
            }else{
                c=4;
            }
        }else{
            if(b>0){
                c=2;
            }else{
                c=3;
            }
        }
        System.out.println(c);
	}
}

