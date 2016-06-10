package exam;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 10.
 * @author   : hb2007
 * @finename : Gender.java
 * @story    : 
 */
public class Gender {
	/**
	 * 개발자님 저희 사이트는 주민번호 앞자리와 성별
	 * 판별번호만 입력합니다.
	 * 예를들어 800101-1까지만 입력하면
	 * 소비자가 자신이 남자인지 여자인지 밝히지 않아도
	 * 자동으로 DB에 저장되는 시스템을 개발
	 * 9,0 : 국내 1800년대생 남,녀
	   1,2 : 국내 1900년대생 남,녀
	   3,4 : 국내 2000년대생 남,녀
       5,6 : 외국 1900년대생 남,녀
	   7,8 : 외국 2000년대생 남,녀

	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String humanNum="",genStr="여",name=""; //gender =""
		char gender;
		System.out.println("※주민번호 판별 프로그램");
		System.out.print("이름 입력:");
		name = scan.next();
		System.out.print("주민번호 입력 : ");
		humanNum = scan.next();
		//gender = humanNum.substring(humanNum.length()-1);
		//gender = humanNum.charAt(humanNum.length()-1);
		gender = humanNum.charAt(7);
		
		if(gender ==9 || gender==0){
			System.out.println("잘못된입력입니다.");
			return;
		}
		switch (gender%2) {
		case 1: genStr="남"; break;
		}
		
		System.out.println("[결과]"+name+"("+genStr+")");

	}
}
