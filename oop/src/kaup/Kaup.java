/**
 * 
 */
package kaup;

/**
 * @date     : 2016. 6. 15.
 * @author   : jun.dev
 * @fileName : kaup.java
 * @story    : 
 */
public class Kaup {
	String name,height,weight;
	
		public void setName(String name){
			this.name = name;
		}
		public void setHeight(String height){
			this.height = height;
		}
		public void setWeight(String weight){
			this.weight = weight;
		}
	
		public String getName() {
			return name;
		}
		public String getHeight() {
			return height;
		}
		public String getWeight() {
			return weight;
		}
		


		public String execute(){
			String result = "";
			double height = Double.parseDouble(this.height),
					weight = Double.parseDouble(this.weight);
			double kaup = weight / (height / 100) / (weight / 100);
			
			if (kaup < 18.5) {
				result = "저체중";
			}else if(kaup < 22.9 && kaup > 18.5){
				result = "정상";
			}else if(kaup < 24.9 && kaup > 23.0){
				result = "위험체중";
			}else if(kaup < 29.9 && kaup > 25.0){
				result = "비만1단계";
			}else if(kaup < 40 && kaup > 30.0){
				result = "비만2단계";
			}else if(kaup >= 40){
				result = "비만3단계";
			}
			return "카우푸 지수 : " + String.format("%.2f", kaup) + " 이고 " +result + " 입니다";
		}

	}

