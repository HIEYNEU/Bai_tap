package BaiLam.Enum;

public enum Local {
	cbv("Cong bao ve",1),
	t1("Tang 1",3),
	t2("Tang 2",4),
	t3("Tang 3",5),
	nvs("Nha ve sinh",2);
	public final String lable;
	public final int x;
	private Local(String lable,int x) {
		this.lable=lable;
		this.x=x;
	}
	static public Local getLocal(int x) {
		for(Local i:values()) {
			if(i.x==x) {
				return i;
			}
		}
		return null;
	}
}
