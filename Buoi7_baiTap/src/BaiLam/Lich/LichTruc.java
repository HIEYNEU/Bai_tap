package BaiLam.Lich;

import BaiLam.Emun.TimeWork;
import BaiLam.Emun.Local;
public class LichTruc extends LichLamViec{
	private Local diaDiem;
	private TimeWork time;
	public LichTruc(int id, int diaDiem, int time) {
		super(id);
		this.diaDiem = Local.getLocal(diaDiem);
		this.time = TimeWork.getTimeWork(time);
	}
	public Local getDiaDiem() {
		return diaDiem;
	}
	@Override
	public TimeWork Time() {
		// TODO Auto-generated method stub
		return time;
	}
	
	
}
