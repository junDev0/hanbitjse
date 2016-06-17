package branch;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 8.
 * @author   : hb2007
 * @finename : Average.java
 * @story    : 
 */
public class Average2 {

	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.이름과 국,영,수 세과목점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균 ***점,학점 : A]을 출력하는 프로그램을 만들어 주세요.
	 * 단) 평균은 소수점 이하는 절삭합니다.
	 * 평균점수가 90점 이상이면 A
	 * 		   80점 이상이면 B
	 * 		   70점 이상이면 C
	 * 		   60점 이상이면 D
	 * 		   50점 이상이면 E
	 * 		   50점 미만이면 F입니다.
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
		if(kor > 100||kor <0){
			System.out.println("0~100점의 점수만 입력해주세요.");	
			return;
		}		

		System.out.print("영어 : ");
		eng = scan.nextInt();
		if(eng > 100||kor <0){
			System.out.println("0~100점의 점수만 입력해주세요.");	
			return;
		}		

		System.out.print("수학 : ");
		math = scan.nextInt();
		if(math > 100||kor <0){
			System.out.println("0~100점의 점수만 입력해주세요.");	
			return;
		}		




		total = kor+eng+math;
		avg = (total/3);

		if(avg >= 90){
			succ = "A";
		}else if(avg >= 80){
			succ = "B";			
		}else if(avg >= 70){
			succ = "C";			
		}else if(avg >= 60){
			succ = "D";			
		}else if(avg >= 50){
			succ = "E";			
		}else if(avg < 50){
			succ = "F";			
		}
		System.out.println("["+name+" : 총점 "+total+"점, 평균"+avg+"점], 학점 : "+succ);



		System.out.println("["+name+" : 총점 "+total+"점, 평균"+avg+"점], 학점 : "+succ);
		
		//[홍길동 : 총점 ***점, 평균 ***점,학점 : A]


















	}
}
