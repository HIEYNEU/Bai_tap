package Fruit_Buoi_6;

public class Orange extends Fruit{
	private double weidth;
	private String vitamin;
	public Orange(String name, double price, int quarity, double weidth, String vitamin) {
		super(name, price, quarity);
		this.weidth = weidth;
		this.vitamin = vitamin;
	}
	public double getWeidth() {
		return weidth;
	}
	@Override
	public void vitamin() {
		// TODO Auto-generated method stub
		System.out.println("Vitamin cua "+this.getName()+" la "+this.vitamin);
	}
	
}
