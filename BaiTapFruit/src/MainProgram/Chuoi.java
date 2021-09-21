package MainProgram;

public class Chuoi extends Qua{
	private int kali;

	public Chuoi(String ten, int gia, int soluong, int kali) {
		super(ten, gia, soluong);
		this.kali = kali;
	}

	public int getKali() {
		return kali;
	}
	
}
