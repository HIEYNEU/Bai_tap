package BaiLam.Infor;

public abstract class Infor {
	private String ho;
	private String ten;
	private int tuoi;
	private int gioiTinh;
	private int id;
	static private int count;
	public Infor(String ho, String ten, int tuoi, int gioiTinh) {
		super();
		this.ho = ho;
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
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
	public int getGioiTinh() {
		return gioiTinh;
	}
	abstract public void gioiTinh();
	abstract public void ChucVu();
}
