/**
 * 
 */
package school;

/**
 * @date     : 2016. 6. 16.
 * @author   : jun.dev
 * @fileName : student.java
 * @story    : 
 */
public class Student {
	private String id,pw,name,regDate,gender,ssn;
	private int age;
	public final static String SCHOOL_NAME="한빛학원";
	
	/**
	 * 
	 */
	public Student(String id, String pw, String name, String ssn,String regDate) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.ssn = ssn;
		this.gender = genderResult(ssn);
		this.regDate =regDate;
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
	
	public String genderResult(String ssn){
		ssn = ssn.substring(7);
		this.gender = "남자";
		if(Integer.parseInt(ssn)%2==0){
			this.gender = "여자";
		}
		return this.gender;
	}
	
}
