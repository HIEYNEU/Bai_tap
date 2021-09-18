package MainProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Fruit.Cam;
import Fruit.Chuoi;
import Fruit.HoaQua;
import Fruit.Tao;

public class Main {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<HoaQua>lst_hq=new ArrayList<HoaQua>();
		ArrayList<GioHang>lst_hang=new ArrayList<GioHang>();
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				System.out.print("Nhap so luong loai tao: ");
				int numTo;
				numTo=Integer.parseInt(in.nextLine());
				for(int i=0;i<numTo;i++) {
					System.out.print("Nhap ten loai tao: ");
					String name=in.nextLine();
					System.out.print("Nhap gia: ");
					int gia=Integer.parseInt(in.nextLine());
					System.out.print("Nhap so luong: ");
					int soluong=Integer.parseInt(in.nextLine());
					System.out.print("Nhap luong duong: ");
					int ld=Integer.parseInt(in.nextLine());
					Tao tao=new Tao(name,gia,soluong,ld);
					lst_hq.add(new HoaQua(tao));
				}
				System.out.print("Nhap so luong loai cam: ");
				int numCm=Integer.parseInt(in.nextLine());
				for(int i=0;i<numCm;i++) {
					System.out.print("Nhap ten loai cam: ");
					String name=in.nextLine();
					System.out.print("Nhap gia: ");
					int gia=Integer.parseInt(in.nextLine());
					System.out.print("Nhap so luong: ");
					int soluong=Integer.parseInt(in.nextLine());
					System.out.print("Nhap can nang: ");
					int cn=Integer.parseInt(in.nextLine());
					Cam cam=new Cam(name,gia,soluong,cn);
					lst_hq.add(new HoaQua(cam));
				}
				System.out.print("Nhap so luong loai chuoi: ");
				int numCi=Integer.parseInt(in.nextLine());
				for(int i=0;i<numCi;i++) {
					System.out.print("Nhap ten loai tao: ");
					String name=in.nextLine();
					System.out.print("Nhap gia: ");
					int gia=Integer.parseInt(in.nextLine());
					System.out.print("Nhap so luong: ");
					int soluong=Integer.parseInt(in.nextLine());
					System.out.print("Nhap khoi luong dong vi kali: ");
					int kali=Integer.parseInt(in.nextLine());
					Chuoi chuoi=new Chuoi(name,gia,soluong,kali);
					lst_hq.add(new HoaQua(chuoi));
				}
				break;
			case 2:
				for(int i=0;i<lst_hq.size();i++) {
					if(lst_hq.get(i).getTao()!=null) {
						System.out.println(lst_hq.get(i).toStringTao());
					}
					if(lst_hq.get(i).getCam()!=null) {
						System.out.println(lst_hq.get(i).toStringCam());
					}
					if(lst_hq.get(i).getChuoi()!=null) {
						System.out.println(lst_hq.get(i).toStringChuoi());
					}
				}
				break;
			case 3:
				for(int i=0;i<lst_hq.size();i++) {
					if(lst_hq.get(i).getTao()!=null) {
						GioHang hang=new GioHang(lst_hq.get(i).getNameTao(),lst_hq.get(i).getGiaTao(),lst_hq.get(i).getSluogTao());
						lst_hang.add(hang);
					}
					if(lst_hq.get(i).getCam()!=null) {
						GioHang hang=new GioHang(lst_hq.get(i).getNameCam(),lst_hq.get(i).getGiaCam(),lst_hq.get(i).getSluogCam());
						lst_hang.add(hang);
					}
					if(lst_hq.get(i).getChuoi()!=null) {
						GioHang hang=new GioHang(lst_hq.get(i).getNameChuoi(),lst_hq.get(i).getGiaChuoi(),lst_hq.get(i).getSluogChuoi());
						lst_hang.add(hang);
					}
				}
				Collections.sort(lst_hang,new Comparator<GioHang>() {
					@Override
					public int compare(GioHang st,GioHang nd) {
						if(st.getGia()<nd.getGia()) {
							return 1;
						}
						return -1;
					}
				});
				System.out.print("Nhap so tien: ");
				int money=Integer.parseInt(in.nextLine());
				for(int i=0;i<lst_hang.size();i++) {
					if(money==0) break;
					int n=money/lst_hang.get(i).getGia();
					if(n>lst_hang.get(i).getSlg()) {
						System.out.println(lst_hang.get(i).getTen()+" "+lst_hang.get(i).getSlg());
						money-=(lst_hang.get(i).getGia()*lst_hang.get(i).getSlg());
					}
					else {
						System.out.println(lst_hang.get(i).getTen()+" "+n);
						break;
					}
				}
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
	static void showMenu() {
		System.out.println("1.Nhap vao cac loai qua");
		System.out.println("2.In ra cac loai qua");
		System.out.println("3.Tim so luong nhieu nhat co the mua duoc");
		System.out.println("4.Thoat");
		System.out.print("Chon: ");
	}
}
