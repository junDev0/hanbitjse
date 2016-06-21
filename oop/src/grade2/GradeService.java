package grade2;

public interface GradeService { //메소드 정의 추상적으로
	public String gradeCheck(int kor,int eng, int math);
	public void gradeInit(String name, int kor, int eng, int math);
	public int gradeTotal();
	public int gradeAvg();
	public String gradeRank();
	public String gradeResult(String result);
}
