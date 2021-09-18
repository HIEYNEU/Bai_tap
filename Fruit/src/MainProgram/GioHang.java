package MainProgram;

public class GioHang {
	private String Ten;
	private int gia;
	private int slg;
	public GioHang(String ten, int gia, int slg) {
		super();
		Ten = ten;
		this.gia = gia;
		this.slg = slg;
	}
	public String getTen() {
		return Ten;
	}
	public int getGia() {
		return gia;
	}
	public int getSlg() {
		return slg;
	}
	
}
