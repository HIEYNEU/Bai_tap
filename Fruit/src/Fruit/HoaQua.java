package Fruit;
public class HoaQua {
	private Tao tao;
	private Cam cam;
	private Chuoi chuoi;
	public HoaQua(Tao tao) {
		super();
		this.tao = tao;
	}
	public HoaQua(Cam cam) {
		super();
		this.cam = cam;
	}
	public HoaQua(Chuoi chuoi) {
		super();
		this.chuoi = chuoi;
	}
	
	public Tao getTao() {
		return tao;
	}
	public Cam getCam() {
		return cam;
	}
	public Chuoi getChuoi() {
		return chuoi;
	}
	public String toStringTao() {
		return tao.getTen()+" "+tao.getGia()+" "+tao.getSoluong()+" "+tao.getLuongduong();
	}
	public String toStringCam() {
		return cam.getTen()+" "+cam.getGia()+" "+cam.getSoluong()+" "+cam.getCannang();
	}
	public String toStringChuoi() {
		return chuoi.getTen()+" "+chuoi.getGia()+" "+chuoi.getSoluong()+" "+chuoi.getKali();
	}
	public String getNameTao() {
		return tao.getTen();
	}
	public String getNameCam() {
		return cam.getTen();
	}
	public String getNameChuoi() {
		return chuoi.getTen();
	}
	public int getGiaTao() {
		return tao.getGia();
	}
	public int getGiaCam() {
		return cam.getGia();
	}
	public int getGiaChuoi() {
		return chuoi.getGia();
	}
	public int getSluogTao() {
		return tao.getSoluong();
	}
	public int getSluogCam() {
		return cam.getSoluong();
	}
	public int getSluogChuoi() {
		return chuoi.getSoluong();
	}
}
