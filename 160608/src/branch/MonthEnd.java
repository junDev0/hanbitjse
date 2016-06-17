package branch;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 9.
 * @author   : hb2007
 * @finename : MonthEnd.java
 * @story    : 
 */
public class MonthEnd {
	/**
	 * 월을 입력하면 말일이 몇일인지 알려주는 
	 * 프로그램.
	 * 단, 2월은 29일로 한정함.
	 * 1~12를 벗어난 숫자를 입력하면
	 * 잘못된 입력값입니다. 라고 뜬다.
	 * 2월의 말일은 29일입니다.
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String month ="",endDay="";

		System.out.println("★달력 말일구하기★");
		System.out.print("달을 입력하세요 : ");
		month = scan.next();

		
		
		switch (month) {
		case "1":endDay="31";break;
		case "2":endDay="29";break;
		case "3":endDay="31";break;
		case "4":endDay="30";break;
		case "5":endDay="31";break;
		case "6":endDay="30";break;
		case "7":endDay="31";break;
		case "8":endDay="31";break;
		case "9":endDay="30";break;
		case "10":endDay="31";break;
		case "11":endDay="30";break;
		case "12":endDay="31";break;
		default:System.out.println("1~12를 벗어난 숫자를 입력하면 잘못된 입력값입니다.");return;
		}

		System.out.println("["+month+"월의 말일은"+endDay+"일입니다.]");
	}

}
