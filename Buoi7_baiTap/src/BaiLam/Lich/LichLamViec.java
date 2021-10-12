package BaiLam.Lich;

import BaiLam.Emun.TimeWork;

public abstract class LichLamViec {
	private int id;
	public LichLamViec(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	abstract public TimeWork Time();
}
