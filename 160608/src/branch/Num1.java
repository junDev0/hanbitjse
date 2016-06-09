package branch;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 9.
 * @author   : hb2007
 * @finename : Num1.java
 * @story    : 
 */
public class Num1 {
	/**
	 * 저희 반은 학생수가 3명입니다.
	 * 학생의 평균점수는 0~100점 사이입니다.
	 * 3명의 평균점수를 입력하면
	 * 1등 홍길동
	 * 2등 김유신
	 * 3등 김구
	 * 이렇게 나오도록 해주세요.
	 * 단, 학생이름은 스캐너로 입력받습니다.
	 * 
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		String st1="",st2="",st3="";
		int score1=0,score2=0,score3=0;
		System.out.println("※ㅇㅇ학원 시험점수표");
		System.out.print("학생1 이름: ");
		st1 = scan.next();
		System.out.print("학생2 이름: ");
		st2 = scan.next();
		System.out.print("학생3 이름: ");
		st3 = scan.next();

		if(st1.equals("")||st2.equals("")||st3.equals("")){
			System.out.println("학생이름을 전부 입력해주세요.");
			return;
		}
		
		System.out.println(st1+"학생의 평균점수 입력: ");
		score1 = scan.nextInt();
		if(score1 >100 || score1<0){
			System.out.println("점수는 0~100까지 입력가능합니다");
			return;
		}
		System.out.println(st2+"학생의 평균점수 입력: ");
		score2 = scan.nextInt();
		if(score2 >100 || score2<0){
			System.out.println("점수는 0~100까지 입력가능합니다");
			return;
		}
		System.out.println(st3+"학생의 평균점수 입력: ");
		score3 = scan.nextInt();
		if(score3 >100 || score3<0){
			System.out.println("점수는 0~100까지 입력가능합니다");
			return;
		}
		String one="",two="",three="";
		if(score1>score2 && score1>score3){
			one = st1;
			if(score2>score3){
				two = st2;
				three = st3;
			}else{
				two = st3;
				three = st2;
			}
			
		}else if(score2>score1 && score2>score3){
			one = st2;
			if(score1>score3){
				two = st1;
				three = st3;
			}else{
				two = st3;
				three = st1;
			}
			
		}else if(score3>score1 && score3>score2){
			one = st3;
			if(score1>score2){
				two = st1;
				three = st2;
			}else{
				two = st2;
				three = st1;
			}

		}
		
		System.out.println("1등:"+one+"\n2등:"+two+"\n3등:"+three);
		
		
	}
}
