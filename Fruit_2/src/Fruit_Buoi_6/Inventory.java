package Fruit_Buoi_6;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	static private List<Fruit>inventory=new ArrayList<Fruit>();
	private Inventory() {
		
	}
	static public List<Fruit> getInStance(){
		return inventory;
	}
	static public boolean addToInventory(Fruit fruit) {
		inventory.add(fruit);
		return true;
	}
	static public boolean isValid(int id) {
		for(Fruit i:inventory) {
			if(i.getId()==id) return true;
		}
		return false;
	}
	static public Fruit getFruit(int id) {
		return inventory.get(id-1);
	}
	static public boolean addQuarity(int id,int Quarity) {
		if(Inventory.isValid(id)==false) {
			System.out.println("San pham khong ton tai");
			return false;
		}
		else {
			Inventory.getFruit(id).addQuarity(Quarity);
		}
		return true;
	}
}
