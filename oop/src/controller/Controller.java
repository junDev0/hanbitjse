/**
 * 
 */
package controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 15.
 * @author   : jun.dev
 * @fileName : Controller.java
 * @story    : 
 */
public class Controller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[메뉴]"
					+ "1."
					+ "2."
					+ "0.종료");
			
			switch (scan.next()) {
			case "1": break;
			case "2": break;
			case "0": JOptionPane.showConfirmDialog(null, "Closing OK?");
				return;

			default:
				break;
			}
		}
	}
}
