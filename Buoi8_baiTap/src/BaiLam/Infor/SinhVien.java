package BaiLam.Infor;

import BaiLam.Enum.ChucVu;
import BaiLam.Enum.GioiTinh;
import BaiLam.Enum.Type;
public class SinhVien extends Infor{
	private GioiTinh gioiTinh;
	private Type type;
	public SinhVien(String ho, String ten, int tuoi, int gioiTinh, int type) {
		super(ho, ten, tuoi);
		this.gioiTinh = GioiTinh.getGioiTinh(gioiTinh);
		this.type = Type.getType(type);
	}
	
	public Type getType() {
		return type;
	}

	@Override
	public GioiTinh gioiTinh() {
		// TODO Auto-generated method stub
		return gioiTinh;
	}
	@Override
	public ChucVu chucVu() {
		// TODO Auto-generated method stub
		return ChucVu.getChucVu(4);
	}
	
}
