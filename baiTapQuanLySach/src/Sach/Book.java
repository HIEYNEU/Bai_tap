package Sach;

public class Book {
	private String name;
	private TacGia tacgia;
	private int soTrang;
	private int price;
	public String trangthai;
	public Book(String name, TacGia tacgia, int soTrang, int price, String trangthai) {
		super();
		this.name = name;
		this.tacgia = tacgia;
		this.soTrang = soTrang;
		this.price = price;
		this.trangthai = trangthai;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	public String getName() {
		return name;
	}
	public TacGia getTacgia() {
		return tacgia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public int getPrice() {
		return price;
	}
}
