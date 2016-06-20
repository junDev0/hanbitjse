package gameRps;

public interface RPSService {
	public void betPlayerValue(int playerValue);
	public void setComputerValue();
	public void whoWin();
	public String showResult();
	public boolean checkValidation(String rps); //유효성체크 1~3이상의 값 들어왔을시
}
