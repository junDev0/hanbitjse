/**
 * 
 */
package something;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @date     : 2016. 6. 17.
 * @author   : jun.dev
 * @fileName : something.java
 * @story    : 
 */
public class Something2 {
	/*
	 * 숫자 하나를 입력받고
	 * 입력받은 숫자가 10과 같은지 비교하고 같지않을때에도 알수있게 if문 혹은 switch 문을 만드시오.
	 */
	
	private String aaa,bbb;
	private int ccc,ddd;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		System.out.print("숫자1 : ");
		num1 = scan.nextInt();
		
		if (num1 == 10) {
			
		}else{
			
		}
		
		int num = 8;
		
		if(num==8){
			System.out.println("if의 결과 : "+num);
		}else{
			System.out.println("else의 결과 : "+num);
		}
		
		switch (num) {
		case 0: System.out.println("case의 결과 : "+num);
			break;
		case 8: System.out.println("case의 결과 : "+num);
			break;
		default:
			System.out.println("default의 결과 : " + num);
			break;
		}
	
		
		
	}
	
}
