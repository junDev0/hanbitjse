/**
 * 
 */
package school;

import java.text.SimpleDateFormat;

/**
 * @date     : 2016. 6. 16.
 * @author   : jun.dev
 * @fileName : student.java
 * @story    : 
 */
public class Student {
	private String id,pw,name,regDate,gender,ssn;
	private int age;
	
	/**
	 * 
	 */
	public Student(String id, String pw, String name, String ssn,String regDate) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.ssn = ssn;
		this.regDate =regDate;
		genderResult(ssn); //성별, 나이 계산
	}
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the pw
	 */
	public String getPw() {
		return pw;
	}
	/**
	 * @param pw the pw to set
	 */
	public void setPw(String pw) {
		this.pw = pw;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the regDate
	 */
	public String getRegDate() {
		return regDate;
	}
	/**
	 * @param regDate the regDate to set
	 */
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public void genderResult(String ssn){
		/*
		ssn = ssn.substring(7);
		this.gender = "남자";
		if(Integer.parseInt(ssn)%2==0){
			this.gender = "여자";
		}
		*/
		//init
		String [] Num= new String [2];
		Num = ssn.split("-");
		
		//성별구분
		switch (Integer.parseInt(Num[1])%2) {
		case 0:	this.gender = "여자";
			break;

		default:this.gender = "남자";
			break;
		}
		
		//나이구분
		Num[0] = Num[0].substring(0, 2);
		int userYear = 1900+Integer.parseInt(Num[0]);
		if(Num[1].equals("3")||Num[1].equals("4")){
			userYear = 2000+Integer.parseInt(Num[0]);
		}
		

		String currentYear = new SimpleDateFormat("yyyy").format(System.currentTimeMillis()); 
		this.age =Integer.parseInt(currentYear)-userYear;
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학생 [아이디=" + id + ", 비번= ****, 이름=" + name + ", 등록일=" + regDate + ", 성별=" + gender
				+ ", 주민번호=" + ssn + ", 나이=" + age + "]";
	}
	
}
