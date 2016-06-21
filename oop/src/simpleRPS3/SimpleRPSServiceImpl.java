package simpleRPS3;

public class SimpleRPSServiceImpl implements SimpleRPSService {
	SimpleRPSBean bean = new SimpleRPSBean();
	@Override
	public String playgame(int player) {
		String result = "";
		bean.setPlay(player);
		bean.setComp();
		switch (player) {
		case 1:
			switch (bean.getComp()) {
			case 1:result = "TIE";break;
			case 2:result = "LOSE";break;
			case 3:result = "WIN";break;
			}
			break;
		case 2:
			switch (bean.getComp()) {
			case 1:result = "WIN";break;
			case 2:result = "TIE";break;
			case 3:result = "LOSE";break;
			}
			
			break;
		case 3:
			switch (bean.getComp()) {
			case 1:result = "LOSE";break;
			case 2:result = "WIN";break;
			case 3:result = "TIE";break;
			}
			
			break;
		default:
			break;
		}
		return result;	
	}



	@Override
	public String getResult(String result) {
		// TODO Auto-generated method stub
		return "플레이어는 : " + bean.getValue(bean.getPlay())
			+"\n컴퓨터는 : " + bean.getValue(bean.getComp())
			+"\n승부 : "+ this.playgame(bean.getPlay());
	}

}
