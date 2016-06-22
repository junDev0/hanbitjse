package phone;

public class Phone {
	private String company,call;
	public final static String KIND = "유선전화기";

	public void setCompany(String company) {
		this.company = company;
	}
	public void setCall(String call) {
		this.call = call;
	}

	public String getCall() {
		return call;
	}
	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Phone [회사=" + company + ", 통화내용=" + call + "]";
	}
	
	
}
