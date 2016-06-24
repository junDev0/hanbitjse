package lotto2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 23.
 * @author   : jun.dev
 * @fileName : LottoController.java
 * @story    : 
 */
public class LottoMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoService service = new LottoServiceImpl();
				StringBuffer sb= new StringBuffer();
				String money = JOptionPane.showInputDialog("얼마치 구입?");
				char moneyChar = money.charAt(0);
				lot.setMoney(Integer.parseInt(String.valueOf(moneyChar)));
				service.setLottos(lot);
				int[][] lottos = service.getLottos();
				System.out.println("=== 로또번호 ===");
				for (int i = 0; i < lottos.length; i++) {
					//service.sort(lottos[i]);
					Arrays.sort(lottos[i]);
					for (int j = 0; j < lottos[i].length; j++) {
						sb.append(lottos[i][j]+"\t");
					}
					sb.append("\n");
				}
				System.out.println("\n"+sb);
				int lottoSerialNo = (int) (Math.random()*999999+100000);
				File output = new File("C:\\eclipse\\lotto\\"+lottoSerialNo+".txt");
				BufferedWriter bw = null;
				String[]myLotto = sb.toString().split("/");
				
				try {
					 //뒤에 true는 이어쓰기
					bw = new BufferedWriter(new FileWriter(output,true));
					for(String lots : myLotto){
						lots += System.getProperty("line.separator");
						bw.write(lots);
					}
				} catch (Exception e) {
				}finally {
					
						try {
							bw.flush();
							bw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					
				}
	}
}
