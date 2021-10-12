package BaiLam.Infor;

import BaiLam.Emun.ChucVu;
import BaiLam.Emun.GioiTinh;

public class BaoVe extends Infor{
	private GioiTinh gioiTinh;
	public BaoVe(String ho, String ten, int tuoi, int gioiTinh) {
		super(ho, ten, tuoi);
		this.gioiTinh = GioiTinh.getGioiTinh(gioiTinh);
	}
	@Override
	public GioiTinh gioiTinh() {
		// TODO Auto-generated method stub
		return gioiTinh;
	}
	@Override
	public ChucVu chucVu() {
		// TODO Auto-generated method stub
		return ChucVu.getChucVu(1);
	}
	
	
}
