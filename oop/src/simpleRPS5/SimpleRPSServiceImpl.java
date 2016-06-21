package simpleRPS5;

public class SimpleRPSServiceImpl implements SimpleRPSService {
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
			return "WIN";
		}else{
			return "LOSE";
		}
	}



	@Override
	public String getResult(String result) {
		// TODO Auto-generated method stub
		return "플레이어는 : " + bean.getValue(bean.getPlay())
			+"\n컴퓨터는 : " + bean.getValue(bean.getComp())
			+"\n승부 : "+ this.playgame(bean.getPlay());
	}

}
