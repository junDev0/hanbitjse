package lotto;

import java.util.Arrays;

public class LottoBallServiceImpl implements LottoBallService{
	private int[] lotto;
	@Override
	public void setLottoBall() {
		LottoBean lot =new LottoBean();
		this.lotto = new int[6];
		int i = 0;
		while (true) {
			lot.setNumber();
			this.lotto[i] = lot.getNumber(); //0대신 식을 채우시오
			for (int n = 0; n < i; n++) {
				if(lotto[n]==lotto[i]){
					i--;
					continue;
				}
			}
			System.out.println(lotto[i]);
			i++;
			if(i==6){ // while문 조건식에 넣어서도 가능 while(i<6){} 이점: if문,break 안써도됨
				break;
			}
		}
		Arrays.sort(lotto);
		
		/*
		for (int i = 0; i < lotto.length; i++) { //이중for문 사용시
			lot.setNumber();
			this.lotto[i] = lot.getNumber();
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}
			}
		}
		*/
		
}

@Override
public int[] getLottoBall() {
	// TODO Auto-generated method stub
	return lotto;
}

}
