package branch;

import java.util.Scanner;

/**
 * @date     : 2016. 6. 8.
 * @author   : hb2007
 * @finename : Calc.java
 * @story    : 
 */
public class Calc {
	/*
	 * 두개의 정수를 입력받아서 
	 * 연산자 값이 1이면 덧셈
	 * 2면 뺄셈
	 * 3이면 곱셈
	 * 4면 나눗셈(몫)
	 * 5면 나머지(나머지)
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1=0,num2=0,count=0,result= 0;
		String symbol = "";
		System.out.print("첫번째 정수 입력 : ");
		num1 = scan.nextInt();
		System.out.print("연산자 입력 : ");
		count = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		num2 = scan.nextInt();
		if (count == 1) {
			result = num1+num2;
			symbol="+";
		}else if(count == 2){
			result = num1-num2;
			symbol ="-";
		}else if(count == 3){
			result = num1*num2;
			symbol = "*";
		}else if(count == 4){
			result = num1/num2;
			symbol ="/";
		}else if(count == 5){
			result = num1%num2;
			symbol ="%";
		}else{
			System.out.println("1~5까지만 입력바랍니다.");
			return;
		}
		
		System.out.println(num1+" "+symbol+" "+num2+" = "+result);
	}

}
