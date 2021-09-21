package MainProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Qua>lst_qua=new ArrayList<Qua>();
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				Input(lst_qua);
				break;
			case 2:
				Display(lst_qua);
				break;
			case 3:
				ThamLam(lst_qua);
				break;
			case 4:
				System.out.println("Thoat");
				break;
			default:
				System.out.println("Nhap lai");
				break;
			}
		}while(choose!=4);
	}
	static Scanner in=new Scanner(System.in);
	static void showMenu() {
		System.out.println("1.Nhap vao thong tin cac loai qua");
		System.out.println("2.In ra thong tin cac loai qua");
		System.out.println("3.So luong hang lon nhat mua duoc voi X dong");
		System.out.println("4.Thoat");
		System.out.print("Chon: ");
	}
	static void Input(ArrayList<Qua>list) {
		System.out.print("Nhap vao loai tao: ");
		int numTao=Integer.parseInt(in.nextLine());
		for(int i=0;i<numTao;i++) {
			System.out.print("Nhap vao ten tao: ");
			String ten=in.nextLine();
			System.out.print("Nhap vao gia tao: ");
			int gia=Integer.parseInt(in.nextLine());
			System.out.print("Nhap vao so luong tao: ");
			int slg=Integer.parseInt(in.nextLine());
			System.out.print("Nhap vao luong duong: ");
			int ld=Integer.parseInt(in.nextLine());
			Tao tao=new Tao(ten,gia,slg,ld);
			list.add(tao);
		}
		System.out.print("Nhap vao loai cam: ");
		int numCam=Integer.parseInt(in.nextLine());
		for(int i=0;i<numCam;i++) {
			System.out.print("Nhap vao ten cam: ");
			String ten=in.nextLine();
			System.out.print("Nhap vao gia cam: ");
			int gia=Integer.parseInt(in.nextLine());
			System.out.print("Nhap vao so luong cam: ");
			int slg=Integer.parseInt(in.nextLine());
			System.out.print("Nhap vao can nang: ");
			int cannang=Integer.parseInt(in.nextLine());
			Cam cam=new Cam(ten,gia,slg,cannang);
			list.add(cam);
		}
		System.out.print("Nhap vao loai chuoi: ");
		int numChuoi=Integer.parseInt(in.nextLine());
		for(int i=0;i<numChuoi;i++) {
			System.out.print("Nhap vao ten chuoi: ");
			String ten=in.nextLine();
			System.out.print("Nhap vao gia chuoi: ");
			int gia=Integer.parseInt(in.nextLine());
			System.out.print("Nhap vao so luong chuoi: ");
			int slg=Integer.parseInt(in.nextLine());
			System.out.print("Nhap vao kali: ");
			int kali=Integer.parseInt(in.nextLine());
			Chuoi chuoi=new Chuoi(ten,gia,slg,kali);
			list.add(chuoi);
		}
	}
	static void Display(ArrayList<Qua>list) {
		for(int i=0;i<list.size();i++) {
			System.out.println("Ten: "+list.get(i).getTen());
			System.out.println("Gia: "+list.get(i).getGia());
			System.out.println("So luong: "+list.get(i).getSoluong());
			if(list.get(i) instanceof Tao) {
				Tao x=(Tao) list.get(i);
				System.out.println("Luong duong: "+x.getLuongduong());
			}
			else if(list.get(i) instanceof Cam) {
				Cam x=(Cam) list.get(i);
				System.out.println("Can nang: "+x.getKhoiluong());
			}
			else {
				Chuoi x=(Chuoi) list.get(i);
				System.out.println("Ham luong kali: "+x.getKali());
			}
			System.out.println("-------------------------------------------");
		}
	}
	static void Sort(ArrayList<Qua>list) {
		Collections.sort(list,new Comparator<Qua>() {
			@Override
			public int compare(Qua st,Qua nd) {
				if(st.getGia()<nd.getGia()) return 1;
				return -1;
			}
		});
	}
	static void ThamLam(ArrayList<Qua>list) {
		Sort(list);
		System.out.print("Nhap so tien: ");
		int money=Integer.parseInt(in.nextLine());
		System.out.printf("Voi %d dong ban co the mua duoc gio hang lon nhat nhu sau:\n",money);
		for(int i=0;i<list.size();i++) {
			if(money==0) break;
			if(money>=(list.get(i).getGia()*list.get(i).getSoluong())) {
				System.out.println(list.get(i).getTen()+" "+list.get(i).getSoluong()+" qua");
				money-=(list.get(i).getGia()*list.get(i).getSoluong());
			}
			else {
				int tmp=money/list.get(i).getGia();
				System.out.println(list.get(i).getTen()+" "+tmp+" qua");
				money=0;
			}
		}
	}
}
