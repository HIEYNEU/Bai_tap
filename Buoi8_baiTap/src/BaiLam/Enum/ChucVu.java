package BaiLam.Enum;

public enum ChucVu {
	bv("Bao ve",1),
	vs("Ve sinh",2),
	gv("Giang vien",3),
	sv("Sinh vien",4);
	public final String lable;
	public final int x;
	private ChucVu(String lable,int x) {
		this.lable=lable;
		this.x=x;
	}
	static public ChucVu getChucVu(int x) {
		for(ChucVu i:values()) {
			if(i.x==x) {
				return i;
			}
		}
		return null;
	}
}
