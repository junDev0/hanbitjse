package user;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 8.
 * @author   : hb2007
 * @finename : CastingEx.java
 * @story    : 
 */
public class CastingEx {
	public static void main(String[] args) {
		/*
		 * 클라이언트에서 프로그램 개발 요청이 왔습니다.이름과 국,영,수 세과목점수를 입력받아서
		 * [홍길동 : 총점 ***점, 평균 ***점]을 출력하는 프로그램을 만들어 주세요.
		 * 단) 평균은 소수점 이하는 절삭합니다.
		 */
		
		Scanner scan = new Scanner(System.in); 
		int kor=0,eng=0,math=0,total=0,avg=0; 
		String name = ""; 
		
		System.out.println("★ 점수 환산★");
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		math = scan.nextInt();
		
		total = kor+eng+math;
		avg = (total/3);
		System.out.println("["+name+" : 총점 "+total+"점, 평균"+avg+"점]");
		
		
	}
}
