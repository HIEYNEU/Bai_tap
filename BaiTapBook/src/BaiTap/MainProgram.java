package BaiTap;

import java.util.List;
import java.util.Scanner;

public class MainProgram {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				System.out.println("Chon loai sach muon nhap");
				int type;
				showBookMenu();
				type=Integer.parseInt(in.nextLine());
				switch(type) {
				case 1:
					System.out.print("Nhap vao so sach van hoc: ");
					sosach=Integer.parseInt(in.nextLine());
					for(int i=0;i<sosach;i++) {
						System.out.print("Nhap vao ten sach: ");
						String name=in.nextLine();
						System.out.print("Nhap vao tac gia: ");
						String tacGia=in.nextLine();
						System.out.print("Nhap vao gia: ");
						int gia=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao so luong: ");
						int slg=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao so lan tai ban: ");
						int taiban=Integer.parseInt(in.nextLine());
						Inventory.addToInventory(new VanHoc(name,tacGia,gia,slg,taiban));
					}
					break;
				case 2:
					System.out.print("Nhap vao so sach khoa hoc: ");
					sosach=Integer.parseInt(in.nextLine());
					for(int i=0;i<sosach;i++) {
						System.out.print("Nhap vao ten sach: ");
						String name=in.nextLine();
						System.out.print("Nhap vao tac gia: ");
						String tacGia=in.nextLine();
						System.out.print("Nhap vao gia: ");
						int gia=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao so luong: ");
						int slg=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao nam xuat ban: ");
						int xuatban=Integer.parseInt(in.nextLine());
						Inventory.addToInventory(new KhoaHoc(name,tacGia,gia,slg,xuatban));
					}
					break;
				case 3:
					System.out.print("Nhap vao so sach ngoai van: ");
					sosach=Integer.parseInt(in.nextLine());
					for(int i=0;i<sosach;i++) {
						System.out.print("Nhap vao ten sach: ");
						String name=in.nextLine();
						System.out.print("Nhap vao tac gia: ");
						String tacGia=in.nextLine();
						System.out.print("Nhap vao gia: ");
						int gia=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao so luong: ");
						int slg=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao ma ISBN: ");
						String isbn=in.nextLine();
						Inventory.addToInventory(new NgoaiVan(name,tacGia,gia,slg,isbn));
					}
					break;
				}
				break;
			case 2:
				List<Book> book=Inventory.getInventory();
				for(Book i:book) {
					System.out.println("ID: "+i.getId());
					System.out.println("Ten sach: "+i.getTensach());
					System.out.println("Tac gia: "+i.getTacGia());
					System.out.println("So luong: "+i.getSoluong());
					System.out.println("Gia: "+i.getGia());
					if(i instanceof VanHoc) {
						VanHoc tmp=(VanHoc) i;
						System.out.println("So lan tai ban: "+tmp.getTaiban());
					}
					else if(i instanceof KhoaHoc) {
						KhoaHoc tmp=(KhoaHoc) i;
						System.out.println("Nam xuat ban: "+tmp.getNamxuatban());
					}
					else {
						NgoaiVan tmp=(NgoaiVan) i;
						System.out.println("Ma ISBN: "+tmp.getISBN());
					}
				}
				break;
			case 3:
				System.out.println("Danh sach cac loai sach");
				List<Book> x=Inventory.getInventory();
				for(Book i:x) {
					System.out.println(i.getId()+" "+i.getTensach()+" "+i.getSoluong());
				}
				System.out.println("--------------------------------------------------------");
				System.out.print("Nhap ID loai sach muon them vao gio hang: ");
				int ID=Integer.parseInt(in.nextLine());
				System.out.print("Nhap so luong muon them vao gio hang: ");
				int quarity=Integer.parseInt(in.nextLine());
				Cart.addToCart(ID, quarity);
				break;
			case 4:
				System.out.println("Danh sach cac loai sach");
				List<Book> kho=Inventory.getInventory();
				for(Book i:kho) {
					System.out.println(i.getId()+" "+i.getTensach()+" "+i.getSoluong());
				}
				System.out.println("--------------------------------------------------------");
				System.out.print("Nhap ID loai sach muon them vao gio hang: ");
				int id=Integer.parseInt(in.nextLine());
				System.out.print("Nhap so luong muon them vao gio hang: ");
				int Quarity=Integer.parseInt(in.nextLine());
				Inventory.addQuarity(id, Quarity);
				break;
			case 5:
				System.out.println("Thoat");
				break;
				default:
					System.out.println("Nhap lai");
			}
		}while(choose!=5);
	}
	static public void showMenu() {
		System.out.println("1.Nhap vao kho sach");
		System.out.println("2.In ra kho sach");
		System.out.println("3.Tao gio hang");
		System.out.println("4.Them sach vao kho");
		System.out.println("5.Thoat");
		System.out.print("Chon: ");
	}
	static public void showBookMenu() {
		System.out.println("1.Sach van hoc");
		System.out.println("2.Sach khoa hoc");
		System.out.println("3.Sach ngoai van");
		System.out.print("Chon: ");
	}
	static int sosach;
}

