package exam;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 8.
 * @author   : hb2007
 * @finename : Average.java
 * @story    : 
 */
public class Average {

	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.이름과 국,영,수 세과목점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균 ***점,합격여부(합격)]을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점 이하는 절삭합니다.
	 * 평균점수가 60점 미만이면 불합격, 이상이면 합격입니다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int kor=0,eng=0,math=0,total=0,avg=0; 
		String name = "";
		String succ = "";
		
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
		
		if(avg >60){
			succ = "합격";
		}else{
			succ = "불합격";			
		}
		System.out.println("["+name+" : 총점 "+total+"점, 평균"+avg+"점], 합격여부("+succ+")");

		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 * [홍길동 : 총점 ***점, 평균 ***점,합격여부(합격)]을 출력하는 프로그램을 만들어 주세요.
		 * 단) 평균은 소수점 이하는 절삭합니다.
		 * 평균점수가 60점 미만이면 불합격, 이상이면 합격입니다.
		 */
		
		
		Scanner scan2 = new Scanner(System.in);
		String name2 ="",result2="";
		int guk=0,eng2=0,su=0,total2,avr;
		
		System.out.print("이름 :");
		name2 = scan2.next();
		System.out.println("국어 :");
		guk = scan2.nextInt();
		System.out.println("영어 :");
		eng2 = scan2.nextInt();
		System.out.println("수학 :");
		su = scan2.nextInt();
		
		
		total2 = guk+eng2+su; //총점
		
		avr = total2/3; //평균
		
		
		
		//* 평균점수가 60점 미만이면 불합격, 이상이면 합격입니다.
		
		if (avr < 60) {// 60점 미만일때
			
			result2 = "불합격";
			
		} else {// 60점 미만이 아니라면
			
			result2 = "합격";
			
		}
		
		
		//[홍길동 : 총점 ***점, 평균 ***점,합격여부(합격)]
		
		System.out.println("["+name2+": 총점 "+ total2 + ", 평균 " + avr + "점, 합격여부("+ result2 + ")");

		
		
		
		
		
		
		
		
		
		
		
		String jun = "", result3 =""; // 문자열 String 자료형에 초기화.
		int num = 0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
