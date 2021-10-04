package BaiTap;

public class VanHoc extends Book{
	private int taiban;

	public VanHoc(String tensach,String tacGia, int gia, int soluong, int taiban) {
		super(tensach,tacGia, gia, soluong);
		this.taiban = taiban;
	}

	public int getTaiban() {
		return taiban;
	}

	public void setTaiban(int taiban) {
		this.taiban = taiban;
	}
	
}
