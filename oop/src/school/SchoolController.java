/**
 * 
 */
package school;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 16.
 * @author   : jun.dev
 * @fileName : SchoolController.java
 * @story    : 
 */
public class SchoolController {
	/**
	 * 1.등록 : ssn,id,pw,name,gender 입력받음 ssn:주민번호
	 * 2.조회 : name,id,gender 조회
	 */
	public static void main(String[] args) {
		Student st = new Student();
	        
	        
	        System.out.println();
		while (true) {
			
			switch (JOptionPane.showInputDialog("1.등록 2.조회 0.종료")) {
			case "1":
			String name = JOptionPane.showInputDialog("이름");
			String id = JOptionPane.showInputDialog("아이디");
			String pw = JOptionPane.showInputDialog("비밀번호"); //비번빼고 접근불가.
			String ssn = JOptionPane.showInputDialog("주민번호 ex)880101-1");
			st = new Student(id, pw, name, ssn,
					new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
			JOptionPane.showMessageDialog(null, "등록이 완료되었습니다.");
			break;
			case "2":
				JOptionPane.showMessageDialog(null, st.toString());
				break;
			case "0": 
				int ok = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				if(ok == 0){
					return;
				}
				break;

			default: JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
			break;
			}
			
		}
	}
}
