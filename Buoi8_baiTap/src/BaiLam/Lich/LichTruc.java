package BaiLam.Lich;

import BaiLam.Enum.Local;
import BaiLam.Enum.TimeWork;
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
