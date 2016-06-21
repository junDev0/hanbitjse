package simplRPS2;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 21.
 * @author   : jun.dev
 * @fileName : SimpleRPS.java
 * @story    : 
 */
public class SimpleRPSController {
	public static void main(String[] args) {
		String match = "",result = ""; // 결과
		SimpleRPSService service = new SimpleRPSServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("===가위바위보 게임===\nGO(1) or STOP(0)")) {
			case "1":				
				JOptionPane.showMessageDialog(null,service.getResult(service.playgame(JOptionPane.showInputDialog("1.가위 2.바위 3.보"))));				
				break;
			case "0": result = "CLOSE"; return;	

			default:
				break;
			}

		}
		
	}


}
