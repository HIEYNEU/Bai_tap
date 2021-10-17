package BaiLam.Mainprogram;

import java.util.Scanner;

import BaiLam.DSach.BangLichHoc;
import BaiLam.DSach.BangLichTruc;
import BaiLam.Lich.LichHoc;
import BaiLam.Lich.LichTruc;
import BaiLam.Utils.ScannerUtils;

public class InputLich {
	static public void InputLichTruc() {
		System.out.println("Nhap vao so luong nhan su truc: ");
		soLuong=ScannerUtils.readInt(in, "Nhap sai form int");
		for(int i=0;i<soLuong;i++) {
			System.out.print("Nhap vao id nhan su muon them: ");
			ID=ScannerUtils.readInt(in,"Nhap sai form int");
			System.out.println("Chon khoang thoi gian truc");
			khungThoiGian();
			time=ScannerUtils.readInt(in, "Nhap sai form int", 1, 7);
			System.out.println("Chon dia diem truc");
			danhSachDiaDiem();
			diaDiem=ScannerUtils.readInt(in, "Nhap sai form int", 1, 5);
			BangLichTruc.addToLichTruc(new LichTruc(ID,time,diaDiem));
		}
	}
	static public void InputLichHoc() {
		System.out.println("Nhap vao so luong nhan su hoc: ");
		soLuong=ScannerUtils.readInt(in, "Nhap sai form int");
		for(int i=0;i<soLuong;i++) {
			System.out.print("Nhap vao id nhan su muon them: ");
			ID=ScannerUtils.readInt(in,"Nhap sai form int");
			System.out.println("Chon khoang thoi gian hoc");
			khungThoiGian();
			time=ScannerUtils.readInt(in, "Nhap sai form int", 1, 7);
			System.out.println("Chon phong hoc");
			danhSachPhongHoc();
			phong=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
			BangLichHoc.addToLichHoc(new LichHoc(ID,time,phong));
		}
	}
	static public void InputLichDay() {
		System.out.println("Nhap vao so luong nhan su day: ");
		soLuong=ScannerUtils.readInt(in, "Nhap sai form int");
		for(int i=0;i<soLuong;i++) {
			System.out.print("Nhap vao id nhan su muon them: ");
			ID=ScannerUtils.readInt(in,"Nhap sai form int");
			System.out.println("Chon khoang thoi gian hoc");
			khungThoiGian();
			time=ScannerUtils.readInt(in, "Nhap sai form int", 1, 7);
			System.out.println("Chon phong hoc");
			danhSachPhongHoc();
			phong=ScannerUtils.readInt(in, "Nhap sai form int", 1, 3);
			BangLichHoc.addToLichHoc(new LichHoc(ID,time,phong));
		}
	}
	static Scanner in=new Scanner(System.in);
	static int phong;
	static int time;
	static int diaDiem;
	static int soLuong;
	static int ID;
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
	static public void danhSachDiaDiem() {
		System.out.println("1.Cong bao ve");
		System.out.println("2.Nha ve sinh");
		System.out.println("3.Tang 1");
		System.out.println("4.Tang 2");
		System.out.println("5.Tang 3");
		System.out.print("Chon: ");
	}
	static public void danhSachPhongHoc() {
		System.out.println("1.A305");
		System.out.println("2.A604");
		System.out.println("3.A614");
		System.out.print("Chon: ");
	}
}
