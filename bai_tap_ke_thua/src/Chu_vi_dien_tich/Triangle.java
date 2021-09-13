package Chu_vi_dien_tich;

import java.util.Scanner;

public class Triangle extends Numbersize {
	int[] a=new int[3];
	public void input() {
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			getNumbersize=Integer.parseInt(in.nextLine());
			a[i]=getNumbersize;
		}
	}
	public int chuvi() {
		return a[0]+a[1]+a[2];
	}
	public double dientich() {
		double p=this.chuvi()/2;
		return Math.sqrt(p*(p-a[0])*(p-a[1])*(p-a[2]));
	}
} 
