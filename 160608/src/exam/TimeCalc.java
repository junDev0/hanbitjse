package exam;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 10.
 * @author   : hb2007
 * @finename : TimeCalc.java
 * @story    : 
 */
public class TimeCalc {
	/**
	 * 타이머로 작업시간을 기록하고 있는데요
	 * 결과가 50000초로 나오네요.
	 * 그런데 이게 감이 잘 안와서요.
	 * 시간,분,초로 나누어서 보게해주세요.
	 * 예를들면 50000초가 입력되면
	 * 25시간 32분 15초 이렇게 보이게 해주세요.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int secInput=0;
		
		System.out.println("§타이머 시간구하기"); // 제목
		System.out.print("작업시간 초 입력 : "); //초입력 인터페이스
		secInput = scan.nextInt(); // 초 입력	
		
		System.out.println("작업시간 : " + (secInput/3600)+"시간 "+(secInput%3600/60)+ "분 "+ (secInput%3600%60)+"초");
				

	}
}
