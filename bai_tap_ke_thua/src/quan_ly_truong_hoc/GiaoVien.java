package quan_ly_truong_hoc;

import java.util.Scanner;

public class GiaoVien extends Infor{
	String BoMon;
	
	public GiaoVien() {
		super();
	}

	public GiaoVien(String boMon) {
		super();
		BoMon = boMon;
	}

	public String getBoMon() {
		return BoMon;
	}

	public void setBoMon(String boMon) {
		BoMon = boMon;
	}

	public void input() {
		Scanner in=new Scanner(System.in);
		name=in.nextLine();
		tuoi=Integer.parseInt(in.nextLine());
		CCCD=in.nextLine();
		BoMon=in.nextLine();
	}

	@Override
	public String toString() {
		return "GiaoVien [BoMon=" + BoMon + ", name=" + name + ", tuoi=" + tuoi + ", CCCD=" + CCCD + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void display() {
		System.out.println(toString());
	}
}
