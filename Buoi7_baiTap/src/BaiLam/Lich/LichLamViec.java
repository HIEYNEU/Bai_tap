package BaiLam.Lich;

public abstract class LichLamViec {
	private int id;
	private int Time;
	public LichLamViec(int id, int time) {
		super();
		this.id = id;
		Time = time;
	}
	public int getId() {
		return id;
	}
	public int getTime() {
		return Time;
	}
	abstract public void Time();
}
