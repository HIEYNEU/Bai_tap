package BaiTap;

import java.util.HashMap;
import java.util.Map;

import BaiTapBuoi6.Book;
import BaiTapBuoi6.Inventory;

public class Cart {
	static private Map<Integer,Integer>cart=new HashMap<Integer,Integer>();
	static Map<Integer,Integer>getInstance(){
		return cart;
	}
	static public void pay(int id,int quarity,int needpay) {
		Book tmp=Inventory.getBook(id);
		needpay=needpay+(tmp.getGia()*quarity);
		System.out.println("Thanh tien: "+needpay);
	}
	static public boolean addToCart(int id,int quarity) {
		if(!Inventory.isValid(id)) {
			System.out.println("San pham khong ton tai");
			return false;
		}
		else {
			Book tmp=Inventory.getBook(id);
			if(tmp.getSoluong()<quarity) {
				System.out.println("Khong du hang");
				return false;
			}
			else {
				int oldQuarity=tmp.getSoluong();
				tmp.setSoluong(oldQuarity-quarity);
			}
			if(cart.containsKey(id)) {
				int oldQuarity=cart.get(id);
				cart.put(id, oldQuarity+quarity);
				System.out.println(tmp.getTensach()+" "+cart.get(id));
			}
			else {
				cart.put(id, quarity);
				System.out.println(tmp.getTensach()+" "+cart.get(id));
			}
			return true;
		}
	}
}
