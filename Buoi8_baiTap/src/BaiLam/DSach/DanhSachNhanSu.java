package BaiLam.DSach;
import java.util.ArrayList;
import java.util.List;

import BaiLam.Infor.Infor;
public class DanhSachNhanSu {
	static private List<Infor>lst=new ArrayList<Infor>();
	private DanhSachNhanSu() {
		
	}
	static public List<Infor> getInfor(){
		return lst;
	}
	static public boolean addToList(Infor infor) {
		lst.add(infor);
		return true;
	}
	static public boolean isValid(int id) {
		for(Infor i:lst) {
			if(i.getId()==id) {
				return true;
			}
		}
		return false;
	}
	static public Infor getInforFromList(int id) {
		return lst.get(id-1);
	}
}
