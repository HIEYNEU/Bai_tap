package BaiLam.Emun;

public enum TimeWork {
	Tiet1("6h45-8h",1),
	Tiet2("8h-9h15",2),
	Tiet3("9h15-10h30",3),
	Tiet4("10h30-11h45",4),
	Tiet5("13h-14h15",5),
	Tiet6("14h15-15h30",6),
	Tiet7("15h30-16h45",7);
	public final String lable;
	public final int x;
	private TimeWork(String lable,int x) {
		this.lable=lable;
		this.x=x;
	}
	static public TimeWork getTimeWork(int x) {
		for(TimeWork i:values()) {
			if(i.x==x) {
				return i;
			}
		}
		return null;
	}
}
