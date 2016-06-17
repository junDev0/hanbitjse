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
	      Date date = new Date();
	        
	        
	        System.out.println();
		while (true) {
			
			switch (JOptionPane.showInputDialog("1.등록 2.조회 0.종료")) {
			case "1":
			String name = JOptionPane.showInputDialog("이름");
			String id = JOptionPane.showInputDialog("아이디");
			String pw = JOptionPane.showInputDialog("비밀번호"); //비번빼고 접근불가.
			String ssn = JOptionPane.showInputDialog("주민번호 ex)880101-1");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			st = new Student(id, pw, name, ssn,sdf.format(date));
			JOptionPane.showMessageDialog(null, "등록이 완료되었습니다.");
			break;
			case "2":
				JOptionPane.showMessageDialog(null, "이름 : "+st.getName()
											    +"\n아이디 : "+st.getId()
											    +"\n성별   :"+st.getGender()
											    +"\n등록날짜 : "+st.getRegDate() );
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
