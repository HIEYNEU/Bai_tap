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
	static public boolean addToLichDay(LichLamViec lich) {
		if(check(lich.getId())) {
			lichDay.add(lich);
		}
		return true;
	}
	static public void getLichDay(int id) {
		if(check(id)) {
			for(LichLamViec i:lichDay) {
				if(i.getId()==id) {
					Infor infor=DanhSachNhanSu.getInforFromList(id);
					System.out.println("Ho va ten: "+infor.getHo()+" "+infor.getTen());
					GiangVien x=(GiangVien) infor;
					x.gioiTinh();
					x.ChucVu();
					LichDay tmp=(LichDay) i;
					tmp.Phong();
					tmp.Time();
				}
			}
		}
		else {
			System.out.println("Nhap sai id");
		}
	}
}
