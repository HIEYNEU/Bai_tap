package Chu_vi_dien_tich;

import java.util.Scanner;

public class Parallogram extends Numbersize{
	int[] a=new int[3];
	public void input() {
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			getNumbersize=Integer.parseInt(in.nextLine());
			a[i]=getNumbersize;
		}
	}
	public int chuvi() {
		return a[0]*a[1];
	}
	public int dientich() {
		return a[0]*a[2];
	}
}
