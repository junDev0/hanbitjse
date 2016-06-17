package branch;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		/*
		 * 클라이언트에서 프로그램 개발 요청이 왔습니다.이름과 국,영,수 세과목점수를 입력받아서
		 * [홍길동 : 총점 ***점, 평균 ***점]을 출력하는 프로그램을 만들어 주세요.
		 * 단) 평균은 소수점 이하는 절삭합니다.
		 */

		Scanner scan = new Scanner(System.in);
		String name = "";
		int sal=0,money=0,tax;
		double taxRate = 0.097;
		System.out.println("이름:");
		
		System.out.println("연봉:");
		
		System.out.println("세율이 바뀌었습니까?바뀌었으면 Y, 안바뀌었으면 N을 입력하세요.");
		
		//System.out.println("연봉 "+sal+"만원을 받으시는"+name+"님께서 납부하실 세금은"+tax+"원입니다.");
		
		
	}
	
}
