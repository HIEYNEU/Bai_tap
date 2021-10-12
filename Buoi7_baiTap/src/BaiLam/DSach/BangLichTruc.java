package BaiLam.DSach;
import java.util.ArrayList;
import java.util.List;
import BaiLam.Infor.BaoVe;
import BaiLam.Infor.Infor;
import BaiLam.Infor.VeSinh;
import BaiLam.Lich.*;
public class BangLichTruc {
	static private List<LichLamViec> lichTruc=new ArrayList<LichLamViec>();
	private BangLichTruc() {
		
	}
	static public boolean check(int id) {
		if(DanhSachNhanSu.isValid(id)) {
			Infor i=DanhSachNhanSu.getInforFromList(id);
			if(i instanceof BaoVe|| i instanceof VeSinh) {
				return true;
			}
		}
		return false;
	}
	static public boolean addToLichTruc(LichLamViec lich) {
		if(check(lich.getId())) {
			lichTruc.add(lich);
			return true;
		}
		return false;
	}
	static public void getLichTruc(int id) {
		if(check(id)) {
			for(LichLamViec i:lichTruc) {
				if(i.getId()==id) {
					Infor infor=DanhSachNhanSu.getInforFromList(id);
					System.out.println("Ho va ten: "+infor.getHo()+" "+infor.getTen());
					if(infor instanceof BaoVe) {
						BaoVe x=(BaoVe) infor;
						System.out.println("Gioi tinh: "+x.gioiTinh().lable);
						System.out.println("Chuc vu: "+x.chucVu().lable);
					}
					else {
						VeSinh x=(VeSinh) infor;
						System.out.println("Gioi tinh: "+x.gioiTinh().lable);
						System.out.println("Chuc vu: "+x.chucVu().lable);
					}
					LichTruc tmp=(LichTruc) i;
					System.out.println("Thoi gian: "+tmp.Time().lable);
					System.out.println("Vi tri: "+tmp.getDiaDiem().lable);
					return;
				}
			}
		}
		else {
			System.out.println("Nhap sai id");
		}
	}
}
