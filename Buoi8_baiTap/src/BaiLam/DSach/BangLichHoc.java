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
	static public boolean CheckLogic(int id,int time) {
		for(LichLamViec i:lichHoc) {
			if(i.getId()==id) {
				LichHoc tmp=(LichHoc) i;
				if(tmp.Time().x==time) return false;
			}
		}
		return true;
	}
	static public boolean addToLichHoc(LichLamViec lich) {
		if(check(lich.getId())) {
			LichHoc tmp=(LichHoc) lich;
			if(CheckLogic(lich.getId(),tmp.Time().x)) {
				lichHoc.add(lich);
				return true;
			}
		}
		return false;
	}
	static public void getLichHoc(int id) {
		if(check(id)) {
			for(LichLamViec i:lichHoc) {
				if(i.getId()==id) {
					Infor infor=DanhSachNhanSu.getInforFromList(id);
					System.out.println("Ho va ten: "+infor.getHo()+" "+infor.getTen());
					SinhVien x=(SinhVien) infor;
					System.out.println("Gioi tinh: "+x.gioiTinh().lable);
					System.out.println("Chuc vu: "+x.chucVu().lable);
					System.out.println("He dao tao: "+x.getType().lable);
					LichHoc tmp=(LichHoc) i;
					System.out.println("Phong: "+tmp.getPhongHoc().lable);
					System.out.println("Thoi gian: "+tmp.Time().lable);
					return;
				}
			}
		}
		else {
			System.out.println("Nhap sai id");
		}
	}
}
