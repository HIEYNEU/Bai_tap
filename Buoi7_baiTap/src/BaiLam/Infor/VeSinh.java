package BaiLam.Infor;

import BaiLam.Emun.GioiTinh;

import BaiLam.Emun.ChucVu;
public class VeSinh extends Infor{
	private GioiTinh gioiTinh;

	public VeSinh(String ho, String ten, int tuoi, int gioiTinh) {
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
		return ChucVu.getChucVu(2);
	}
	
	
}
