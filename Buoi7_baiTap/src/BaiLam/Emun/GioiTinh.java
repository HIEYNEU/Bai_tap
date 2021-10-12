package BaiLam.Emun;

public enum GioiTinh {
	Nam("Nam",1),
	Nu("Nu",2),
	khac("Khac",3);
	public final String lable;
	public final int x;
	private GioiTinh (String lable,int x) {
		this.lable=lable;
		this.x=x;
	}
	public static GioiTinh getGioiTinh(int x) {
		for(GioiTinh i: values()) {
			if(i.x==x)return i;
		}
		return null;
	}
}
