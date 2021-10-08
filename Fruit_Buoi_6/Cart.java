package Fruit_Buoi_6;
import java.util.HashMap;
import java.util.Map;

public class Cart {
	static private Map<Integer,Integer>cart=new HashMap<Integer,Integer>();
	static public Map<Integer,Integer> getInstance() {
		return cart;
	}
	static public boolean addToCart(int id, int quarity) {
		if(Inventory.isValid(id)==false) {
			System.out.println("San pham khong ton tai");
			return false;
		}
		Fruit tmp=Inventory.getFruit(id);
		if(tmp.getQuarity()<quarity) {
			System.out.println("Khong con du so luong");
			return false;
		}
		else {
			int oldQuarity=tmp.getQuarity();
			tmp.setQuarity(oldQuarity-quarity);
		}
		if(cart.containsKey(id)) {
			int oldQuarity=cart.get(id);
			cart.put(id,oldQuarity+quarity);
			System.out.println(tmp.getName()+" "+oldQuarity+quarity);
		}
		else {
			cart.put(id, quarity);
			System.out.println(tmp.getName()+" "+quarity);
		}
		return true;
	}
}
