package lotto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 24.
 * @author   : jun.dev
 * @fileName : SBSMain.java
 * @story    : 
 */
public class LottoBallMain {
	public static void main(String[] args) {
		LottoBean lot = new LottoBean();
		LottoBallService service = new LottoBallServiceImpl();
				StringBuffer sb= new StringBuffer();
				service.setLottoBall(lot); // 로또 번호 생성 및 정렬
				int[] lotto = service.getLottoBall(); // 생성된 로또 번호 가져오기.
				System.out.println("=== 로또추첨 ===");
				for (int i = 0; i < lotto.length; i++) {
					
					sb.append(lotto[i]+"\t");
				}
				System.out.println("\n"+sb);
				File output = new File("C:\\eclipse\\lotto\\lottoball.txt");
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
