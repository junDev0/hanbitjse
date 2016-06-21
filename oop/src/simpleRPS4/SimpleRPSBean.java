package simpleRPS4;

public class SimpleRPSBean {
	private String result,value; //value 숫자에 대응하는 가위바위보 값
	private int play,comp;

	

	public void setPlay(int play) {
		this.play = play;
	}

	public void setComp() {
		this.comp = (int)(Math.random()*3)+1;

	}

	public int getPlay() {
		return play;
	}

	public int getComp() {
		return comp;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getValue(int out) {
		switch (out) {
		case 1:this.value = "가위";break;
		case 2:this.value = "바위";break;
		case 3:this.value = "보";break;

		default:
			break;
		}
		return value;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "배팅값 [ 플레이어=" + play + ", 컴퓨터=" + comp + "value="+value+"]"; 
	}


	
	
}
