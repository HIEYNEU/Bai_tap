package BaiLam.Utils;

import java.util.Scanner;

public class ScannerUtils {
	public static int readInt(Scanner sc,String errorMess) {
		while(true) {
			try {
				return Integer.parseInt(sc.nextLine());
			}
			catch(Exception ex){
				showError(errorMess);
			}
		}
	}
	static public int readInt(Scanner sc,String errorMess,int max,int min) {
		while(true) {
			try {
				int a=Integer.parseInt(sc.nextLine());
				if(a<min||a>max) {
					System.out.println("Ban phai nhap mot so trong khoang "+max+" "+min);
					System.out.println("Nhap lai");
				}
				else return a;
			}
			catch(Exception ex) {
				showError(errorMess);
			}
		}
	}
	static public String readStr(Scanner sc,String errorMess) {
		while(true) {
			try {
				return sc.nextLine();
			}
			catch(Exception ex) {
				showError(errorMess);
			}
		}
	}
	public static float readFloat(Scanner sc,String errorMess) {
		while(true) {
			try {
				return Float.parseFloat(sc.nextLine());
			}
			catch(Exception ex) {
				showError(errorMess);
			}
		}
	}
	private static void showError(String mess) {
		System.out.println("Error: "+mess);
		System.out.print("Nhap lai: ");
	}
}
