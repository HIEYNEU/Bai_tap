package quan_ly_truong_hoc;

import java.util.Scanner;

public class HocSinh extends Infor{
	String Lop;
	
	public HocSinh() {
		super();
	}

	public HocSinh(String lop) {
		super();
		Lop = lop;
	}
	public void input() {
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		tuoi=Integer.parseInt(in.nextLine());
		CCCD=in.nextLine();
		Lop=in.nextLine();
	}

	@Override
	public String toString() {
		return "HocSinh [Lop=" + Lop + ", name=" + name + ", tuoi=" + tuoi + ", CCCD=" + CCCD + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void display() {
		System.out.println(toString());
	}
}
