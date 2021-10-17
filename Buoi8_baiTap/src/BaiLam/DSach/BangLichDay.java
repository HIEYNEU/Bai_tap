package BaiLam.DSach;
import java.util.ArrayList;
import java.util.List;

import BaiLam.Infor.GiangVien;
import BaiLam.Infor.Infor;
import BaiLam.Lich.*;
public class BangLichDay {
	static private List<LichLamViec>lichDay=new ArrayList<LichLamViec>();
	private BangLichDay() {
		
	}
	static public boolean check(int id) {
		if(DanhSachNhanSu.isValid(id)) {
			Infor i=DanhSachNhanSu.getInforFromList(id);
			if(i instanceof GiangVien) {
				return true;
			}
		}
		return false;
	}
	static public boolean CheckLogic(int id,int time) {
		for(LichLamViec i:lichDay) {
			if(i.getId()==id) {
				LichDay tmp=(LichDay) i;
				if(tmp.Time().x==time) return false;
			}
		}
		return true;
	}
	static public boolean addToLichDay(LichLamViec lich) {
		if(check(lich.getId())) {
			LichDay tmp=(LichDay) lich;
			if(CheckLogic(lich.getId(),tmp.Time().x)) {
				lichDay.add(lich);
				return true;
			}
		}
		return false;
	}
	static public void getLichDay(int id) {
		if(check(id)) {
			for(LichLamViec i:lichDay) {
				if(i.getId()==id) {
					Infor infor=DanhSachNhanSu.getInforFromList(id);
					System.out.println("Ho va ten: "+infor.getHo()+" "+infor.getTen());
					GiangVien x=(GiangVien) infor;
					System.out.println("Gioi tinh: "+x.gioiTinh().lable);
					System.out.println("Chuc vu: "+x.chucVu().lable);
					LichDay tmp=(LichDay) i;
					System.out.println("Phong: "+tmp.getPhongHoc().lable);
					System.out.println("Thoi gian: "+tmp.Time().lable);
				}
			}
		}
		else {
			System.out.println("Nhap sai id");
		}
	}
}
