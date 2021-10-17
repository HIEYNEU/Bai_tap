package BaiLam.Infor;

import BaiLam.Enum.ChucVu;
import BaiLam.Enum.GioiTinh;

public abstract class Infor {
	private String ho;
	private String ten;
	private int tuoi;
	private int id;
	static private int count;
	public Infor(String ho, String ten, int tuoi) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.tuoi = tuoi;
		this.id=++count;
	}
	public int getId() {
		return id;
	}
	public String getHo() {
		return ho;
	}
	public String getTen() {
		return ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	abstract public GioiTinh gioiTinh();
	abstract public ChucVu chucVu();
}
