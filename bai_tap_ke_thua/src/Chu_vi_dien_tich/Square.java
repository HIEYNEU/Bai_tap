package Chu_vi_dien_tich;

import java.util.Scanner;

public class Square extends Numbersize{
	int[] a= new int[1];
	public void input() {
		Scanner in=new Scanner(System.in);
		System.out.println("Nhap vao do dai cac canh");
		for(int i=0;i<1;i++) {
			getNumbersize=Integer.parseInt(in.nextLine());
			a[i]=getNumbersize;
		}
	}
	public int chuvi() {
		return a[0]*4;
	}
	public int dientich() {
		return a[0]*a[0];
	}
}
