package BaiLam.Mainprogram;

import java.util.Scanner;

import BaiLam.DSach.BangLichDay;
import BaiLam.DSach.BangLichHoc;
import BaiLam.DSach.BangLichTruc;
import BaiLam.DSach.DanhSachNhanSu;
import BaiLam.Infor.BaoVe;
import BaiLam.Infor.GiangVien;
import BaiLam.Infor.SinhVien;
import BaiLam.Infor.VeSinh;
import BaiLam.Lich.LichDay;
import BaiLam.Lich.LichHoc;
import BaiLam.Lich.LichTruc;

public class Main {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				System.out.println("Doi tuong muon nhap la");
				DanhSachDoiTuong();
				doiTuong=Integer.parseInt(in.nextLine());
				switch(doiTuong) {
				case 1:
					System.out.print("So luong sinh vien muon them: ");
					soLuong=Integer.parseInt(in.nextLine());
					for(int i=0;i<soLuong;i++) {
						System.out.print("Nhap vao ho: ");
						String ho=in.nextLine();
						System.out.print("Nhap vao ten: ");
						String ten=in.nextLine();
						System.out.print("Nhap vao tuoi: ");
						int tuoi=Integer.parseInt(in.nextLine());
						System.out.println("Chon gioi tinh");
						GT();
						int gioiTinh=Integer.parseInt(in.nextLine());
						System.out.println("Nhap vao hinh thuc hoc tap");
						sType();
						int type=Integer.parseInt(in.nextLine());
						DanhSachNhanSu.addToList(new SinhVien(ho,ten,tuoi,gioiTinh,type));
					}
					break;
				case 2:
					System.out.print("So luong giang vien muon them: ");
					soLuong=Integer.parseInt(in.nextLine());
					for(int i=0;i<soLuong;i++) {
						System.out.print("Nhap vao ho: ");
						String ho=in.nextLine();
						System.out.print("Nhap vao ten: ");
						String ten=in.nextLine();
						System.out.print("Nhap vao tuoi: ");
						int tuoi=Integer.parseInt(in.nextLine());
						System.out.println("Chon gioi tinh");
						GT();
						int gioiTinh=Integer.parseInt(in.nextLine());
						DanhSachNhanSu.addToList(new GiangVien(ho,ten,tuoi,gioiTinh));
					}
					break;
				case 3:
					System.out.print("So luong bao ve muon them: ");
					soLuong=Integer.parseInt(in.nextLine());
					for(int i=0;i<soLuong;i++) {
						System.out.print("Nhap vao ho: ");
						String ho=in.nextLine();
						System.out.print("Nhap vao ten: ");
						String ten=in.nextLine();
						System.out.print("Nhap vao tuoi: ");
						int tuoi=Integer.parseInt(in.nextLine());
						System.out.println("Chon gioi tinh");
						GT();
						int gioiTinh=Integer.parseInt(in.nextLine());
						DanhSachNhanSu.addToList(new BaoVe(ho,ten,tuoi,gioiTinh));
					}
					break;
				case 4:
					System.out.print("So luong nhan vien ve sinh muon them: ");
					soLuong=Integer.parseInt(in.nextLine());
					for(int i=0;i<soLuong;i++) {
						System.out.print("Nhap vao ho: ");
						String ho=in.nextLine();
						System.out.print("Nhap vao ten: ");
						String ten=in.nextLine();
						System.out.print("Nhap vao tuoi: ");
						int tuoi=Integer.parseInt(in.nextLine());
						System.out.println("Chon gioi tinh");
						GT();
						int gioiTinh=Integer.parseInt(in.nextLine());
						DanhSachNhanSu.addToList(new VeSinh(ho,ten,tuoi,gioiTinh));
					}
					break;
				}
				break;
			case 2:
				System.out.print("Nhap vao so luong nhan su truc: ");
				soLuong=Integer.parseInt(in.nextLine());
				for(int i=0;i<soLuong;i++) {
					System.out.print("Nhap vao id nhan su muon them: ");
					ID=Integer.parseInt(in.nextLine());
					System.out.println("Chon khoang thoi gian truc");
					khungThoiGian();
					time=Integer.parseInt(in.nextLine());
					System.out.println("Chon dia diem truc");
					danhSachDiaDiem();
					diaDiem=Integer.parseInt(in.nextLine());
					BangLichTruc.addToLichTruc(new LichTruc(ID,time,diaDiem));
				}
				break;
			case 3:
				System.out.print("Nhap vao so luong sinh vien co lich hoc: ");
				soLuong=Integer.parseInt(in.nextLine());
				for(int i=0;i<soLuong;i++) {
					System.out.print("Nhap vao id sinh vien muon them: ");
					ID=Integer.parseInt(in.nextLine());
					System.out.println("Chon khoang thoi gian hoc");
					khungThoiGian();
					time=Integer.parseInt(in.nextLine());
					System.out.println("Chon phong hoc");
					danhSachPhongHoc();
					phong=Integer.parseInt(in.nextLine());
					BangLichTruc.addToLichTruc(new LichHoc(ID,time,phong));
				}
				break;
			case 4:
				System.out.print("Nhap vao so luong giang vien co lich day: ");
				soLuong=Integer.parseInt(in.nextLine());
				for(int i=0;i<soLuong;i++) {
					System.out.print("Nhap vao id giang vien muon them: ");
					ID=Integer.parseInt(in.nextLine());
					System.out.println("Chon khoang thoi gian hoc");
					khungThoiGian();
					time=Integer.parseInt(in.nextLine());
					System.out.println("Chon phong hoc");
					danhSachPhongHoc();
					phong=Integer.parseInt(in.nextLine());
					BangLichTruc.addToLichTruc(new LichDay(ID,time,phong));
				}
				break;
			case 5:
				System.out.print("Nhap id: ");
				ID=Integer.parseInt(in.nextLine());
				BangLichHoc.getLichHoc(ID);
				break;
			case 6:
				System.out.print("Nhap id: ");
				ID=Integer.parseInt(in.nextLine());
				BangLichDay.getLichDay(ID);
				break;
			case 7:
				System.out.print("Nhap id: ");
				ID=Integer.parseInt(in.nextLine());
				BangLichTruc.getLichTruc(ID);
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
	static public void DanhSachDoiTuong() {
		System.out.println("1.Sinh vien");
		System.out.println("2.Giang vien");
		System.out.println("3.Bao ve");
		System.out.println("4.Nhan vien ve sinh");
		System.out.print("Chon: ");
	}
	static public void GT() {
		System.out.println("1.Nam");
		System.out.println("2.Nu");
		System.out.println("3.Khac");
		System.out.print("Chon: ");
	}
	static public void sType() {
		System.out.println("1.Chinh quy");
		System.out.println("2.Lien thong");
		System.out.println("3.Tai chuc");
		System.out.print("Chon: ");
	}
	static public void danhSachDiaDiem() {
		System.out.println("1.Cong bao ve");
		System.out.println("2.Nha ve sinh");
		System.out.println("3.Tang 1");
		System.out.println("4.Tang 2");
		System.out.println("5.Tang 3");
		System.out.print("Chon: ");
	}
	static public void khungThoiGian() {
		System.out.println("1.Tiet 1");
		System.out.println("2.Tiet 2");
		System.out.println("3.Tiet 3");
		System.out.println("4.Tiet 4");
		System.out.println("5.Tiet 5");
		System.out.println("6.Tiet 6");
		System.out.println("7.Tiet 7");
		System.out.print("Chon: ");
	}
	static public void danhSachPhongHoc() {
		System.out.println("1.A305");
		System.out.println("2.A604");
		System.out.println("3.A614");
		System.out.print("Chon: ");
	}
	static int soLuong;
	static int doiTuong;
	static int ID;
	static int time;
	static int diaDiem;
	static int phong;
}
