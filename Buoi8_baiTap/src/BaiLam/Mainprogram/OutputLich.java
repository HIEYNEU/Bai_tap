package BaiLam.Mainprogram;

import java.util.Scanner;

import BaiLam.DSach.BangLichDay;
import BaiLam.DSach.BangLichHoc;
import BaiLam.DSach.BangLichTruc;
import BaiLam.Utils.*;
public class OutputLich {
	static public void OutputLichTruc() {
		System.out.print("Nhap id nguoi truc: ");
		ID=ScannerUtils.readInt(in,"Nhap sai form int");
		BangLichTruc.getLichTruc(ID);
	}
	static public void OutputLichHoc() {
		System.out.print("Nhap id nguoi hoc: ");
		ID=ScannerUtils.readInt(in,"Nhap sai form int");
		BangLichHoc.getLichHoc(ID);
	}
	static public void OutputLichDay() {
		System.out.print("Nhap id nguoi day: ");
		ID=ScannerUtils.readInt(in,"Nhap sai form int");
		BangLichDay.getLichDay(ID);
	}
	static Scanner in=new Scanner(System.in);
	static int ID;
}
