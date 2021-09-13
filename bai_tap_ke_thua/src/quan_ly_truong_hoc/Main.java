package quan_ly_truong_hoc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		ArrayList<GiaoVien>giaovien=new ArrayList<GiaoVien>();
		ArrayList<HocSinh>hs=new ArrayList<HocSinh>();
		ArrayList<NhanVienBaoVe>baove=new ArrayList<NhanVienBaoVe>();
		ArrayList<NhanVienVeSinh>laocong=new ArrayList<NhanVienVeSinh>();
		int numhs,numgv,numbv,numlc;
		do {
			showMenu();
			choose=Integer.parseInt(in.nextLine());
			switch(choose){
			case 1:
				System.out.print("Nhap so luong giao vien: ");
				numgv=Integer.parseInt(in.nextLine());
				for(int i=0;i<numgv;i++) {
					GiaoVien teacher=new GiaoVien();
					teacher.input();
					giaovien.add(teacher);
				}
				break;
			case 2:
				System.out.print("Nhap so luong hoc sinh: ");
				numhs=Integer.parseInt(in.nextLine());
				for(int i=0;i<numhs;i++) {
					HocSinh student=new HocSinh();
					student.input();
					hs.add(student);
				}
				break;
			case 3:
				System.out.print("Nhap so luong bao ve: ");
				numbv=Integer.parseInt(in.nextLine());
				for(int i=0;i<numbv;i++) {
					NhanVienBaoVe bv=new NhanVienBaoVe();
					bv.input();
					baove.add(bv);
				}
				break;
			case 4:
				System.out.print("Nhap so luong lao cong: ");
				numlc=Integer.parseInt(in.nextLine());
				for(int i=0;i<numlc;i++) {
					NhanVienVeSinh lc=new NhanVienVeSinh();
					lc.input();
					laocong.add(lc);
				}
				break;
			case 5:
				for(int i=0;i<giaovien.size();i++) {
					giaovien.get(i).display();
					System.out.println("--------------------------------------------------------");
				}
				break;
			case 6:
				for(int i=0;i<hs.size();i++) {
					hs.get(i).display();
					System.out.println("--------------------------------------------------------");
				}
				break;
			case 7:
				for(int i=0;i<baove.size();i++) {
					baove.get(i).display();
					System.out.println("--------------------------------------------------------");
				}
				break;
			case 8:
				for(int i=0;i<laocong.size();i++) {
					laocong.get(i).display();
					System.out.println("--------------------------------------------------------");
				}
				break;
			case 9:
				System.out.println("Thoat");
				break;
			default:
				System.out.println("Nhap lai");
				break;
			}
		}while(choose!=9);
	}
	static void showMenu() {
		System.out.println("1.Nhap vao danh sach giao vien");
		System.out.println("2.Nhap vao danh sach hoc sinh");
		System.out.println("3.Nhap vao danh sach bao ve");
		System.out.println("4.Nhap vao danh sach lao cong");
		System.out.println("5.In ra danh sach giao vien");
		System.out.println("6.In ra danh sach hoc sinh");
		System.out.println("7.In ra danh sach bao ve");
		System.out.println("8.In ra danh sach lao cong");
		System.out.println("9.Thoat");
		System.out.print("Chon: ");
	}

}
