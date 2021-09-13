package quan_ly_truong_hoc;

import java.util.Scanner;

public class NhanVienBaoVe extends Infor{
	public void input() {
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		tuoi=Integer.parseInt(in.nextLine());
		CCCD=in.nextLine();
	}

	@Override
	public String toString() {
		return "NhanVienBaoVe [name=" + name + ", tuoi=" + tuoi + ", CCCD=" + CCCD + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void display() {
		System.out.println(toString());
	}
}
