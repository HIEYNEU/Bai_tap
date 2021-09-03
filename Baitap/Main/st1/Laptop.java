package Baitap.Main.st1;

public class Laptop {
	private String id;
	private String name;
	private RAM ram;
	private CPU cpu;
	private Mainbroad mainbroad;
	private Hang hang;
	int soLuong;
	public Laptop(String id, String name,Hang hang, RAM ram, CPU cpu, Mainbroad mainbroad, int soLuong) {
		super();
		this.id = id;
		this.name = name;
		this.hang=hang;
		this.ram = ram;
		this.cpu = cpu;
		this.mainbroad = mainbroad;
		this.soLuong = soLuong;
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
	public RAM getRam() {
		return ram;
	}
	public CPU getCpu() {
		return cpu;
	}
	public Mainbroad getMainbroad() {
		return mainbroad;
	}
	public int getSoLuong() {
		return soLuong;
	}
	
}
