package phone;

/**
 * @date     : 2016. 6. 22.
 * @author   : jun.dev
 * @fileName : CelPhone.java
 * @story    : 
 */
public class CelPhone extends Phone{
	private String move;
	private boolean portable; //이동성
	public final static String KIND = "휴대폰";
	

	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if(portable){
			this.setMove("이동가능하고");
		}else{
			this.setMove("이동불가능");
		}
	}
	@Override
	public String toString() {
		return KIND+"이기 때문에"+move+","
				+super.getCompany() + "제품을 가지고"
				+super.getCall()+"이라고 한다.";
	}
	
	
}