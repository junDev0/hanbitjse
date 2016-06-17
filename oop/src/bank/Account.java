/**
 * 
 */
package bank;

import java.util.Random;

/**
 * @date     : 2016. 6. 16.
 * @author   : jun.dev
 * @fileName : Account.java
 * @story    : 
 */
public class Account {
	private int accountNO;
	private String name;
	private int money;
	private String bankName;
	private String pw;
	private String id;
	
	public Account(String name) {
		int max= 999999,min=100000;
		this.accountNO = (int)(Math.random()*max)+min;
		this.name = name;
	}
	public void setAccountNO() {
		int max= 999999,min=100000;
		this.accountNO = (int)(Math.random()*max)+min;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setId(String id) {
		this.id = id;
	}

	public int getAccountNO() {
		return accountNO;
	}
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	public String getBankName() {
		return bankName;
	}
	public String getPw() {
		return pw;
	}
	public String getId() {
		return id;
	}
	
	
}
