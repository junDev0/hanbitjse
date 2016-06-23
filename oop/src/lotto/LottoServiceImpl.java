package lotto;

public class LottoServiceImpl implements LottoService {

	private int[][]lottos;
	private int[] lotto;
	private int count; //돈에 따른 회전수
	
	//회전수를 입력받아서 매트릭스로 로또 추첨
	@Override
	public void setLottos(LottoBean lot) {
		this.count = this.count(lot);
		this.lottos = new int[count][6];
		this.lotto = new int[6];
		int i = 0;
		if(count<0){
			this.lottos = null;
		}else{
			for (count = 0; count < lottos.length; count++) {
				while (true) {
					lot.setNumber();
					int num = lot.getNumber(); //0대신 식을 채우시오
					if(isDuplication(count, num)){	//조건문을 채우시오
						continue;
					}
					this.lottos[count][i] = num;
					i++;
					if(i==6){
						//if문을 완성하시오
						i=0;
						break;
					}
				}
			}
		}
	}

	//로또를 가져온다(완성)
	@Override
	public int[][] getLottos() {
		return lottos;
	}

	//중복방지(완성)
	@Override
	public boolean isDuplication(int count, int num) {
		for (int i = 0; i < lottos[count].length; i++) {
			if(lottos[count][i]==num){
				return true;
			}
		}
		return false;
	}

	//오름차순을 정렬(줄단위로 해당)
	@Override
	public void sort(int[] lot) {
		for (int i = 0; i < lot.length-1; i++) {
			for (int j = 0; j < lot.length-i-1; j++) {
				if (lot[j]>lot[j+1]) {
					//구글링 스왑정렬을 검색해서
					//응용한 코드 구현
					int temp = lot[j];
					lot[j] = lot[j+1];
					lot[j+1] = temp;
				}
			}
		}
	}

	//회전수구하기(완성))
	@Override
	public int count(LottoBean lot) {
		return lot.getMoney(); // 1000단위 횟수
	}

}
