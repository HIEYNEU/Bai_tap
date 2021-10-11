package BaiLam.Emun;

public enum TimeWork {
	Tiet1("6h45-8h"),
	Tiet2("8h-9h15"),
	Tiet3("9h15-10h30"),
	Tiet4("10h30-11h45"),
	Tiet5("13h-14h15"),
	Tiet6("14h15-15h30"),
	Tiet7("15h30-16h45");
	public String lable;
	private TimeWork(String lable) {
		this.lable=lable;
	}
}
