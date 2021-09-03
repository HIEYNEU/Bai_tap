package hieyPro;

import java.util.Scanner;

public class Square {
	int[] x=new int[1];
	int[] y=new int[1];
	public Square() {
		super();
	}
	public void input() {
		Scanner in=new Scanner(System.in);
		int x_i=Integer.parseInt(in.nextLine());
		x[0]=x_i;
		int y_i=Integer.parseInt(in.nextLine());
		y[0]=y_i;
	}
	public double area() {
		return Math.sqrt(y[0]*y[0]-x[0]*x[0])*4;
	}
	public double perimeter() {
		return Math.sqrt(y[0]*y[0]-x[0]*x[0])*Math.sqrt(y[0]*y[0]-x[0]*x[0]);
	}
}
