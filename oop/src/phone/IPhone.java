package phone;

public class IPhone extends CelPhone{
	private String data;
	public final static String KIND = "스마트폰";
	public final static String BRAND = "아이폰";
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return KIND+"이기 때문에"+super.getMove()+","
				+super.getCompany() + "제품을 가지고"
				+super.getCall()+"이라고 통화하고"
				+this.getData()+"라고 문자를 보냈다.";
	}
	
	
}
