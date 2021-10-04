package Fruit_Buoi_6;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(in.nextLine());
			switch(choose) {
			case 1:
				System.out.println("Chon loai qua");
				System.out.println("1.Tao");
				System.out.println("2.Cam");
				System.out.println("3.Chuoi");
				int typeFruit=Integer.parseInt(in.nextLine());
				switch(typeFruit) {
				case 1:
					System.out.print("Nhap so luong tao: ");
					int numApple=Integer.parseInt(in.nextLine());
					for(int i=0;i<numApple;i++) {
						System.out.print("Nhap vao ten: ");
						String name=in.nextLine();
						System.out.print("Nhap vao gia: ");
						double price=Double.parseDouble(in.nextLine());
						System.out.print("Nhap vao so luong: ");
						int quarity=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao luong duong: ");
						int sugar=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao vitamin: ");
						String vitamin=in.nextLine();
						Inventory.addToInventory(new Apple(name,price,quarity,sugar,vitamin));
					}
					break;
				case 2:
					System.out.print("Nhap so luong cam: ");
					int numOrange=Integer.parseInt(in.nextLine());
					for(int i=0;i<numOrange;i++) {
						System.out.print("Nhap vao ten: ");
						String name=in.nextLine();
						System.out.print("Nhap vao gia: ");
						double price=Double.parseDouble(in.nextLine());
						System.out.print("Nhap vao so luong: ");
						int quarity=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao khoi luong: ");
						int weight=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao vitamin: ");
						String vitamin=in.nextLine();
						Inventory.addToInventory(new Orange(name,price,quarity,weight,vitamin));
					}
					break;
				case 3:
					System.out.print("Nhap so luong chuoi: ");
					int numBanana=Integer.parseInt(in.nextLine());
					for(int i=0;i<numBanana;i++) {
						System.out.print("Nhap vao ten: ");
						String name=in.nextLine();
						System.out.print("Nhap vao gia: ");
						double price=Double.parseDouble(in.nextLine());
						System.out.print("Nhap vao so luong: ");
						int quarity=Integer.parseInt(in.nextLine());
						System.out.print("Nhap vao do can bang kali: ");
						double kali=Double.parseDouble(in.nextLine());
						System.out.print("Nhap vao vitamin: ");
						String vitamin=in.nextLine();
						Inventory.addToInventory(new Banana(name,price,quarity,kali,vitamin));
					}
					break;
				}
				
				break;
			case 2:
				System.out.println("Danh sach cac mat hang");
				List<Fruit> fruit=Inventory.getInStance();
				for(Fruit i:fruit) {
					System.out.println(i.getId()+" "+i.getName()+" "+i.getQuarity());
				}
				System.out.println("------------------------------------------------------");
				System.out.println("Nhap vao id va so luong loai hang muon them");
				System.out.print("Id: ");
				int id=Integer.parseInt(in.nextLine());
				System.out.print("So luong: ");
				int quarity=Integer.parseInt(in.nextLine());
				Cart.addToCart(id, quarity);
				break;
			case 3:
				System.out.println("Danh sach cac mat hang");
				List<Fruit> kho=Inventory.getInStance();
				for(Fruit i:kho) {
					System.out.println(i.getName()+" "+i.getQuarity());
				}
				System.out.println("------------------------------------------------------");
				System.out.println("Nhap id mat hang muon them: ");
				int msp=Integer.parseInt(in.nextLine());
				System.out.println("Nhap so luong mat hang muon them: ");
				int slg=Integer.parseInt(in.nextLine());
				Inventory.addQuarity(msp,slg);
				break;
			case 4:
				List<Fruit>inventory=Inventory.getInStance();
				for(Fruit i:inventory) {
					System.out.println("Ten: "+i.getName());
					System.out.println("Gia: "+i.getPrice());
					System.out.println("So luong: "+i.getQuarity());
					if(i instanceof Apple) {
						Apple tmp=(Apple) i;
						System.out.println("Luong duong: "+tmp.getSugar());
						tmp.vitamin();
					}
					else if(i instanceof Orange) {
						Orange tmp=(Orange) i;
						System.out.println("Khoi luong: "+tmp.getWeidth());
						tmp.vitamin();
					}
					else {
						Banana tmp = (Banana) i;
						System.out.println("Do can bang kali: "+tmp.getKali());
						tmp.vitamin();
					}
				}
				break;
			case 5:
				System.out.println("Thoat");
				break;
				default:
					System.out.println("Nhap lai");
					break;
			}
		}while(choose!=5);
	}
	static public void showMenu() {
		System.out.println("1.Nhap loai hoa qua");
		System.out.println("2.Tao gio hang");
		System.out.println("3.Nhap kho");
		System.out.println("4.In");
		System.out.println("5.Thoat");
		System.out.print("Chon: ");
	}
	static String vitamin;
	static Fruit i;
}

