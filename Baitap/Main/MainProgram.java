package Baitap.Main;

import java.util.ArrayList;
import java.util.Scanner;

import Baitap.Main.st1.CPU;
import Baitap.Main.st1.Hang;
import Baitap.Main.st1.Laptop;
import Baitap.Main.st1.Mainbroad;
import Baitap.Main.st1.RAM;

public class MainProgram {
	static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Hang> lst_Hang = new ArrayList<Hang>();
		ArrayList<RAM> lst_ram=new ArrayList<RAM>();
		ArrayList<CPU> lst_cpu = new ArrayList<CPU>();
		ArrayList<Mainbroad> lst_mainbroad =new ArrayList<Mainbroad>();
		ArrayList<Laptop> lst_lap = new ArrayList<Laptop>();
		showMenu();
		int choose;
		do {
			choose=Integer.parseInt(in.nextLine());
			switch(choose){
			case 1:
				int numHang=Integer.parseInt(in.nextLine());
				for(int i=0;i<numHang;i++) {
					System.out.print("Nhập vào tên hãng: ");
					String name=in.nextLine();
					lst_Hang.add(new Hang(name));
				}
				int numRam=Integer.parseInt(in.nextLine());
				for(int i=0;i<numRam;i++) {
					System.out.print("Nhập vào id ram: ");
					String id=in.nextLine();
					System.out.print("Nhập vào số lượng ram: ");
					int luong=Integer.parseInt(in.nextLine());
					System.out.print("Nhập vào tên ram: ");
					String name=in.nextLine();
					System.out.print("Hãng thứ: ");
					int HangSo=Integer.parseInt(in.nextLine());
					lst_ram.add(new RAM(id,name,lst_Hang.get(HangSo),luong));
				}
				int numCPU=Integer.parseInt(in.nextLine());
				for(int i=0;i<numCPU;i++) {
					System.out.print("Nhập vào id cpu: ");
					String id=in.nextLine();
					System.out.print("Nhập vào tên cpu: ");
					String name=in.nextLine();
					System.out.print("Hãng thứ: ");
					int HangSo=Integer.parseInt(in.nextLine());
					System.out.print("Nhập vào số lượng: ");
					int luong=Integer.parseInt(in.nextLine());
					lst_cpu.add(new CPU(name,lst_Hang.get(HangSo),id,luong));
				}
				int numMainbroad=Integer.parseInt(in.nextLine());
				for(int i=0;i<numMainbroad;i++) {
					System.out.print("Nhập vào id mainbroad: ");
					String id=in.nextLine();
					System.out.print("Nhập vào tên mainbroad: ");
					String name=in.nextLine();
					System.out.print("Hãng thứ: ");
					int HangSo=Integer.parseInt(in.nextLine());
					System.out.print("Nhập vào số lượng mainbroad: ");
					int luong=Integer.parseInt(in.nextLine());
					lst_mainbroad.add(new Mainbroad(id,name,lst_Hang.get(HangSo),luong));
				}
				int numLap=Integer.parseInt(in.nextLine());
				for(int i=0;i<numLap;i++) {
					System.out.print("Nhập vào id laptop: ");
					String id=in.nextLine();
					System.out.print("Nhập vào tên laptop: ");
					String name=in.nextLine();
					System.out.print("Hãng thứ: ");
					int HangSo=Integer.parseInt(in.nextLine());
					System.out.print("Loại Ram số: ");
					int RamSo=Integer.parseInt(in.nextLine());
					System.out.print("Loại CPU số: ");
					int CPUSo=Integer.parseInt(in.nextLine());
					System.out.print("Loại mainbroad số: ");
					int MainSo=Integer.parseInt(in.nextLine());
					System.out.print("Nhập vào số lượng laptop: ");
					int luong=Integer.parseInt(in.nextLine());
					lst_lap.add(new Laptop(id,name,lst_Hang.get(HangSo),lst_ram.get(RamSo),lst_cpu.get(CPUSo),lst_mainbroad.get(MainSo),luong));
				}
				break;
			case 2:
				System.out.print("Nhập số thứ tự laptop muốn in: ");
				int n=Integer.parseInt(in.nextLine());
				System.out.printf("%s %s %s %s %s %s %d",lst_lap.get(n).getId(),lst_lap.get(n).getName(),lst_lap.get(n).getHang(),lst_lap.get(n).getRam(),lst_lap.get(n).getCpu(),
						lst_lap.get(n).getMainbroad(),lst_lap.get(n).getSoLuong());
				break;
			case 3:
				System.out.print("Nhập vào loại Ram muốn build: ");
				int nRam=Integer.parseInt(in.nextLine());
				System.out.print("Nhập vào loại cpu muốn build: ");
				int nCPU=Integer.parseInt(in.nextLine());
				System.out.print("Nhập vào loại main muốn build: ");
				int nMain=Integer.parseInt(in.nextLine());
				while(!(lst_ram.get(nRam).getId().equals(lst_cpu.get(nCPU).getId())&&lst_ram.get(nRam).getId().equals(lst_mainbroad.get(nMain).getId()))
						&&lst_ram.get(nRam).soLuong<=0&&lst_cpu.get(nCPU).soLuong<=0&&lst_mainbroad.get(nMain).soLuong<=0) {
					System.out.println("Linh kiện không phù hợp hoặc đã hết hàng");
					System.out.print("Nhập vào loại Ram muốn build: ");
					nRam=Integer.parseInt(in.nextLine());
					System.out.print("Nhập vào loại cpu muốn build: ");
					nCPU=Integer.parseInt(in.nextLine());
					System.out.print("Nhập vào loại main muốn build: ");
					nMain=Integer.parseInt(in.nextLine());
				}
				lst_mainbroad.get(nMain).soLuong--;
				lst_ram.get(nRam).soLuong--;
				lst_cpu.get(nCPU).soLuong--;
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Nhập lại");
				break;
			}
			
		}while(choose!=4);

	}
	static void showMenu() {
		System.out.println("1.Nhập vào các loại laptop và linh kiện có trong kho");
		System.out.println("2.In ra loại laptop thứ x trong kho");
		System.out.println("3.Khách build laptop");
		System.out.println("4.Thoát");
		System.out.print("Lựa chọn: ");
	}

}
