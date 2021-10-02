package BaiTap;

public class KhoaHoc extends Book{
	private int namxuatban;

	public KhoaHoc(String tensach,String tacGia, int gia, int soluong, int namxuatban) {
		super(tensach,tacGia, gia, soluong);
		this.namxuatban = namxuatban;
	}

	public int getNamxuatban() {
		return namxuatban;
	}
	
}
