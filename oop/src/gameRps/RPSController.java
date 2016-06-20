package gameRps;

import javax.swing.JOptionPane;

public class RPSController {
	public static void main(String[] args) {
		RPSService service = new RPSServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1.게임시작 0.종료")) {
			case "1":
				String rps = JOptionPane.showInputDialog("1.가위 2.바위 3.보자기");
				if(service.checkValidation(rps)==false){
					JOptionPane.showMessageDialog(null, "1~3숫자만 입력해주세요");
					continue;
				}
				service.betPlayerValue(Integer.parseInt(rps));
				service.setComputerValue();
				service.whoWin();
				JOptionPane.showMessageDialog(null, service.showResult());
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;

			default:
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			}
		}
	}
}
