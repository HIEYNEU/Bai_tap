package BaiLam.Mainprogram;

import java.util.Scanner;
public class Main {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				InputMember.input();
				break;
			case 2:
				InputLich.InputLichTruc();
				break;
			case 3:
				InputLich.InputLichHoc();
				break;
			case 4:
				InputLich.InputLichDay();
				break;
			case 5:
				OutputLich.OutputLichHoc();
				break;
			case 6:
				OutputLich.OutputLichDay();
				break;
			case 7:
				OutputLich.OutputLichTruc();
				break;
			case 8:
				System.out.println("Thoat");
				break;
				default:
					System.out.println("Nhap lai");
			}
		} while(choose!=8);
	}
	static public void showMenu() {
		System.out.println("1.Nhap vao danh sach nhan su");
		System.out.println("2.Nhap vao bang lich truc");
		System.out.println("3.Nhap vao bang lich hoc");
		System.out.println("4.Nhap vao bang lich day");
		System.out.println("5.In ra lich hoc");
		System.out.println("6.In ra lich day");
		System.out.println("7.In ra lich truc");
		System.out.println("8.Thoat");
		System.out.print("Chon: ");
	}
}
