package BaiTapBuoi6;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
	static private List<Book>inventory=new ArrayList<Book>();
	private Inventory() {
		
	}
	static public List<Book> getInventory(){
		return inventory;
	}
	static public boolean addToInventory(Book book) {
		inventory.add(book);
		return true;
	}
	static public boolean isValid(int id) {
		for(Book i:inventory) {
			if(i.getId()==id) return true;
		}
		return false;
	}
	static public Book getBook(int id) {
		return inventory.get(id-1);
	}
	static public boolean addQuarity(int id,int quarity) {
		if(!Inventory.isValid(id)) {
			System.out.println("San pham khong ton tai");
			return false;
		}
		else {
			Inventory.getBook(id).addQuarity(quarity);
		}
		return true;
	}
}

