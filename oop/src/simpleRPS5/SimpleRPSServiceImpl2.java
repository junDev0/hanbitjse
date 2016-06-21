package simpleRPS5;

public class SimpleRPSServiceImpl2 implements SimpleRPSService {
	SimpleRPSBean bean = new SimpleRPSBean();
	@Override
	public String playgame(int player) {
		String result = "";
		bean.setPlay(player);
		bean.setComp();
		int com = bean.getComp();
		int ply = bean.getPlay();
		int win = 0;
		String winner = "";
		if(com==ply){
			return "TIE";
		}
		switch (Math.abs(ply-com)) {
		case 1:win=(ply>com)?ply:com;break;
		case 2:win=(ply>com)?com:ply;break;

		default:
			break;
		}
		winner = (win==ply)?"플레이어":"컴퓨터";
		result = winner+"승리";
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
