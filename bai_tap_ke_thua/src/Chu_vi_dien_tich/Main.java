package Chu_vi_dien_tich;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		Square hinhvuong = new Square();
		Rectangle chunhat =new Rectangle();
		Triangle tamgiac=new Triangle();
		Parallogram binhhanh=new Parallogram();
		do {
			choose=Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				hinhvuong.input();
				System.out.printf("chu vi hinh vuong la: %d\n",hinhvuong.chuvi());
				System.out.printf("Dien tich hinh vuong la: %d\n",hinhvuong.dientich());
				break;
			case 2:
				chunhat.input();
				System.out.printf("Chu vi hinh chu nhat la: %d\n",chunhat.chuvi());
				System.out.printf("Dien tinh hinh chu nhat la: %d\n",chunhat.dientich());
				break;
			case 3:
				tamgiac.input();
				System.out.printf("Chu vi hinh tam giac la: %d\n",tamgiac.chuvi());
				System.out.print("Dien tich hinh tam giac la: ");
				System.out.println(tamgiac.dientich());
				break;
			case 4:
				binhhanh.input();
				System.out.printf("Chu vi hinh binh hanh la: %d\n",binhhanh.chuvi());
				System.out.printf("Dien tich hinh binh hanh la: %d\n",binhhanh.dientich());
				break;
			case 5:
				System.out.println("Thoat");
				break;
			default:
				System.out.println("Nhap lai");
				break;
			}
		}while(choose!=5);
	}
	static void showMenu() {
		System.out.println("1.Hinh vuong");
		System.out.println("2.Hinh chu nhat");
		System.out.println("3.Hinh binh hanh");
		System.out.println("4.Hinh tam giac");
		System.out.println("5.Thoat");
		System.out.print("Chon: ");
	}
}
