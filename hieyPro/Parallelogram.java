package hieyPro;

import java.util.Scanner;

public class Parallelogram {
	int[] x=new int[3];
	int[] y=new int[3];
	public Parallelogram() {
		super();
	}
	public void input() {
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int x_i=Integer.parseInt(in.nextLine());
			x[i]=x_i;
			int y_i=Integer.parseInt(in.nextLine());
			y[i]=y_i;
		}
	}
	public double area() {
		return (Math.sqrt(y[0]*y[0]-x[0]*x[0])*2+Math.sqrt(y[1]*y[1]-x[1]*x[1])*2);
	}
	public double perimeter() {
		return (Math.sqrt(y[0]*y[0]-x[0]*x[0])*Math.sqrt(y[2]*y[2]-x[2]*x[2]));
	}
}
