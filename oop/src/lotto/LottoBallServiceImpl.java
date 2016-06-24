package lotto;

public class LottoBallServiceImpl implements LottoBallService{
	private int[] lotto;
	@Override
	public void setLottoBall(LottoBean lot) {
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
			i++;
			if(i==6){
				i=0;
				break;
			}
		}
		
		
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
