package simpleRPS0;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 21.
 * @author   : jun.dev
 * @fileName : SimpleRPS.java
 * @story    : 
 */
public class SimpleRPS {
	public static void main(String[] args) {
		int comp=0,player=0; // 컴퓨터, 유저 
		String result = ""; // 결과
		while (true) {
			switch (JOptionPane.showInputDialog("===가위바위보 게임===\nGO(1) or STOP(0)")) {
			case "1":
				String p = JOptionPane.showInputDialog("1.가위 2.바위 3.보");
				result = gameEngine(result, p);
				JOptionPane.showMessageDialog(null, result);				
				break;
			case "0": result = "CLOSE"; return;	

			default:
				break;
			}

		}
		
	}

	/**
	 * @param result
	 * @param p
	 * @return
	 */
	private static String gameEngine(String result, String p) {
		int comp;
		switch (p) {
		case "1":
			comp = (int)(Math.random()*3)+1;
			switch (comp) {
			case 1:result = "TIE";break;
			case 2:result = "LOSE";break;
			case 3:result = "WIN";break;
			}
			break;
		case "2":
			comp = (int)(Math.random()*3)+1;
			switch (comp) {
			case 1:result = "WIN";break;
			case 2:result = "TIE";break;
			case 3:result = "LOSE";break;
			}
			
			break;
		case "3":
			comp = (int)(Math.random()*3)+1;
			switch (comp) {
			case 1:result = "LOSE";break;
			case 2:result = "WIN";break;
			case 3:result = "TIE";break;
			}
			
			break;
		default:
			break;
		}
		return result;
	}
}
