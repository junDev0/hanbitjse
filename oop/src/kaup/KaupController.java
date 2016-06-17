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
		Kaup ka = new Kaup();
		while (true) {
			switch (JOptionPane.showInputDialog("1:실행 0:종료")) {
			case "1":
				String name = JOptionPane.showInputDialog("이름");
				String height = JOptionPane.showInputDialog("키");
				String weight = JOptionPane.showInputDialog("몸무게");
				ka.setName(name);
				ka.setHeight(height);
				ka.setWeight(weight);
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
