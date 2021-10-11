package BaiLam.Lich;
import BaiLam.Emun.PhongHoc;
import BaiLam.Emun.TimeWork;
public class LichHoc extends LichLamViec{
	private int phongHoc;
	public LichHoc(int id, int time,int phongHoc) {
		super(id, time);
		// TODO Auto-generated constructor stub
		this.phongHoc=phongHoc;
	}
	
	public int getPhongHoc() {
		return phongHoc;
	}
	public void Phong() {
		PhongHoc x;
		if(this.getPhongHoc()==1) {
			x=PhongHoc.A305;
			System.out.println(x);
		}
		else if(this.getPhongHoc()==2) {
			x=PhongHoc.A604;
			System.out.println(x);
		}
		else if(this.getPhongHoc()==3) {
			x=PhongHoc.A614;
			System.out.println(x);
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
