package QuanLy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Sach.Book;
import Sach.TacGia;

public class MainProgram {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<TacGia>lst_tg=new ArrayList<TacGia>();
		ArrayList<Book>lst_book=new ArrayList<Book>();
		List<String> list_nBook=new ArrayList<String>();
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				System.out.print("Nhap so luong tac gia: ");
				int N=Integer.parseInt(in.nextLine());
				for(int i=0;i<N;i++) {
					System.out.print("Nhap ten tac gia: ");
					String name=in.nextLine();
					lst_tg.add(new TacGia(name));
				}
				System.out.print("Nhap so luong sach: ");
				int K=Integer.parseInt(in.nextLine());
				for(int i=0;i<K;i++) {
					System.out.print("Nhap ten sach: ");
					String name=in.nextLine();
					int kt=0;
					for(int j=0;j<list_nBook.size();j++) {
						if(list_nBook.get(j).equals(name)) {
							kt++;
							break;
						}
					}
					if(kt==0) {
						list_nBook.add(name);
					}
					System.out.print("Nhap stt cua tac gia theo list tac gia: ");
					int idtg=Integer.parseInt(in.nextLine());
					System.out.print("Nhap so trang: ");
					int soTrang=Integer.parseInt(in.nextLine());
					System.out.print("Nhap gia: ");
					int gia=Integer.parseInt(in.nextLine());
					System.out.print("Nhap trang thai: ");
					String trangThai=in.nextLine();
					lst_book.add(new Book(name,lst_tg.get(idtg),soTrang,gia,trangThai));
				}
				break;
			case 2:
				System.out.print("Nhap stt sach muon in thong tin: ");
				int n=Integer.parseInt(in.nextLine());
				System.out.printf("%s %s %d %d %s",lst_book.get(n).getName(),lst_book.get(n).getTacgia(),lst_book.get(n).getSoTrang(),
						lst_book.get(n).getPrice(),lst_book.get(n).getTrangthai());
				break;
			case 3:
				for(int i=0;i<list_nBook.size();i++) {
					int dem=0;
					for(int j=0;j<lst_book.size();j++) {
						if(lst_book.get(j).getName().equals(list_nBook.get(j))) {
							dem++;
						}
					}
					System.out.printf("%s co so luong la: %d",list_nBook.get(i),dem);
				}
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Nhap lai");
				break;
			}
			
		}while(choose!=4);
	}
	static void showMenu() {
		System.out.println("1.Nhap thong tin sach");
		System.out.println("2.In thong tin sach");
		System.out.println("3.Kiem tra so luong sach");
		System.out.println("4.Thoat");
		System.out.print("Lua chon: ");
	}
}
