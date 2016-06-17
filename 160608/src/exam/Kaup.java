package exam;

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
		
		Scanner scan = new Scanner(System.in); //스캐너
		String name = "",result=""; //고객이름 
		double weight=0,height=0,numResult=0; //키,몸무게
		
		System.out.println("§비만지수 측정 프로그램");
		
		System.out.print("고객이름 : ");
		name = scan.next();
		System.out.print("키 : ");
		height = scan.nextInt();
		
		if(height < 1){
			System.out.println("1이하의 숫자는 입력할수 없습니다.");
			return;
		}
		System.out.print("몸무게 : ");
		weight = scan.nextInt();
		if(weight < 1){
			System.out.println("1이하의 숫자는 입력할수 없습니다.");
			return;			
		}
		
		numResult = (weight/(height/100))/(height/100); //비만지수
		if(numResult <18.5){
			result = "저체중";
		}else if(numResult >18.4 && numResult <23){
			result = "정상체중";
		}else if(numResult >=25 && numResult<30){
			result = "비만 1단계";			
		}else if(numResult>=30 && numResult<40){
			result = "비만 2단계";			
		}else if(numResult>=40){
			result = "비만 3단계";			
		}
		System.out.println(name+"님은 키:"+height+"cm, 몸무게:"+weight+
							"\n체적지수:"+numResult+" 이므로"+result+"입니다.");
		
		
	}
}
