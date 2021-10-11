package BaiLam.Infor;

import BaiLam.Emun.GioiTinh;
import BaiLam.Emun.ChucVu;
import BaiLam.Emun.Type;
public class SinhVien extends Infor{
	private int type;
	public SinhVien(String ho, String ten, int tuoi, int gioiTinh,int type) {
		super(ho, ten, tuoi, gioiTinh);
		// TODO Auto-generated constructor stub
		this.type=type;
	}
	
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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
	public void Type() {
		Type x;
		if(type==1) {
			x=Type.cq;
			System.out.println(x.lable);
		}
		else if(type==2) {
			x=Type.lt;
			System.out.println(x.lable);
		}
		else if(type==3) {
			x=Type.tc;
			System.out.println(x.lable);
		}
	}
}
