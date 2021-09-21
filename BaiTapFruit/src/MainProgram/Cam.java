package MainProgram;

public class Cam extends Qua{
	private int khoiluong;

	public Cam(String ten, int gia, int soluong, int khoiluong) {
		super(ten, gia, soluong);
		this.khoiluong = khoiluong;
	}

	public int getKhoiluong() {
		return khoiluong;
	}
	

}
