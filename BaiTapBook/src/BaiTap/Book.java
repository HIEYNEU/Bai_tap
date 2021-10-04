package BaiTap;

public class Book {
	private int id;
	private String tensach;
	private String tacGia;
	private int gia;
	private int soluong;
	static private int count;
	public Book(String tensach, String tacGia, int gia, int soluong) {
		super();
		this.tensach=tensach;
		this.tacGia = tacGia;
		this.gia = gia;
		this.soluong = soluong;
		this.id=++count;
	}
	public String getTensach() {
		return tensach;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getId() {
		return id;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void addQuarity(int quarity){
		this.soluong=this.soluong+quarity;
	}
}
