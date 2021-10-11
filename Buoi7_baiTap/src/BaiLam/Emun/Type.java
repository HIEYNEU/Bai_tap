package BaiLam.Emun;

public enum Type {
	cq("Chinh quy"),
	lt("Lien thong"),
	tc("Tai chuc");
	public String lable;
	private Type(String lable) {
		this.lable=lable;
	}
}
