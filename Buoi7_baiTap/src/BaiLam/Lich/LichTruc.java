package BaiLam.Lich;

import BaiLam.Emun.TimeWork;
import BaiLam.Emun.Local;
public class LichTruc extends LichLamViec{
	private int diaDiem;

	public LichTruc(int id, int time, int diaDiem) {
		super(id, time);
		this.diaDiem = diaDiem;
	}

	public int getDiaDiem() {
		return diaDiem;
	}
	public void Local() {
		Local x;
		if(this.getDiaDiem()==1) {
			x=Local.cbv;
			System.out.println(x.lable);
		}
		else if(this.getDiaDiem()==2) {
			x=Local.nvs;
			System.out.println(x.lable);
		}
		else if(this.getDiaDiem()==3) {
			x=Local.t1;
			System.out.println(x.lable);
		}
		else if(this.getDiaDiem()==4) {
			x=Local.t2;
			System.out.println(x.lable);
		}
		else if(this.getDiaDiem()==5) {
			x=Local.t3;
			System.out.println(x.lable);
		}
	}
	@Override
	public void Time() {
		// TODO Auto-generated method stub
		TimeWork x;
		if(this.getTime()==1) {
			x=TimeWork.Tiet1;
			System.out.println(x.lable);
		}
		else if(this.getTime()==2) {
			x=TimeWork.Tiet2;
			System.out.println(x.lable);
		}
		else if(this.getTime()==3) {
			x=TimeWork.Tiet3;
		}
		else if(this.getTime()==4) {
			x=TimeWork.Tiet4;
			System.out.println(x.lable);
		}
		else if(this.getTime()==5) {
			x=TimeWork.Tiet5;
			System.out.println(x.lable);
		}
		else if(this.getTime()==6) {
			x=TimeWork.Tiet6;
			System.out.println(x.lable);
		}
		else if(this.getTime()==7) {
			x=TimeWork.Tiet7;
			System.out.println(x.lable);
		}
	}
	
}
