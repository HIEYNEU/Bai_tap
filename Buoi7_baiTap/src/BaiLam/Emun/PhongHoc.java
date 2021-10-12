package BaiLam.Emun;

public enum PhongHoc {
	A305("A305",1),
	A604("A604",2),
	A614("A614",3);
	public final String lable;
	public final int x;
	private PhongHoc(String lable,int x) {
		this.lable=lable;
		this.x=x;
	}
	static public PhongHoc getPhongHoc(int x) {
		for(PhongHoc i:values()) {
			if(i.x==x) {
				return i;
			}
		}
		return null;
	}
}
