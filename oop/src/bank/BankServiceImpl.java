package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date     : 2016. 6. 27.
 * @author   : jun
 * @fileName : BankServiceImpl.java
 * @story    :
 */

public class BankServiceImpl implements BankService{
	
	List<AccountBean> list = new ArrayList<AccountBean>();
	
	@Override
	public void openAccount(AccountBean bean) {
		list.add(bean);
	}

	@Override
	public String accountList() {
		String totalList = "";
		for (int i = 0; i <list.size(); i++) {
			totalList = totalList+"\n"+list.get(i).toString();
		}
		if(totalList.equals("")){
			totalList = "결과없음";
		}
		return totalList;
	}

	@Override
	public String findByAccountNo(String accountNo) {
		String result = "결과없음";
		for (int i = 0; i < list.size(); i++) {
			if(accountNo.equals(String.valueOf(list.get(i).getAccountNO()))){
				result = list.get(i).toString();
			}
		}
		return result;
	}

	@Override
	public String findByName(String name) {
		String nameResult = "";
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(String.valueOf(list.get(i).getName()))){
				nameResult = nameResult+"\n"+list.get(i).toString();
			}
		}
		if(nameResult.equals("")){
			nameResult = "결과없음";
		}
		return nameResult;
		
	}

	@Override
	public int count() {
		return list.size();
	}

	@Override
	public void showAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String updateAccount(String accountNo, String oldPw,String newPw) {
		String updateResult = "계좌번호와 비밀번호가 일치하지 않습니다.";
		for (int i = 0; i < list.size(); i++) {
			if(accountNo.equals(list.get(i).getId())&&oldPw.equals(list.get(i).getPw())){
				list.get(i).setPw(newPw);
				updateResult = "비밀번호가 수정되었습니다.";
			}
		}
		return updateResult;
		
	}

	@Override
	public String deleteAccount(String name, String id, String pw) {
		String delResult = "해당계좌 정보가 일치하지 않습니다.";
		for (int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())&&id.equals(list.get(i).getId())
			  &&pw.equals(list.get(i).getPw())){
				list.remove(list.get(i));
				delResult = "해당계좌가 해지되었습니다.";
			}
		}
		return delResult;
	}

}
