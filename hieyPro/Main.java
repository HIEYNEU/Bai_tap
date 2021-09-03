package hieyPro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		Students student=new Students();
		Square square=new Square();
		Parallelogram para=new Parallelogram();
		Rectangular rec=new Rectangular();
		Triangle tri=new Triangle();
		Rhombus rhom=new Rhombus();
		ArrayList<Students> st=new ArrayList<Students>();
		ShowMenu();
		do {
			choose=in.nextInt();
			switch(choose) {
			case 1:
				System.out.println("Chọn hình");
				System.out.println("1.Hình vuông");
				System.out.println("2.Hình bình hành");
				System.out.println("3.Hình chữ nhật");
				System.out.println("4.Hình tam giác");
				System.out.println("5.Hình thoi");
				System.out.print("Chọn: ");
				int chon_hinh=in.nextInt();
				if(chon_hinh==1) {
					square.input();
					System.out.print("Chu vi hình vuông là: ");
					System.out.println(square.area());
					System.out.print("Diện tích hình vuông là: ");
					System.out.println(square.perimeter());
				}
				else if(chon_hinh==2) {
					para.input();
					System.out.print("Chu vi hình binh hành là: ");
					System.out.println(para.area());
					System.out.print("Diện tích hình bình hành là: ");
					System.out.println(para.perimeter());
				}
				else if(chon_hinh==3) {
					rec.input();
					System.out.print("Chu vi hình chữ nhật là: ");
					System.out.println(rec.area());
					System.out.print("Diện tích hình chữ nhật là: ");
					System.out.println(rec.perimener());
				}
				else if(chon_hinh==4) {
					tri.input();
					System.out.print("Chu vi hình tam giác là: ");
					System.out.println(tri.area());
					System.out.print("Diện tích hình tam giác là: ");
					System.out.println(tri.perimeter());
				}
				else if(chon_hinh==5) {
					rhom.input();
					System.out.print("Chu vi hình thoi là: ");
					System.out.println(rhom.area());
					System.out.print("Diện tích hình thoi là: ");
					System.out.println(rhom.perimeter());
				}
				break;
			case 2:
				System.out.print("Nhập số lương sinh viên: ");
				int N=Integer.parseInt(in.nextLine());
				for(int i=0;i<N;i++) {
					student.input();
					st.add(student);
				}
				for(int i=0;i<N;i++) {
					st.get(i).out();
				}
				int sum=0;
				for(int i=0;i<N;i++) {
					sum+=st.get(i).score;
				}
				System.out.println(sum/N);
				break;
			case 3:
				System.out.println("Exit!");
				break;
			default:
				System.out.println("Input Faile!!");
				break;
			}
		}while(choose!=3);
	}
	static void ShowMenu() {
		System.out.println("1.Tính chu vi và diện tích");
		System.out.println("2.In ra điểm sinh viên");
		System.out.println("3.Thoat");
		System.out.print("You choose: ");
	}
}
