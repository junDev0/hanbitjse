package simpleRps;

public class SimpleRPSServiceImpl implements SimpleRPSService {

	@Override
	public String gameEngine(String result, String p) {
		int comp;
		switch (p) {
		case "1":
			comp = (int)(Math.random()*3)+1;
			switch (comp) {
			case 1:result = "TIE";break;
			case 2:result = "LOSE";break;
			case 3:result = "WIN";break;
			}
			break;
		case "2":
			comp = (int)(Math.random()*3)+1;
			switch (comp) {
			case 1:result = "WIN";break;
			case 2:result = "TIE";break;
			case 3:result = "LOSE";break;
			}
			
			break;
		case "3":
			comp = (int)(Math.random()*3)+1;
			switch (comp) {
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

}
