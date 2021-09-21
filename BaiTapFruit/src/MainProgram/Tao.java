package MainProgram;

public class Tao extends Qua{
	private int luongduong;

	public Tao(String ten, int gia, int soluong, int luongduong) {
		super(ten, gia, soluong);
		this.luongduong = luongduong;
	}

	public int getLuongduong() {
		return luongduong;
	}
	
}
