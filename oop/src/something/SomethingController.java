/**
 * 
 */
package something;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 17.
 * @author   : jun.dev
 * @fileName : something.java
 * @story    : 
 */
public class SomethingController {
	/**
	 * 데이터베이스에 컬럼값은
	aaa(text)
	bbb(text)
	ccc(number)
	ddd(number)이며

	이중 기본값은 bbb,ccc 입니다.
	그리고 그중에서 ccc는 보안에
	민감한 값이고
	bbb는 수정 가능한 값입니다.
	 * @param args
	 */
	public static void main(String[] args) {
		Something st = new Something();
		while (true) {


			switch (JOptionPane.showInputDialog("-메뉴- 1.등록 2.조회 0.종료")) {
			case "1":
				String aaa = JOptionPane.showInputDialog("aaa 입력"); 
				String bbb = JOptionPane.showInputDialog("bbb 입력"); 
				String ccc = JOptionPane.showInputDialog("ccc 입력 ex)숫자만 입력하세요"); 
				String ddd = JOptionPane.showInputDialog("ddd 입력 ex)숫자만 입력하세요"); 
				st = new Something(bbb,Integer.parseInt(ccc));
				st.setAaa(aaa);
				st.setDdd(Integer.parseInt(ddd));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "aaa : "+st.getAaa()+
													"\nbbb : "+st.getBbb()+
													"\nccc : "+st.getCcc()+
													"\nddd : "+st.getDdd());
				break;
			default:
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			}
		}
	}
}
