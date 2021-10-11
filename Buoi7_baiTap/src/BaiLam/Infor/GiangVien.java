package BaiLam.Infor;

import BaiLam.Emun.GioiTinh;
import BaiLam.Emun.ChucVu;

public class GiangVien extends Infor{

	public GiangVien(String ho, String ten, int tuoi, int gioiTinh) {
		super(ho, ten, tuoi, gioiTinh);
	}

	@Override
	public void gioiTinh() {
		// TODO Auto-generated method stub
		GioiTinh x;
		if(this.getGioiTinh()==1) {
			x=GioiTinh.Nam;
			System.out.println("Gioi tinh: "+x);
		}
		else if(this.getGioiTinh()==2) {
			x=GioiTinh.Nu;
			System.out.println("Gioi tinh: "+x);
		}
		else if(this.getGioiTinh()==3) {
			x=GioiTinh.khac;
			System.out.println("Gioi tinh: "+x);
		}
	}

	@Override
	public void ChucVu() {
		// TODO Auto-generated method stub
		ChucVu z=ChucVu.gv;
		System.out.println("Chuc vu: "+z.lable);
	}

	
	
}
