package BaiTapBuoi6;

public class VanHoc extends Book{
	private int taiban;
	private String theLoai;
	public VanHoc(String tensach, String tacGia, int gia, int soluong, int taiban, String theLoai) {
		super(tensach, tacGia, gia, soluong);
		this.taiban = taiban;
		this.theLoai = theLoai;
	}
	public int getTaiban() {
		return taiban;
	}
	@Override
	public void TheLoai() {
		// TODO Auto-generated method stub
		System.out.println("The loai: "+this.theLoai);
	}
	
}
