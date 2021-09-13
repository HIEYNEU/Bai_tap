package Chu_vi_dien_tich;

import java.util.Scanner;

public class Rectangle extends Numbersize{
	int[] a=new int[2];
	public void input() {
		System.out.println("Nhap vao cac canh hinh chu nhat");
		Scanner in= new Scanner(System.in);
		for(int i=0;i<2;i++) {
			getNumbersize=Integer.parseInt(in.nextLine());
			a[i]=getNumbersize;
		}
	}
	public int chuvi() {
		return (a[1]+a[0])*2;
	}
	public int dientich() {
		return a[1]*a[0];
	}
}
