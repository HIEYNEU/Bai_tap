package BaiLam.Lich;
import BaiLam.Emun.TimeWork;
import BaiLam.Emun.PhongHoc;
public class LichDay extends LichLamViec{
	private PhongHoc phongHoc;
	private TimeWork time;
	public LichDay(int id, int phongHoc,int time) {
		super(id);
		this.phongHoc = PhongHoc.getPhongHoc(phongHoc);
		this.time=TimeWork.getTimeWork(time);
	}
	
	public PhongHoc getPhongHoc() {
		return phongHoc;
	}


	@Override
	public TimeWork Time() {
		// TODO Auto-generated method stub
		return time;
	}
	
}
