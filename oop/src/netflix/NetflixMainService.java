package netflix;

public interface NetflixMainService {
	public void ComboBox(); //메뉴,알림메세지,USER정보 마우스 오버시 
	public void MovieInfoPage(String Moive); //영화 정보 페이지 
	public void PageMove(String move); //페이지 이동 ex)메뉴-내동영상 목록 이동시
	public void SerchMovie(String word); //검색어 입력 후 페이지 전환
	public void AlramMessage(); //알림 메세지
	public void Logout(); //로그아웃
	

}
