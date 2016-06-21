package gameRps;

import java.util.Random;

public class RPSServiceImpl implements RPSService{

	RPSBean rps;
	
	@Override
	public void betPlayerValue(int playerValue) {
		rps = new RPSBean();
		rps.setPlay(playerValue);
	}

	@Override
	public void setComputerValue() {
		rps.setComp((int)((Math.random()*3)+1));
	}

	@Override
	public void whoWin() {
		//숫자로 비교
		int user = rps.getPlayNum();
		int comp = rps.getCompNum();
		switch ((user-comp+3)%3) {
		case 0:rps.setResult("비김!");break;
		case 1:rps.setResult("유저승리");break;
		case 2:rps.setResult("유저패배!");break;
		}
		
		/* 문자열로 비교
		if(rps.getPlay().equals(rps.getComp())){
			rps.setResult("비김");
		}else{
			rps.setResult("컴퓨터승리!");
			switch (rps.getPlay()) {
			case "가위":
				if(rps.getComp().equals("보")){
					rps.setResult("유저승리!");
				}
				break;
			case "바위":
				if(rps.getComp().equals("가위")){
					rps.setResult("유저승리!");					
				}
				
				break;
			case "보":
				if(rps.getComp().equals("바위")){
					rps.setResult("유저승리!");					
				}
				
				break;
}
		}
		*/

	}

	@Override
	public String showResult() {
		
		return rps.toString();
	}

	@Override
	public boolean checkValidation(String rps) {
		boolean result = Integer.parseInt(rps)>3&&Integer.parseInt(rps)<1?false:true;
		return result;
	}

}
