/**
 * 
 */
package kaup;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 15.
 * @author   : jun.dev
 * @fileName : KaupController.java
 * @story    : 
 */
public class KaupController {
	public static void main(String[] args) {
		Kaup ka = new Kaup(); //Kaup 클래스 선언 및 초기화. 객체를 선언해주고 초기화 후에는 선언한 객체 이름으로 사용
		String mainName="",mainHeight="",mainWeight=""; //컨트롤러에서 담아줄 지역변수 선언 및 초기화.
		while (true) {
			switch (JOptionPane.showInputDialog("1:실행 0:종료")) {
			case "1":
				// 이름, 키 , 몸무게를 JOptionPane.showInputDialog 를 사용하여 
				//입력받아 name,height,weight 변수에 담아줌
				// JOptionPane으로 입력 받는 값들은 기본적으로 String(문자형)입니다.
				mainName = JOptionPane.showInputDialog("이름");
				mainHeight = JOptionPane.showInputDialog("키");
				mainWeight = JOptionPane.showInputDialog("몸무게");
				
				// 입력받아 각 변수에 담은 값들을 Kaup 클래스에 Setter로 저장.
				// 저장까지 끝나면 Kaup 클래스에서 카푸지수를 구하는 메소드를 만들어서 Kaup값 리턴.
				ka.setName(mainName);
				// Kaup 클래스에서 int형으로 받기때문에 set해줄때 int형으로 캐스팅 (Integer.parseInt()사용)
				ka.setHeight(Integer.parseInt(mainHeight)); 
				ka.setWeight(Integer.parseInt(mainWeight));
				// String형은 int로 캐스팅할때 Integer.parseInt() 사용
				// int형을 String으로 캐스팅할때 String.valueOf() 사용.
				JOptionPane.showMessageDialog(null, ka.execute());
				break;
			case "0":JOptionPane.showConfirmDialog(null, "종료합니다.");
			return;
			
			default:
				break;
			}
		}
	}
}
