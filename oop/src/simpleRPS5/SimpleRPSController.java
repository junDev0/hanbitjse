package simpleRPS5;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 21.
 * @author   : jun.dev
 * @fileName : SimpleRPS.java
 * @story    : 
 */
public class SimpleRPSController {
	public static void main(String[] args) {
		SimpleRPSService service = new SimpleRPSServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("===홀짝 게임===\nGO(1) or STOP(0)")) {
			case "1":				
				JOptionPane.showMessageDialog(null,service.getResult(service.playgame(Integer.parseInt(JOptionPane.showInputDialog("1.홀 2.짝")))));				
				break;
			case "0": JOptionPane.showMessageDialog(null, "CLOSE"); return;	

			default:
				break;
			}

		}
		
	}


}
