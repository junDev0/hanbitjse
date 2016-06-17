package branch;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 10.
 * @author   : hb2007
 * @finename : Kaup.java
 * @story    : 
 */
public class Kaup {
	/**
	 * 개발자님 프로그램 제작의뢰입니다.
	 * 비만지수를 구하는 것인데
	 * 키와 몸무게를 입력하면 당사자가
	 * 비만인지 저체중인지 알려주는
	 * 프로그램을 만들어주세요.
	 * 돈은 입금했습니다.
	 * 잘은 모르는데 kaup 공식을 쓰면 됨
	 * 체중/키
	 */
	
	public static void main(String[] args) {
		//--------init--------
		Scanner scan = new Scanner(System.in);
		String name = "",result="";
		double height=0.0,weight=0.0,kaup=0.0;
		//------- op --------
		System.out.println("이름?");
		name = scan.next();
		System.out.println("키?");
		height = scan.nextDouble();
		System.out.println("몸무게?");
		weight = scan.nextDouble();
		
		kaup = (weight/(height/100))/(height/100); //비만지수

		if(kaup <18.5){
			result = "저체중";
		}else if(kaup >18.4 && kaup <23){
			result = "정상체중";
		}else if(kaup >=25 && kaup<30){
			result = "비만 1단계";			
		}else if(kaup>=30 && kaup<40){
			result = "비만 2단계";			
		}else if(kaup>=40){
			result = "비만 3단계";			
		}
		System.out.println(name+"홍길동은 BMI지수는"+Double.parseDouble(String.format("%.2f%n", kaup))+"이고, "+result+"비만이다.");

	}
}
