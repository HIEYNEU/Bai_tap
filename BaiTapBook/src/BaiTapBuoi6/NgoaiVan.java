package BaiTapBuoi6;

public class NgoaiVan extends Book{
	private String ISBN;
	private String theLoai;
	public NgoaiVan(String tensach, String tacGia, int gia, int soluong, String iSBN, String theLoai) {
		super(tensach, tacGia, gia, soluong);
		ISBN = iSBN;
		this.theLoai = theLoai;
	}
	public String getISBN() {
		return ISBN;
	}
	@Override
	public void TheLoai() {
		// TODO Auto-generated method stub
		System.out.println("The loai: "+this.theLoai);
	}
	
}
