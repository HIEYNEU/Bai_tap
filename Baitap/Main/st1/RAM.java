package Baitap.Main.st1;

public class RAM {
	private String id;
	private String name;
	private Hang hang;
	public int soLuong;
	public RAM(String id, String name, Hang hang,int soLuong) {
		super();
		this.id = id;
		this.name = name;
		this.hang = hang;
		this.soLuong=soLuong;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Hang getHang() {
		return hang;
	}
	public int getsoLuong() {
		return soLuong;
	}
}
