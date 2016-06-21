package gameRps;

public class RPSBean {
	private String play,comp,result;
	private int playNum,compNum;

	

	public void setPlay(int play) {
		this.playNum = play;
		switch (play) {
		case 1:
			this.play="가위";
			break;
		case 2:
			this.play="바위";
			break;
		case 3:
			this.play="보";
			break;
		}
	}

	public void setComp(int comp) {
		this.compNum = comp;
		switch (comp) {
		case 1:
			this.comp="가위";
			break;
		case 2:
			this.comp="바위";
			break;
		case 3:
			this.comp="보";
			break;
		}
	}

	public void setPlayNum(int playNum) {
		this.playNum = playNum;
	}

	public void setCompNum(int compNum) {
		this.compNum = compNum;
	}

	public String getPlay() {
		return play;
	}

	public String getComp() {
		return comp;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getPlayNum() {
		return playNum;
	}

	public int getCompNum() {
		return compNum;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "결과 [플레이어=" + play + ", 컴퓨터=" + comp + ", 결과=" + result + "]";
	}

	
	
}
