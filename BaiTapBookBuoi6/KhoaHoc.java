package BaiTapBuoi6;

public class KhoaHoc extends Book{
	private int namxuatban;
	private String theLoai;
	public KhoaHoc(String tensach, String tacGia, int gia, int soluong, int namxuatban, String theLoai) {
		super(tensach, tacGia, gia, soluong);
		this.namxuatban = namxuatban;
		this.theLoai = theLoai;
	}
	public int getNamxuatban() {
		return namxuatban;
	}
	@Override
	public void TheLoai() {
		// TODO Auto-generated method stub
		System.out.println("The loai: "+this.theLoai);
	}
	
}
