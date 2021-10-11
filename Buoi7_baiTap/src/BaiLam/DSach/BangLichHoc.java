package BaiLam.DSach;
import java.util.ArrayList;
import java.util.List;

import BaiLam.Infor.Infor;
import BaiLam.Infor.SinhVien;
import BaiLam.Lich.*;
public class BangLichHoc {
	static private List<LichLamViec>lichHoc=new ArrayList<LichLamViec>();
	private BangLichHoc() {
		
	}
	static public boolean check(int id) {
		if(DanhSachNhanSu.isValid(id)) {
			Infor i=DanhSachNhanSu.getInforFromList(id);
			if(i instanceof SinhVien) {
				return true;
			}
		}
		return false;
	}
	static public boolean addToLichHoc(LichLamViec lich) {
		if(check(lich.getId())) {
			lichHoc.add(lich);
			return true;
		}
		return false;
	}
	static public void getLichHoc(int id) {
		if(check(id)) {
			for(LichLamViec i:lichHoc) {
				if(i.getId()==id) {
					Infor infor=DanhSachNhanSu.getInforFromList(id);
					System.out.println("Ho va ten: "+infor.getHo()+" "+infor.getTen());
					infor.gioiTinh();
					infor.ChucVu();
					SinhVien x=(SinhVien) infor;
					x.gioiTinh();
					x.ChucVu();
					x.Type();
					LichHoc tmp=(LichHoc) i;
					tmp.Time();
					tmp.Phong();
					return;
				}
			}
		}
		else {
			System.out.println("Nhap sai id");
		}
	}
}
