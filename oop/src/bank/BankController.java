/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 15.
 * @author   : jun.dev
 * @fileName : BankController.java
 * @story    : 
 */
public class BankController {
	String s = "";
	public static void main(String[] args) {
		Account account = null;
		//showInputDialog 스캐너
		//showMessageDialog 출력 sysout
		//showConfirmDialog
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.개설. 2.입금 3.조회. 4.출금 5.계좌번호 0.종료")) {
			case "1":
				int ok = JOptionPane.showConfirmDialog(null, "계좌개설하시겠습니까?");
				if(ok==0){
					String name = JOptionPane.showInputDialog(null,"이름 입력 : ");
					account = new Account(name);
				}else{
					continue;
				}
				
				JOptionPane.showMessageDialog(null, "계좌가 생성되었습니다.");
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				account.setMoney(Integer.parseInt(inputMoney));
				JOptionPane.showMessageDialog(null, "입금액 : "+Integer.parseInt(inputMoney)+"원");
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "잔액 : "+account.getMoney()+"원");
				break;
			case "4":
				String outputMoney = JOptionPane.showInputDialog("출금액?");
				if(Integer.parseInt(outputMoney) < 0 ){
					JOptionPane.showMessageDialog(null, "-는 들어갈수없습니다.");
				}
				if(Integer.parseInt(outputMoney) > account.getMoney() ){
					JOptionPane.showMessageDialog(null, "잔액이 부족합니다.");
				}
				account.setMoney(account.getMoney()-Integer.parseInt(outputMoney));
				JOptionPane.showMessageDialog(null, Integer.parseInt(outputMoney)+"원이 출금되었습니다.");
				break;
			case "5":
				JOptionPane.showMessageDialog(null, "이름 : "+account.getName()+"\n계좌번호 : "+account.getAccountNO());
				break;
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			default:JOptionPane.showMessageDialog(null, "1~4의 메뉴를 입력해주세요");
			return;
			}
		}
	}
}
