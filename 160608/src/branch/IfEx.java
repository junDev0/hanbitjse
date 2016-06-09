package branch;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 8.
 * @author   : hb2007
 * @finename : IfEx.java
 * @story    : 
 */
public class IfEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		
		System.out.print("정수값 입력 : ");
		input = scan.nextInt();
		String str = "ss";
		if (str == "ss") {
			System.out.println("입력된 정수값 "+input+"이 10보다 큽니다.");
		} else {
			System.out.println("입력된 정수값"+input+"이 10보다 같거나 작습니다.");
		}
	}
}
