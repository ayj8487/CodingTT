package level02;

import java.util.Scanner;

public class Test5 {

	//백준코딩 단계2 if문 05문제 2884
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		  int H = s.nextInt(); //시
		  int M = s.nextInt(); //분
		
        if(M < 45){
            M = 60-(45-M);
            if(H > 0){
                H--; 
            }else {
                H = 23;
            }
            System.out.println(H + " " + M);
        }else{
            M = M-45;
            System.out.println(H + " " + M);
        }
	}
}

