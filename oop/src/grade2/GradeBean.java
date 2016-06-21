package grade2;

/**
 * @date     : 2016. 6. 21.
 * @author   : jun.dev
 * @fileName : GradeBean.java
 * @story    : 
 */
public class GradeBean { // Bean은 지금상태에서 수정 안함
	private int kor,eng,math;
	private String name;

	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "학점결과 "
				+ "\n[국어=" + kor
				+ "\n영어=" + eng
				+ "\n수학=" + math
				+ "\n이름=" + name;
	}
	
	
	
}
