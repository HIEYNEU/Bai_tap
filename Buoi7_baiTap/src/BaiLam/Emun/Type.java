package BaiLam.Emun;

public enum Type {
	cq("Chinh quy",1),
	lt("Lien thong",2),
	tc("Tai chuc",3);
	public final String lable;
	public final int x;
	private Type(String lable,int x) {
		this.lable=lable;
		this.x=x;
	}
	static public Type getType(int x) {
		for(Type i:values()) {
			if(i.x==x) {
				return i;
			}
		}
		return null;
	}
}
