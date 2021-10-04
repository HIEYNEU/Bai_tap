package BaiTap;

public class NgoaiVan extends Book{
	private String ISBN;

	public NgoaiVan(String tensach,String tacGia, int gia, int soluong, String iSBN) {
		super(tensach,tacGia, gia, soluong);
		ISBN = iSBN;
	}

	public String getISBN() {
		return ISBN;
	}
	
}
