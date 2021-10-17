package BaiLam.Mainprogram;

import java.util.Scanner;

import BaiLam.DSach.DanhSachNhanSu;
import BaiLam.Infor.SinhVien;
import BaiLam.Utils.ScannerUtils;

public class InputMember {
	static public void input() {
		DanhSachDoiTuong();
		int doiTuong=ScannerUtils.readInt(in, "Nhap sai form int", 1, 4);
		switch(doiTuong) {
		case 1:
			System.out.println("Nhap so luong sinh vien muon them: ");
			soLuong=ScannerUtils.readInt(in,"Nhap sai form int");
			for(int i=0;i<soLuong;i++) {
				System.out.print("Nhap vao ho: ");
				String ho=ScannerUtils.readStr(in,"Nhap sai form String");
				System.out.print("Nhap vao ten: ");
				String ten=ScannerUtils.readStr(in,"Nhap sai form String");
				System.out.print("Nhap vao tuoi: ");
				int tuoi=ScannerUtils.readInt(in, "Nhap sai form int", 18, 35);
				System.out.println("Chon gioi tinh");
				GT();
				int gioiTinh=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
				System.out.println("Nhap vao hinh thuc hoc tap");
				sType();
				int type=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
				DanhSachNhanSu.addToList(new SinhVien(ho,ten,tuoi,gioiTinh,type));
			}
			break;
		case 2:
			System.out.println("Nhap so luong giang vien muon them: ");
			soLuong=ScannerUtils.readInt(in,"Nhap sai form int");
			for(int i=0;i<soLuong;i++) {
				System.out.print("Nhap vao ho: ");
				String ho=ScannerUtils.readStr(in,"Nhap sai form String");
				System.out.print("Nhap vao ten: ");
				String ten=ScannerUtils.readStr(in,"Nhap sai form String");
				System.out.print("Nhap vao tuoi: ");
				int tuoi=ScannerUtils.readInt(in, "Nhap sai form int", 25, 60);
				System.out.println("Chon gioi tinh");
				GT();
				int gioiTinh=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
				System.out.println("Nhap vao hinh thuc hoc tap");
				sType();
				int type=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
				DanhSachNhanSu.addToList(new SinhVien(ho,ten,tuoi,gioiTinh,type));
			}
			break;
		case 3:
			System.out.println("Nhap so luong bao ve muon them: ");
			soLuong=ScannerUtils.readInt(in,"Nhap sai form int");
			for(int i=0;i<soLuong;i++) {
				System.out.print("Nhap vao ho: ");
				String ho=ScannerUtils.readStr(in,"Nhap sai form String");
				System.out.print("Nhap vao ten: ");
				String ten=ScannerUtils.readStr(in,"Nhap sai form String");
				System.out.print("Nhap vao tuoi: ");
				int tuoi=ScannerUtils.readInt(in, "Nhap sai form int", 18, 60);
				System.out.println("Chon gioi tinh");
				GT();
				int gioiTinh=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
				System.out.println("Nhap vao hinh thuc hoc tap");
				sType();
				int type=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
				DanhSachNhanSu.addToList(new SinhVien(ho,ten,tuoi,gioiTinh,type));
			}
			break;
		case 4:
			System.out.println("Nhap so luong nhan vien ve sinh muon them: ");
			soLuong=ScannerUtils.readInt(in,"Nhap sai form int");
			for(int i=0;i<soLuong;i++) {
				System.out.print("Nhap vao ho: ");
				String ho=ScannerUtils.readStr(in,"Nhap sai form String");
				System.out.print("Nhap vao ten: ");
				String ten=ScannerUtils.readStr(in,"Nhap sai form String");
				System.out.print("Nhap vao tuoi: ");
				int tuoi=ScannerUtils.readInt(in, "Nhap sai form int", 18, 60);
				System.out.println("Chon gioi tinh");
				GT();
				int gioiTinh=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
				System.out.println("Nhap vao hinh thuc hoc tap");
				sType();
				int type=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
				DanhSachNhanSu.addToList(new SinhVien(ho,ten,tuoi,gioiTinh,type));
			}
			break;
		}
	}
	static Scanner in=new Scanner(System.in);
	static int soLuong;
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
}
