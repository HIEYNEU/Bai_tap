package Baitap.Main.st1;

public class CPU {
	private String name;
	private Hang hang;
	private String id;
	public int soLuong;
	public CPU(String name, Hang hang, String id,int soLuong) {
		super();
		this.name = name;
		this.hang = hang;
		this.id = id;
		this.soLuong=soLuong;
	}
	public String getName() {
		return name;
	}
	public Hang getHang() {
		return hang;
	}
	public String getId() {
		return id;
	}
	public int getsoLuong() {
		return soLuong;
	}
}
