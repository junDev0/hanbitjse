/**
 * 
 */
package school;

import java.text.SimpleDateFormat;

/**
 * @date     : 2016. 6. 17.
 * @author   : jun.dev
 * @fileName : StudentImplement.java
 * @story    : 
 */
public class StudentServiceImpl implements StudentService{
	StudentBean st;

	@Override
	public void registStudent(String name, String id, String pw, String ssn, String regDate) {
		st = new StudentBean(name,id,pw,ssn,regDate);
	}

	@Override
	public String showStudent() {
		return st.toString();
	}

	@Override
	public String updateStudent(String pw) {
		st.setPw(pw);
		return "비밀번호 수정이 완료되었습니다.";
	}

	@Override
	public String deleteStudent() {
		st = null;
		return "초기화가 완료되었습니다.";
	}



}
