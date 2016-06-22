package grade2;

public class GradeServiceImpl implements GradeService {
	GradeBean bean = new GradeBean();

	
	// 과목별 점수 체크
	@Override
	public String gradeCheck(int kor, int eng, int math) {
		if ((kor >= 101 || kor<0)&&(eng >= 101 || eng<0)&&(math >= 101 || math<0)){
			return "재입력";
		}else{
			return "완료";
		}
	}
	
	// 이름,과목별 점수 저장
	@Override
	public void gradeInit(String name, int kor, int eng, int math) {
		bean.setName(name);
		bean.setKor(kor);
		bean.setEng(eng);
		bean.setMath(math);
	}

	// 총점계산
	@Override
	public int gradeTotal() {
		int sum = bean.getKor()+bean.getEng()+bean.getMath();
		return sum;
	}
	
	// 평균계산
	@Override
	public int gradeAvg() {
		int avg = this.gradeTotal()/3;
		return avg;
	}

	// 학점계산
	@Override
	public String gradeRank() {
		int avg = this.gradeAvg();
		String qwe = "";
		if (avg >= 90) {
			qwe = "A";
		} else if (avg >= 80) {
			qwe = "B";
		} else if (avg >= 70) {
			qwe = "C";
		} else if (avg >= 60) {
			qwe = "D";
		} else if (avg >= 50) {
			qwe = "E";
		} else if (avg >= 49) {
			qwe = "F";
		}
		
		return qwe;

	}

	// 결과 출력
	@Override
	public String gradeResult(String result) {
		return bean.toString()
			+"\n총점 = "+this.gradeTotal()
			+"\n평균 = "+this.gradeAvg()
			+"\n학점 = "+result+"";
	}

}
